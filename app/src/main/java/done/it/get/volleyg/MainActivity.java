package done.it.get.volleyg;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import done.it.get.volleyg.utility.Constants;
import done.it.get.volleyg.utility.DataFormat;
import done.it.get.volleyg.utility.VolleyInstance;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btnGetWeatherInfo).setOnClickListener(this);
        tvResult = (TextView) findViewById(R.id.tvResult);
    }

    @Override
    public void onClick(View v) {
        tvResult.setText("");
      /*  VolleyInstance.getInstance(this).addToRequestQueue(
                new StringRequest(Request.Method.GET,
                        Constants.weatherUrl,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                tvResult.setText("Result:"+response);
                            }
                        }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(MainActivity.this, "ErrorResponse", Toast.LENGTH_SHORT).show();
                    }
                }).setTag(MainActivity.this));
        */

        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, Constants.weatherUrl, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try {
                            JSONArray weatherData = response.getJSONArray("WeatherData");
                            JSONArray towns = weatherData.getJSONObject(0).getJSONArray("town");
                            JSONArray town_GT = towns.getJSONObject(0).getJSONArray("town_GT");
                            JSONObject info = town_GT.getJSONObject(0).getJSONObject("info");
                            String input = town_GT.toString();
                            Log.d("TEST", "input:" + input);
                            Gson gson = new Gson();
//                            WeatherData mData = gson.fromJson(info.toString(),WeatherData.class);
                            DataFormat.town_GT_inner[] mData = gson.fromJson(input, DataFormat.town_GT_inner[].class);

                            tvResult.setText("Gson:" + mData[2].getcurrent().getDataTime());


                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        jsonObjectRequest.setTag(this);


        VolleyInstance.getInstance(this).addToRequestQueue(jsonObjectRequest);

    }

    @Override
    protected void onPause() {
        VolleyInstance.getInstance(this).cancelByTag(this);
        super.onPause();

    }

}
