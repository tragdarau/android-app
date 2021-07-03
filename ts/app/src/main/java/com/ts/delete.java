package com.ts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class delete extends AppCompatActivity {
private EditText am;
    private TextView tv;
    private String url; private StringRequest sr;    private com.android.volley.RequestQueue mr;
private String server="192.168.2.70:8081";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete);




        am=(EditText)findViewById(R.id.am);

        Button button;

        tv=(TextView)findViewById(R.id.delview);

        button=(Button)findViewById(R.id.delit);
        button.setOnClickListener(new View.OnClickListener(){

                                      @Override
                                      public void onClick(View v){
                                          sendd();

                                      }

                                  }
        );





    }


    private void sendd(){

        mr= Volley.newRequestQueue(delete.this);

        String amm=am.getText().toString();


        url="http://"+server+"/tsoulos/delete.php?am="+amm;


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
                tv.setText("wrong");


            }
        });
        mr.add(sr);
    }







    }

