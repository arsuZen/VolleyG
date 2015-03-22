package done.it.get.volleyg;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.StringTokenizer;

import done.it.get.volleyg.utility.Constants;
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
        VolleyInstance.getInstance(this).addToRequestQueue(
                new StringRequest(Request.Method.GET,
                        Constants.weatherUrl,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                try {
                                    JSONObject parent = new JSONObject(response);
                                    JSONArray weatherData = parent.getJSONArray("WeatherData");
                                    JSONArray town = weatherData.getJSONArray("Town");

                                } catch (JSONException e) {
                                    e.printStackTrace();
                                }
                                tvResult.setText("Result:" + result);
                            }
                        }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(MainActivity.this, "ErrorResponse", Toast.LENGTH_SHORT).show();
                    }
                }).setTag(MainActivity.this));
    }

    @Override
    protected void onPause() {
        VolleyInstance.getInstance(this).cancelByTag(this);
        super.onPause();

    }

}
