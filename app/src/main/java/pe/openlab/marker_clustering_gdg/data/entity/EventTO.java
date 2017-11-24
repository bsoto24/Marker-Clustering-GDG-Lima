package pe.openlab.marker_clustering_gdg.data.entity;

import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.clustering.ClusterItem;

/**
 * Created by Bryam Soto on 24/11/2017.
 */

public class EventTO implements ClusterItem {

    private String nombre;
    private double latitud;
    private double longitud;

    public EventTO(String nombre, double latitud, double longitud) {
        this.nombre = nombre;
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    @Override
    public LatLng getPosition() {
        return new LatLng(latitud, longitud);
    }
}
