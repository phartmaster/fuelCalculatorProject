package com.example.alistairbint.fuelcostcalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        public void onButtonClick(View v) {

            EditText miles = (EditText) findViewById(R.id.editMiles);
            EditText mpg = (EditText) findViewById(R.id.editMpg);
            EditText costPerLitre = (EditText) findViewById(R.id.editCostPerLitre);
            TextView txtTotalCost = (TextView) findViewById(R.id.textView5);
            TextView txtCost = (TextView) findViewById(R.id.textView4);

            double dblMiles = Double.parseDouble(miles.getText().toString());
            double dblMpg = Double.parseDouble(mpg.getText().toString());
            double dblCost = Double.parseDouble(costPerLitre.getText().toString());

            double dblTotalLitres = (dblMiles / dblMpg) * 4.56;
            double dblTotalCost = dblTotalLitres * dblCost;

            txtCost.setVisibility(TextView.VISIBLE);
            txtTotalCost.setText(String.format("%.2f", dblTotalCost));





        }


}
