package com.example.appppe4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    private Button button_consultation;

    private Button button_reservation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        this.button_consultation=(Button) findViewById(R.id.button_consultation);

        this.button_consultation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent( MenuActivity.this, ConsultationReservation.class);
                startActivity(intent);

            }
        });

        this.button_reservation=(Button) findViewById(R.id.button_reservation);

        this.button_reservation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent( MenuActivity.this, ReservationActivity.class);
                startActivity(intent);

            }
        });
    }


}