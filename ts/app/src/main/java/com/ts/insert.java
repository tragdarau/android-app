package com.ts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class insert extends AppCompatActivity {

    private String server="192.168.2.70:8081";


    private com.android.volley.RequestQueue mr;
    private String url="http://192.168.2.70:8081/tsoulos/insert.php?";
    ; private TextView tv;
    private StringRequest sr;
    private EditText onoma;
    private EditText eponymo;
    private EditText desc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert);


        onoma=(EditText)findViewById(R.id.onoma);
        eponymo=(EditText)findViewById(R.id.eponymo);
        desc=(EditText)findViewById(R.id.desc);

        Button button;

        tv=(TextView)findViewById(R.id.textViewin);

        button=(Button)findViewById(R.id.button5);
        button.setOnClickListener(new View.OnClickListener(){

                                      @Override
                                      public void onClick(View v){
                                          sendd();

                                      }

                                  }
        );





    }


    private void sendd(){

        mr= Volley.newRequestQueue(insert.this);

        String onom=onoma.getText().toString();
        String epon=eponymo.getText().toString();
        String desc2=desc.getText().toString();

        url="http://"+server+"/tsoulos/insert.php?fname="+onom+"&lname="+epon+"&mathima="+desc2;


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
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
