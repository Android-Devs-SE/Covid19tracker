package com.covid19tracker.covid19tracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import com.Adapter;
import com.Model;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class countryActivity extends AppCompatActivity {

    public static List<Model> modelList = new ArrayList<>();

    Model model;
    Adapter adapter;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country);

        listView = findViewById(R.id.listView);
        fetchData();


    }

    private void fetchData() {

        String url = "https://api.covid19india.org/state_district_wise.json";

        StringRequest request = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

                try {
                    // Creating JSON Object
                    JSONObject object = new JSONObject(response);

                    // From that object we are fetching data
                    JSONObject object1 = object.getJSONObject("Andhra Pradesh");
                    JSONObject object2 = object1.getJSONObject("districtData");
                    JSONObject object3 = object2.getJSONObject("Anantapur");
                    JSONObject object4 = object3.getJSONObject("delta");



                    String active = object3.getString("active");
                    String confirmed = object3.getString("confirmed");
                    String deceased = object3.getString("deceased");
                    String recovered = object3.getString("recovered");


                    String confInc = object4.getString("confirmed");
                    String confDec = object4.getString("deceased");
                    String confRec = object4.getString("recovered");
                    model = new Model("Anantapur", confirmed, deceased, recovered, active,
                            confInc, confDec, confRec);
                    // placing data into the app using AdapterClass
                    modelList.add(model);



                    object3 = object2.getJSONObject("Chittoor");

                    // From that object we are fetching data
                    active = object3.getString("active");
                    confirmed = object3.getString("confirmed");
                    deceased = object3.getString("deceased");
                    recovered = object3.getString("recovered");
                    object4 = object3.getJSONObject("delta");
                    confInc = object4.getString("confirmed");
                    confDec = object4.getString("deceased");
                    confRec = object4.getString("recovered");

                    model = new Model("Chittoor", confirmed, deceased, recovered, active,
                            confInc, confDec, confRec);
                    // placing data into the app using AdapterClass
                    modelList.add(model);


                    object3 = object2.getJSONObject("Y.S.R. Kadapa");

                    // From that object we are fetching data
                    active = object3.getString("active");
                    confirmed = object3.getString("confirmed");
                    deceased = object3.getString("deceased");
                    recovered = object3.getString("recovered");
                    object4 = object3.getJSONObject("delta");
                    confInc = object4.getString("confirmed");
                    confDec = object4.getString("deceased");
                    confRec = object4.getString("recovered");

                    model = new Model("Y.S.R. Kadapa", confirmed, deceased, recovered, active,
                            confInc, confDec, confRec);
                    // placing data into the app using AdapterClass
                    modelList.add(model);

                    object3 = object2.getJSONObject("S.P.S. Nellore");

                    // From that object we are fetching data
                    active = object3.getString("active");
                    confirmed = object3.getString("confirmed");
                    deceased = object3.getString("deceased");
                    recovered = object3.getString("recovered");
                    object4 = object3.getJSONObject("delta");
                    confInc = object4.getString("confirmed");
                    confDec = object4.getString("deceased");
                    confRec = object4.getString("recovered");

                    model = new Model("S.P.S. Nellore", confirmed, deceased, recovered, active,
                            confInc, confDec, confRec);
                    // placing data into the app using AdapterClass
                    modelList.add(model);



                    object3 = object2.getJSONObject("East Godavari");

                    // From that object we are fetching data
                    active = object3.getString("active");
                    confirmed = object3.getString("confirmed");
                    deceased = object3.getString("deceased");
                    recovered = object3.getString("recovered");
                    object4 = object3.getJSONObject("delta");
                    confInc = object4.getString("confirmed");
                    confDec = object4.getString("deceased");
                    confRec = object4.getString("recovered");

                    model = new Model("East Godavari", confirmed, deceased, recovered, active,
                            confInc, confDec, confRec);
                    // placing data into the app using AdapterClass
                    modelList.add(model);

                    object3 = object2.getJSONObject("Guntur");

                    // From that object we are fetching data
                    active = object3.getString("active");
                    confirmed = object3.getString("confirmed");
                    deceased = object3.getString("deceased");
                    recovered = object3.getString("recovered");
                    object4 = object3.getJSONObject("delta");
                    confInc = object4.getString("confirmed");
                    confDec = object4.getString("deceased");
                    confRec = object4.getString("recovered");

                    model = new Model("Guntur", confirmed, deceased, recovered, active,
                            confInc, confDec, confRec);
                    // placing data into the app using AdapterClass
                    modelList.add(model);

                    object3 = object2.getJSONObject("Krishna");

                    // From that object we are fetching data
                    active = object3.getString("active");
                    confirmed = object3.getString("confirmed");
                    deceased = object3.getString("deceased");
                    recovered = object3.getString("recovered");
                    object4 = object3.getJSONObject("delta");
                    confInc = object4.getString("confirmed");
                    confDec = object4.getString("deceased");
                    confRec = object4.getString("recovered");

                    model = new Model("Krishna", confirmed, deceased, recovered, active,
                            confInc, confDec, confRec);
                    // placing data into the app using AdapterClass
                    modelList.add(model);

                    object3 = object2.getJSONObject("Kurnool");

                    // From that object we are fetching data
                    active = object3.getString("active");
                    confirmed = object3.getString("confirmed");
                    deceased = object3.getString("deceased");
                    recovered = object3.getString("recovered");
                    object4 = object3.getJSONObject("delta");
                    confInc = object4.getString("confirmed");
                    confDec = object4.getString("deceased");
                    confRec = object4.getString("recovered");

                    model = new Model("Kurnool", confirmed, deceased, recovered, active,
                            confInc, confDec, confRec);
                    // placing data into the app using AdapterClass
                    modelList.add(model);

                    object3 = object2.getJSONObject("Prakasam");

                    // From that object we are fetching data
                    active = object3.getString("active");
                    confirmed = object3.getString("confirmed");
                    deceased = object3.getString("deceased");
                    recovered = object3.getString("recovered");
                    object4 = object3.getJSONObject("delta");
                    confInc = object4.getString("confirmed");
                    confDec = object4.getString("deceased");
                    confRec = object4.getString("recovered");

                    model = new Model("Prakasam", confirmed, deceased, recovered, active,
                            confInc, confDec, confRec);
                    // placing data into the app using AdapterClass
                    modelList.add(model);



                    object3 = object2.getJSONObject("Srikakulam");

                    // From that object we are fetching data
                    active = object3.getString("active");
                    confirmed = object3.getString("confirmed");
                    deceased = object3.getString("deceased");
                    recovered = object3.getString("recovered");
                    object4 = object3.getJSONObject("delta");
                    confInc = object4.getString("confirmed");
                    confDec = object4.getString("deceased");
                    confRec = object4.getString("recovered");

                    model = new Model("Srikakulam", confirmed, deceased, recovered, active,
                            confInc, confDec, confRec);
                    // placing data into the app using AdapterClass
                    modelList.add(model);

                    object3 = object2.getJSONObject("Visakhapatnam");

                    // From that object we are fetching data
                    active = object3.getString("active");
                    confirmed = object3.getString("confirmed");
                    deceased = object3.getString("deceased");
                    recovered = object3.getString("recovered");
                    object4 = object3.getJSONObject("delta");
                    confInc = object4.getString("confirmed");
                    confDec = object4.getString("deceased");
                    confRec = object4.getString("recovered");

                    model = new Model("Visakapatnam", confirmed, deceased, recovered, active,
                            confInc, confDec, confRec);
                    // placing data into the app using AdapterClass
                    modelList.add(model);

                    object3 = object2.getJSONObject("Vizianagaram");

                    // From that object we are fetching data
                    active = object3.getString("active");
                    confirmed = object3.getString("confirmed");
                    deceased = object3.getString("deceased");
                    recovered = object3.getString("recovered");
                    object4 = object3.getJSONObject("delta");
                    confInc = object4.getString("confirmed");
                    confDec = object4.getString("deceased");
                    confRec = object4.getString("recovered");

                    model = new Model("Vizianagaram", confirmed, deceased, recovered, active,
                            confInc, confDec, confRec);
                    // placing data into the app using AdapterClass
                    modelList.add(model);

                    object3 = object2.getJSONObject("West Godavari");

                    // From that object we are fetching data
                    active = object3.getString("active");
                    confirmed = object3.getString("confirmed");
                    deceased = object3.getString("deceased");
                    recovered = object3.getString("recovered");
                    object4 = object3.getJSONObject("delta");
                    confInc = object4.getString("confirmed");
                    confDec = object4.getString("deceased");
                    confRec = object4.getString("recovered");

                    model = new Model("West Godavari", confirmed, deceased, recovered, active,
                            confInc, confDec, confRec);
                    // placing data into the app using AdapterClass
                    modelList.add(model);





                    adapter = new Adapter(countryActivity.this, modelList);
                    listView.setAdapter(adapter);

                    // In case of error it will run
                }   catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                // In case of error it will run
                Toast.makeText(countryActivity.this, error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(request);
    }
}