package com.javi.apprecyclerview;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by 21650521 on 18/12/2017.
 */

public class ItemLista implements Parcelable {
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

    protected ItemLista(Parcel in) {
        idImagen = in.readInt();
        txtSuperior = in.readString();
        txtInferior = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(idImagen);
        dest.writeString(txtSuperior);
        dest.writeString(txtInferior);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<ItemLista> CREATOR = new Parcelable.Creator<ItemLista>() {
        @Override
        public ItemLista createFromParcel(Parcel in) {
            return new ItemLista(in);
        }

        @Override
        public ItemLista[] newArray(int size) {
            return new ItemLista[size];
        }
    };
}
