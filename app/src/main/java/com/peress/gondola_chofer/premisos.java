package com.peress.gondola_chofer;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.v7.app.AlertDialog;
import android.util.Log;

/**
 * Created by matt on 18-11-17.
 */

public final class premisos {
    public static boolean permisoUbicacion(Context ctx){
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
            if(ctx==null)
                Log.e("MAPERROR","erroaaaaaaaaaar");
            if(ctx.checkSelfPermission(android.Manifest.permission.ACCESS_FINE_LOCATION)
                    != PackageManager.PERMISSION_GRANTED &&
                    ctx.checkSelfPermission(android.Manifest.permission.ACCESS_COARSE_LOCATION)
                            != PackageManager.PERMISSION_GRANTED){
                return false;
            }
        }
        return true;
    }

    public static void AlertNoGps(final Activity ctx) {
        AlertDialog alert;
        final AlertDialog.Builder builder = new AlertDialog.Builder(ctx);
        builder.setMessage("El sistema GPS esta desactivado, ¿Desea activarlo?")
                .setCancelable(false)
                .setPositiveButton("Activar", new DialogInterface.OnClickListener() {
                    public void onClick(@SuppressWarnings("unused") final DialogInterface dialog, @SuppressWarnings("unused") final int id) {
                        ctx.startActivityForResult(new Intent(android.provider.Settings.ACTION_LOCATION_SOURCE_SETTINGS),222);
                    }
                })
                .setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                    public void onClick(final DialogInterface dialog, @SuppressWarnings("unused") final int id) {
                        dialog.cancel();
                    }
                });
        alert = builder.create();
        alert.show();
    }
}
