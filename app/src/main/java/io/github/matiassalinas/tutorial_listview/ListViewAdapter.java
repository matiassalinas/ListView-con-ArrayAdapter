package io.github.matiassalinas.tutorial_listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ListViewAdapter extends ArrayAdapter {
    private Context context;
    private ArrayList<Persona> personas;

    public ListViewAdapter(Context context, ArrayList<Persona> personas){
        super(context,0,personas);
        this.context = context;
        this.personas = personas;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        //Obtenemos la persona
        Persona persona = (Persona) getItem(position);
        //R.layout.item_listview es el layout de cada uno de los elementos del ListView
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_listview, parent, false);
        }
        //Obtenemos los TextView del layout
        TextView itemTextView_1 = (TextView) convertView.findViewById(R.id.itemTextView_1);
        TextView itemTextView_2 = (TextView) convertView.findViewById(R.id.itemTextView_2);
        //Asignamos valores a los TextView, con la información de Persona
        itemTextView_1.setText(persona.getNombreCompleto());
        itemTextView_2.setText(persona.getEdad()+" años");
        //Retornamos la View
        return convertView;
    }
}
