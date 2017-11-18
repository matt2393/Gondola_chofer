package com.peress.gondola_chofer;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by matt on 18-11-17.
 */

public class Ubicacion implements Parcelable {
    private double lat,lng;

    public Ubicacion() {
    }

    public Ubicacion(double lat, double lng) {
        this.lat = lat;
        this.lng = lng;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeDouble(this.lat);
        dest.writeDouble(this.lng);
    }

    protected Ubicacion(Parcel in) {
        this.lat = in.readDouble();
        this.lng = in.readDouble();
    }

    public static final Parcelable.Creator<Ubicacion> CREATOR = new Parcelable.Creator<Ubicacion>() {
        @Override
        public Ubicacion createFromParcel(Parcel source) {
            return new Ubicacion(source);
        }

        @Override
        public Ubicacion[] newArray(int size) {
            return new Ubicacion[size];
        }
    };
}
