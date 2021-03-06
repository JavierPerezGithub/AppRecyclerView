package com.javi.apprecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 21650521 on 18/12/2017.
 */

public class MiAdaptador extends RecyclerView.Adapter<MiAdaptador.MiViewHolder> implements View.OnClickListener {
    private ArrayList<ItemLista> datos;
    private View.OnClickListener listener;

    public MiAdaptador(ArrayList<ItemLista> datos) {
        this.datos = datos;
    }

    @Override
    public MiViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_layout, parent, false);
        v.setOnClickListener(this);
        MiViewHolder vh = new MiViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(MiViewHolder holder, int position) {
        holder.imagen.setImageResource(datos.get(position).getIdImagen());
        holder.textoSup.setText(datos.get(position).getTxtSuperior());
        holder.textoInf.setText(datos.get(position).getTxtInferior());
    }

    @Override
    public int getItemCount() {
        return datos.size();
    }

    @Override
    public void onClick(View v) {
        if(listener != null)
            listener.onClick(v);
    }

    public static class MiViewHolder extends RecyclerView.ViewHolder {
        private ImageView imagen;
        private TextView textoSup;
        private TextView textoInf;

        public ImageView getImagen() {
            return imagen;
        }

        public TextView getTextoSup() {
            return textoSup;
        }

        public TextView getTextoInf() {
            return textoInf;
        }

        public MiViewHolder(View view) {
            super(view);
            imagen = (ImageView) view.findViewById(R.id.imageView);
            textoSup = (TextView) view.findViewById(R.id.tvSuperior);
            textoInf = (TextView) view.findViewById(R.id.tvInferior);


        }

        public void bindListaItem(ItemLista li) {
            imagen.setImageResource(li.getIdImagen());
            textoSup.setText(li.getTxtSuperior());
            textoInf.setText(li.getTxtInferior());
        }
    }public void setOnClickListener(View.OnClickListener listener) {
        this.listener = listener;
    }

}
