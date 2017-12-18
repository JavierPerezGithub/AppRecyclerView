package com.javi.apprecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv;
    LinearLayoutManager llm;
    MiAdaptador ma;
    Datos datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv = (RecyclerView)findViewById(R.id.mi_reclycler_view);

        rv.setHasFixedSize(true);

        llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);
        datos = new Datos();
        ma = new MiAdaptador(datos.getLista());

        ma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "Seleccionada la opción " + rv.indexOfChild(v)
                        +" con el valor "
                        +((MiAdaptador.MiViewHolder)rv.getChildViewHolder(v)).getTextoSup().getText();
                Toast.makeText(MainActivity.this,msg,Toast.LENGTH_SHORT).show();
            }
        });
        rv.setAdapter(ma);
    }
}
