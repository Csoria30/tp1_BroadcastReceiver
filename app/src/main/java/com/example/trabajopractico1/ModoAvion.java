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
        boolean avionState = intent.getBooleanExtra("state",false);

        if(avionState){
            Toast.makeText(context, "Modo Avion Habilitado", Toast.LENGTH_LONG).show();
            Intent llamada = new Intent(Intent.ACTION_DIAL);
            llamada.setData(Uri.parse("tel:2664553747"));
            llamada.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(llamada);
        }else{
            Toast.makeText(context, "Modo Avion deshabilitado", Toast.LENGTH_LONG).show();
        }
    }


}