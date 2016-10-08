package com.example.drbeacon;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Date;

import drbeacon.models.Historic;
import drbeacon.models.User;

public class PatientRecords extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private TextView txt_name;
    private TextView txt_dob;
    private TextView txt_sex;
    private static String LOG_TAG = "CardViewActivity";
    private static User USR = new User("Donald", "Trump", new Date(1946, 06,14), "M");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.patient_records);

        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new MyRecyclerViewAdapterForPatientRecords(getDataSet());
        mRecyclerView.setAdapter(mAdapter);

        txt_name = (TextView) findViewById(R.id.txt_name);
        txt_dob = (TextView) findViewById(R.id.txt_dob);
        txt_sex = (TextView) findViewById(R.id.txt_sex);

        txt_name.setText(USR.getFirstName() + " " + USR.getLastName());
        txt_dob.setText("14/06/1946");
        txt_sex.setText(USR.getSex());

    }

    private ArrayList<Historic> getDataSet() {
        ArrayList results = new ArrayList<Historic>();

        for (int i = 0; i < this.USR.getConditionLabels().size(); i++) {
            results.add(new Historic(this.USR.getConditionLabels().get(i), this.USR.getHistoryDescriptions().get(i)));
        }
        return results;
    }


}
