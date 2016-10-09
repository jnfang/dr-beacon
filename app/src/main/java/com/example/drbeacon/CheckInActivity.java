package com.example.drbeacon;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.TextView;

import com.example.utils.HTTPGet;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.concurrent.ExecutionException;

public class CheckInActivity extends AppCompatActivity {

    private TextView mTextView;
    private JSONObject obj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_in);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        HTTPGet request = new HTTPGet();

        mTextView = (TextView) findViewById(R.id.queue_size_label);

        String result = "";

        try {
            obj = new JSONObject(new HTTPGet().execute(new String[]{"http://10.192.118.246:3000/api/enqueue"}).get());
            result = obj.getString("queue");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }

        mTextView.setText(result);
    }

//    @Override
//    public void onReceive(Context context, Intent intent){
//        HashMap<String, String> intent_extras = intent.getExtras();
//    }

}
