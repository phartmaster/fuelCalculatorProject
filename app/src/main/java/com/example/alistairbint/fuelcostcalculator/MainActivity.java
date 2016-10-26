package com.example.alistairbint.fuelcostcalculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linear_layout);
    }



        public void onNewJourneyClick(View v){

            // Display new journey toast message
             //Toast.makeText(this, "New Journey button clicked", Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(this, newJourneyActivity.class);
            startActivity(intent);
    }

         public void onOpenJourneyClick(View v){

            // Display open journey toast message
            Toast.makeText(this, "Open Journey button clicked", Toast.LENGTH_SHORT).show();
    }

         public void onSaveJourneyClick(View v){

            // Display save journey toast message
            Toast.makeText(this, "Save Journey button clicked", Toast.LENGTH_SHORT).show();
    }



}
