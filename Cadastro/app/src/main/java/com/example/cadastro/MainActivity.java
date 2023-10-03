package com.example.cadastro;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    //private DatabaseReference minhaReferencia = FirebaseDatabase.getInstance().getReference();
    FirebaseDatabase database = FirebaseDatabase.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        database = FirebaseDatabase.getInstance();
        DatabaseReference pessoas = database.getReference("Pessoa");

        pessoas.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                Log.i("FIREBASE", snapshot.getValue().toString());
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        /*Clientes p = new Clientes();
        p.setId(1);
        p.setNome("Jorge");
        p.setTelefone(00000000);
        p.setRg(2090934);
        p.setEndereco("Rua Santo Amoaro");
        p.setNumero(89);
        p.setBairro("Vila Amêndoa");
        p.setComplemento("");
        p.setEstado("Minas Gerais");
        p.setCidade("Araçapuca da Terra");

        myRef.child("1").setValue(p);

        p.setNome("Carlos");
        p.setTelefone(567864536);
        p.setCpf(293463709);
        p.setRg(233540749);
        p.setEndereco("Moedor de Carne");
        p.setNumero(109);
        p.setBairro("Vila Paçoca");
        p.setComplemento("7");
        p.setEstado("São Paulo");
        p.setCidade("São Paulo");

        myRef.child("2").setValue(p);

        p.setNome("Gaybriel");
        p.setTelefone(36857-2957);
        p.setCpf(568735147);
        p.setRg(253573648);
        p.setEndereco("Rua Santo Migs");
        p.setNumero(69);
        p.setBairro("Vila Bentô");
        p.setComplemento("");
        p.setEstado("Rio de Janeiro");
        p.setCidade("Botafogo");

        myRef.child("3").setValue(p);*/

    }
}