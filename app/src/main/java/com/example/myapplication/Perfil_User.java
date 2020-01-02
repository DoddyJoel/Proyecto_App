package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Perfil_User extends AppCompatActivity {
    private ListView lista;
    private ArrayList<String>nombre;
    private EditText editText;
    private Button button;
    //private ArrayAdapter ADP;
    private ArrayList<String> arrayList= new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil__user);
        nombre=new ArrayList<>();
        editText=findViewById(R.id.nombre_mochila);
        button=findViewById(R.id.registrar_mochila);
        lista=findViewById(R.id.lista_mochila);
        //ADP.notifyDataSetChanged();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!editText.getText().toString().isEmpty())
                {
                    if (nombre.contains(editText.getText().toString()))
                    {
                        Toast.makeText(getApplicationContext(),"Ya se encuentra registrado",Toast.LENGTH_LONG).show();
                    }
                    else
                    {
                        nombre.add(editText.getText().toString());
                        ArrayAdapter adapter = new ArrayAdapter<String>(Perfil_User.this, R.layout.list_item, nombre);
                        lista.setAdapter(adapter);
                        adapter.notifyDataSetChanged();
                    }
                }
            }

        });
    }
}
