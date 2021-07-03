package com.ts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;

import android.widget.*;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class select extends AppCompatActivity {
    private com.android.volley.RequestQueue mr;
    private String url="http://192.168.2.70:8081/tsoulos/select.php?AM=";

    private String server="192.168.2.70:8081";

    ; private TextView tv;
    private StringRequest sr;
    private EditText ed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);

    ed=(EditText)findViewById(R.id.editTexts);
    Button button;


    tv=(TextView)findViewById(R.id.textViews);

    button=(Button)findViewById(R.id.buttons);
        button.setOnClickListener(new View.OnClickListener(){

        @Override
        public void onClick(View v){
            String ad=ed.getText().toString();

            url="http://"+server+"/tsoulos/select.php?AM=";


            url=url+ad;

            sendd();
        }

    }
        );





}


    private void sendd(){

        mr= Volley.newRequestQueue(select.this);
        sr=new StringRequest(Request.Method.GET,url,new Response.Listener<String>() {

            @Override
            public void onResponse(String response) {
                //     Log.i(TAG)
                tv.setText(response);
                mr.stop();
            }
        },new Response.ErrorListener(){

            @Override
            public void onErrorResponse(VolleyError error){
                tv.setText("wrond");


            }
        });
        mr.add(sr);
    }

}
