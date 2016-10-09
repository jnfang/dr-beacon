package com.example.utils;

import android.os.AsyncTask;
import android.util.Log;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.Callable;

/**
 * Created by bogdanbuduroiu on 09/10/2016.
 */

public class HTTPGet extends AsyncTask<String, Void, String> {

    @Override
    protected String doInBackground(String... urls) {
        String response = "";

        URL url;
        HttpURLConnection urlConnection = null;

        try {
            url = new URL(urls[0]);
            Log.d("rest", "" + url);

            urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setRequestMethod("GET");

            int responseCode = urlConnection.getResponseCode();
            Log.d("rest", "" + responseCode);
            if (responseCode == HttpURLConnection.HTTP_OK){

                BufferedReader rd = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
                String line;
                while ((line = rd.readLine()) != null) {
                    response += line;
                }
//                    response = readStream(urlConnection.getInputStream());
                Log.d("rest", response);
            }
        }
        catch (Exception e){
            Log.e("rest", e.toString());
        }

//            Log.d("rest", response);

        return response;
    }

    @Override
    protected void onPostExecute(String result) {
//            Log.d("rest", result);

        super.onPostExecute(result);
    }
}
