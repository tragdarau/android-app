package com.ts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.content.*;
public class fist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fist);

        Button button;


        button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {

                                      @Override
                                      public void onClick(View v) {

                                          Intent intent = new Intent(fist.this, insert.class);
                                          //  EditText editText = (EditText) findViewById(R.id.editText);
                                          //String message = editText.getText().toString();
                                          //intent.putExtra(EXTRA_MESSAGE, message);
                                          startActivity(intent);

                                      }

                                  }
        );


        Button buttons;


        buttons = (Button) findViewById(R.id.buttonsel);
        buttons.setOnClickListener(new View.OnClickListener() {

                                       @Override
                                       public void onClick(View v) {

                                           Intent intent = new Intent(fist.this, select.class);
                                           //  EditText editText = (EditText) findViewById(R.id.editText);
                                           //String message = editText.getText().toString();
                                           //intent.putExtra(EXTRA_MESSAGE, message);
                                           startActivity(intent);

                                       }

                                   }
        );

        Button buttond;


        buttond = (Button) findViewById(R.id.buttondel);
        buttond.setOnClickListener(new View.OnClickListener() {

                                       @Override
                                       public void onClick(View v) {

                                           Intent intent = new Intent(fist.this, delete.class);
                                           //  EditText editText = (EditText) findViewById(R.id.editText);
                                           //String message = editText.getText().toString();
                                           //intent.putExtra(EXTRA_MESSAGE, message);
                                           startActivity(intent);

                                       }

                                   }
        );

    }
}




