package com.example.dialogapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.buttonSuccess).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this, R.style.AlertDialogTheme);
                view = LayoutInflater.from(MainActivity.this).inflate(R.layout.layout_sucess_dialog, (ConstraintLayout) findViewById(R.id.layoutDialog));
                builder.setView(view);
                ((TextView)view.findViewById(R.id.textTitle)).setText(getResources().getString(R.string.success_title));
                ((TextView)view.findViewById(R.id.textMessage)).setText(getResources().getString(R.string.dummy_text));
                ((Button)view.findViewById(R.id.buttonAction)).setText(getResources().getString(R.string.okay));
                ((ImageView)view.findViewById(R.id.imageIcon)).setImageResource(R.drawable.ic_success);

                final AlertDialog alertDialog = builder.create();
                view.findViewById(R.id.buttonAction).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alertDialog.dismiss();
                    }
                });
                if (alertDialog.getWindow() != null){
                    alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
                }
                alertDialog.show();

            }
        });

        findViewById(R.id.buttonWarning).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this, R.style.AlertDialogTheme);
                view = LayoutInflater.from(MainActivity.this).inflate(R.layout.layout_warning_dialog, (ConstraintLayout) findViewById(R.id.layoutDialog));
                builder.setView(view);
                ((TextView)view.findViewById(R.id.textTitle)).setText(getResources().getString(R.string.warning_title));
                ((TextView)view.findViewById(R.id.textMessage)).setText(getResources().getString(R.string.dummy_text));
                ((Button)view.findViewById(R.id.buttonYes)).setText(getResources().getString(R.string.yes));
                ((Button)view.findViewById(R.id.buttonNo)).setText(getResources().getString(R.string.no));

                ((ImageView)view.findViewById(R.id.imageIcon)).setImageResource(R.drawable.ic_warning);

                final AlertDialog alertDialog = builder.create();
                view.findViewById(R.id.buttonYes).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alertDialog.dismiss();
                        Toast.makeText(MainActivity.this, "yes", Toast.LENGTH_SHORT).show();
                    }
                });
                view.findViewById(R.id.buttonNo).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alertDialog.dismiss();
                        Toast.makeText(MainActivity.this, "No", Toast.LENGTH_SHORT).show();
                    }
                });
                if (alertDialog.getWindow() != null){
                    alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
                }
                alertDialog.show();
            }
        });

        findViewById(R.id.buttonError).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this, R.style.AlertDialogTheme);
                view = LayoutInflater.from(MainActivity.this).inflate(R.layout.layout_error_dialog, (ConstraintLayout) findViewById(R.id.layoutDialog));
                builder.setView(view);
                ((TextView)view.findViewById(R.id.textTitle)).setText(getResources().getString(R.string.error));
                ((TextView)view.findViewById(R.id.textMessage)).setText(getResources().getString(R.string.dummy_text));
                ((Button)view.findViewById(R.id.buttonAction)).setText(getResources().getString(R.string.okay));
                ((ImageView)view.findViewById(R.id.imageIcon)).setImageResource(R.drawable.ic_error);

                final AlertDialog alertDialog = builder.create();
                view.findViewById(R.id.buttonAction).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alertDialog.dismiss();
                    }
                });
                if (alertDialog.getWindow() != null){
                    alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
                }
                alertDialog.show();
            }
        });

    }
}