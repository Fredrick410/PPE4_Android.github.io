package com.example.appppe4;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Spinner;

public class ReservationActivity extends AppCompatActivity {
    private EditText editTextText_dateReservation;
    private EditText editTextText_datePrevueStockage;
    private EditText editTextText_nbJoursDeStockagePrevu;
    private EditText editTextText_quantite;
    private EditText editTextText_etat;
    private EditText editText_numClient;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservation);
        this.editTextText_dateReservation=(EditText) findViewById(R.id.editTextText_dateReservation);
        this.editTextText_datePrevueStockage=(EditText) findViewById(R.id.editTextText_datePrevueReservation);
        this.editTextText_nbJoursDeStockagePrevu=(EditText) findViewById(R.id.editTextText_nbJoursDeStockagePrevu);
        this.editTextText_quantite=(EditText) findViewById(R.id.editText_quantité);
        this.editTextText_etat=(EditText)findViewById(R.id.editTextText_etat);
        this.editText_numClient=(EditText) findViewById(R.id.numClient);



    }

    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String dateReservation=editTextText_dateReservation.getText().toString();
        String datePrevueStockage=editTextText_datePrevueStockage.getText().toString();
        String nbJoursDeStokagePrevu=editTextText_nbJoursDeStockagePrevu.getText().toString();
        String quantite=editTextText_quantite.getText().toString();
        String etat=editTextText_etat.getText().toString();
        String numClient=editText_numClient.getText().toString();


        String insert = "insert into reservation (id, dateReservation, datePrevueStockage, nbJoursDeStockagePrevu,quantite,etat, numClient "
                + "values"
                + "("+null+",'"+dateReservation+"' , '"+datePrevueStockage+"' ,"+nbJoursDeStokagePrevu+" , "+quantite+", '"+etat+"',"+null+")";

    }

}


   /* for the reservation
   insert into reservation (id, dateReservation, datePrevueStockage, nbJoursDeStockagePrevu,quantite,etat, numClient)
    VALUES (null,'2001-12-14', '2001-10-18' , 8  , 90, 'demande',1)*/

