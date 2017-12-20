package com.javi.apprecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    ImageView iv;
    TextView tvNombre;
    TextView tvDescripcion;
    private ItemLista il;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        iv = (ImageView)findViewById(R.id.ivImagen);
        tvNombre = (TextView)findViewById(R.id.tvNombre);
        tvDescripcion = (TextView)findViewById(R.id.tvDescripcion);

        il = getIntent().getParcelableExtra("ITEM");

        iv.setImageResource(il.getIdImagen());
        tvNombre.setText(il.getTxtSuperior());
        tvDescripcion.setText(il.getTxtInferior());

    }
}
