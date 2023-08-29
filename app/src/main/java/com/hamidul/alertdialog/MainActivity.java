package com.hamidul.alertdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button,btnNo,btnYes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);

//        View view = LayoutInflater.from(MainActivity.this).inflate(R.layout.dialog,null);
//        AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this);
//
//        alertDialog.setView(view);
//
//        btnNo = (Button) view.findViewById(R.id.no);
//        btnYes = (Button) view.findViewById(R.id.yes);
//
//        final AlertDialog dialog = alertDialog.create();
//
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
//                dialog.show();
//            }
//        });
//
//        btnNo.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                dialog.cancel();
//                Toast.makeText(MainActivity.this, "No", Toast.LENGTH_SHORT).show();
//            }
//        });



    }

    public void loadExitDialog(){
        View view = LayoutInflater.from(MainActivity.this).inflate(R.layout.dialog,null);
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this);

        alertDialog.setView(view);

        btnNo = (Button) view.findViewById(R.id.no);
        btnYes = (Button) view.findViewById(R.id.yes);

        final AlertDialog dialog = alertDialog.create();

        btnNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.cancel();

            }
        });

        btnYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.show();
    }

    @Override
    public void onBackPressed() {
        loadExitDialog();
    }
}