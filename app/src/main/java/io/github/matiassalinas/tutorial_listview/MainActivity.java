package io.github.matiassalinas.tutorial_listview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listPersonas;
    private ArrayList<Persona> personas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listPersonas = (ListView) findViewById(R.id.tutorialListView);
        personas = new ArrayList<>();
        personas.add(new Persona("Matías","Salinas",22));
        personas.add(new Persona("Juan","Perez",30));
        personas.add(new Persona("Pedro","Rodríguez",14));
        personas.add(new Persona("Javier","Soto",18));
        personas.add(new Persona("Mario","Navarro",21));
        ListViewAdapter adapter = new ListViewAdapter(getBaseContext(),personas);
        listPersonas.setAdapter(adapter);
        listPersonas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String msg = "Se ha seleccionado a " + personas.get(position).getNombreCompleto();
                Toast.makeText(getApplicationContext(),msg, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
