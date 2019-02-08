package com.example.kei.leccionrecuof;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText sum;
Integer intentos=0;
Button btnValidar;
Integer int1,int2,int3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sum= (EditText) findViewById(R.id.sum);
        btnValidar= (Button) findViewById(R.id.calcular);
    }

    public void validar(View v){
        intentos= intentos+1;
        if(intentos<3){
            int numEntero = Integer.parseInt(sum.getText().toString());
            if(intentos ==1){
                int1=numEntero;
            }
            if(intentos ==2){
                int1=numEntero;
            }
            if(intentos ==3){
                int3=numEntero;
            }
            Log.d("Trae ",String.valueOf(numEntero));
            if(numEntero==5){
                Log.d("Trae ",String.valueOf(numEntero));


               MediaPlayer mp = MediaPlayer.create(this, R.raw.aplauso_corto);
                mp.start();

            }

       }
       else{
            btnValidar.setEnabled(false);


       }
    }


}
