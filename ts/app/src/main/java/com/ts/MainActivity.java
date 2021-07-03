package com.ts;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.*;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class MainActivity extends AppCompatActivity {
    private com.android.volley.RequestQueue mr;
private String url="http://192.168.2.70:8081/tsoulos/insert.php?fname=df&lname=nokl&mathima=les";
; private  TextView tv;
    private StringRequest sr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }


        });
        Button button;

        tv=(TextView)findViewById(R.id.textView);

        button=(Button)findViewById(R.id.buttonid);
        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                sendd();
            }

                                  }
        );





    }


    private void sendd(){

        mr= Volley.newRequestQueue(MainActivity.this);
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
