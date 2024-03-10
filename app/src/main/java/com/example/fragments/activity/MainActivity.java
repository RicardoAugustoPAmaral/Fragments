package com.example.fragments.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fragments.R;
import com.example.fragments.fragment.ContatosFragment;
import com.example.fragments.fragment.ConversasFragment;

public class MainActivity extends AppCompatActivity {
    private Button buttonConversa, buttonContato;
    private ConversasFragment conversasFragment;
    private ContatosFragment contatosFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //getSupportActionBar().getElevation(0);

        buttonContato = findViewById(R.id.buttonContatos);
        buttonConversa = findViewById(R.id.buttonConversas);

        conversasFragment = new ConversasFragment();
        contatosFragment = new ContatosFragment();

        //Configurar objeto para o Fragmento
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frameConteudo,conversasFragment);
        transaction.commit();

        buttonContato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contatosFragment = new ContatosFragment();

                FragmentTransaction transaction1 = getSupportFragmentManager().beginTransaction();
                transaction1.replace(R.id.frameConteudo,contatosFragment);
                transaction1.commit();
            }
        });


        buttonConversa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                conversasFragment = new ConversasFragment();

                FragmentTransaction transaction1 = getSupportFragmentManager().beginTransaction();
                transaction1.replace(R.id.frameConteudo,conversasFragment);
                transaction1.commit();
            }
        });


    }
}