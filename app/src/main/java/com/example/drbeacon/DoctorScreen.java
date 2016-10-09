package com.example.drbeacon;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.example.utils.HTTPGet;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.concurrent.ExecutionException;

public class DoctorScreen extends AppCompatActivity {

    private TextView mTextView;
    private JSONObject obj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.doctor_screen);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mTextView = (TextView) findViewById(R.id.lbl_doctor_name);

        String result = "";

        try {
            obj = new JSONObject(new HTTPGet().execute(new String[]{"http://10.192.118.246:3000/api/doc"}).get());
            result = obj.getString("doctor");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }

        mTextView.setText(result);

    }

}
