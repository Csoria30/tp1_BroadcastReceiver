package com.example.trabajopractico1;

import static androidx.core.content.ContextCompat.startActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.widget.Toast;

public class ModoAvion extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        boolean avionState = intent.getBooleanExtra("connected",true);

        if(avionState){
            Intent llamada = new Intent(Intent.ACTION_DIAL);
            llamada.setData(Uri.parse("tel:2664705574"));
            llamada.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(llamada);
        }
    }


}