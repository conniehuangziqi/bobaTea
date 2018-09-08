package com.example.doudou.connie_bobatea;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //declare sugar level button variable

    private Button buttonFullSugar;
    private Button buttonLessSugar;
    private Button buttonHalfSugar;
    private Button buttonQuarterSugar;
    private Button buttonNoSugar;

    private ImageView bobaTea;

    public int cups=1;
    private TextView number;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        }

    public void clickFull(View view){
        bobaTea = findViewById(R.id.idBobaTea);
        bobaTea.setImageResource(R.drawable.full);
    }


    public void clickLess(View view){
        bobaTea = findViewById(R.id.idBobaTea);
        bobaTea.setImageResource(R.drawable.less);
    }


    public void clickHalf(View view){
        bobaTea = findViewById(R.id.idBobaTea);
        bobaTea.setImageResource(R.drawable.half);
    }


    public void clickQuarter(View view){
        bobaTea = findViewById(R.id.idBobaTea);
        bobaTea.setImageResource(R.drawable.quarter);
    }


    public void clickNo(View view){
        bobaTea = findViewById(R.id.idBobaTea);
        bobaTea.setImageResource(R.drawable.no);
    }


    public void clickReset(View view){
        bobaTea = findViewById(R.id.idBobaTea);
        bobaTea.setImageResource(R.drawable.bobatea);
    }


    public void clickMinus(View view){
        cups--;
        number=findViewById(R.id.numberOfCups);
        if(cups<1) {
            number.setText("?");
            cups = 1;
        }
        else
            number.setText(String.valueOf(cups));

    }

    public void clickPlus(View view){
        cups++;
        number=findViewById(R.id.numberOfCups);
        number.setText(String.valueOf(cups));
    }

    public void clickCupReset(View view){
        cups=1;
        number=findViewById(R.id.numberOfCups);
        number.setText(String.valueOf(cups));
    }

}
