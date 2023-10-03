package com.example.login;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    private FirebaseAuth usuario = FirebaseAuth.getInstance();

    usuario.createUserWithEmailAndPassword("alessandrapensadora@gmail.com","a1234567").addOnCompleteListener(
            MainActivity.this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task < AuthResult > task) {

                if (task.isSucessful()) {

                    Toast.makeText(getApplicationContext(), "login efetuado com sucesso!", Toast.LENGTH_LONG).show();

                    }else{

                        Toast.makeText(getApplicationContext(),"Erro ao fazer login!",Toast.LENGTH_LONG).show();
                }
            }
        }
    );
}