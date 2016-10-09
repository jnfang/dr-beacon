package com.example.drbeacon;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.TextView;

import com.example.utils.HTTPGet;

import java.util.concurrent.ExecutionException;

public class CheckInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_in);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        HTTPGet request = new HTTPGet();

        try {
            String result = new HTTPGet().execute("http://10.192.118.246:3000/api/enqueue").get();
            Log.d("Result", result);
            TextView mTextView = (TextView) findViewById(R.id.queue_size_label);
            mTextView.setText(result);
        }
        catch (java.lang.InterruptedException e){
            Log.e("Error", e.getMessage());
        }
        catch (java.util.concurrent.ExecutionException e) {
            Log.e("Error", e.getMessage());
        }

    }

//    @Override
//    public void onReceive(Context context, Intent intent){
//        HashMap<String, String> intent_extras = intent.getExtras();
//    }

}
