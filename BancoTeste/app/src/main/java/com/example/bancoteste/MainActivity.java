package com.example.bancoteste;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private DatabaseReference ref = FirebaseDatabase.getInstance().getReference();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ref.child("Produtos").child("001").child("nome").setValue("coca-cola");
        ref.child("Produtos").child("001").child("descricao").setValue("Refrigerante");
        ref.child("Produtos").child("003").child("nome").setValue("coca-cola");
        ref.child("Produtos").child("003").child("descricao").setValue("Refrigerante");
        ref.child("Produtos").child("004").child("nome").setValue("Cafe");
        ref.child("Produtos").child("004").child("descricao").setValue("Bebida");
 }
}