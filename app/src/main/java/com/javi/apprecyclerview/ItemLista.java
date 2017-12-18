package com.javi.apprecyclerview;

/**
 * Created by 21650521 on 18/12/2017.
 */

public class ItemLista {
    public ItemLista(int idImagen, String txtSuperior, String txtInferior) {
        this.idImagen = idImagen;
        this.txtSuperior = txtSuperior;
        this.txtInferior = txtInferior;
    }

    private int idImagen;
    private String txtSuperior;

    public int getIdImagen() {
        return idImagen;
    }

    public String getTxtSuperior() {
        return txtSuperior;
    }

    public String getTxtInferior() {
        return txtInferior;
    }

    private String txtInferior;
}
