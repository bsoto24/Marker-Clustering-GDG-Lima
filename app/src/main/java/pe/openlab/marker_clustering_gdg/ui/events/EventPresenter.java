package pe.openlab.marker_clustering_gdg.ui.events;

import android.util.Log;

import java.util.List;

import pe.openlab.marker_clustering_gdg.data.entity.EventTO;

/**
 * Created by Bryam Soto on 24/11/2017.
 */

public class EventPresenter implements Event.Presenter {

    private Event.View view;
    private Event.Model model;

    public EventPresenter(Event.View view) {
        this.view = view;
        model = new EventModel(this);
    }

    @Override
    public void showMarkers(List<EventTO> eventos) {
        Log.e("MARKERS", "Mostrando los marcadores");
        view.showMarkers(eventos);
    }

    @Override
    public void showEvents() {
        Log.e("MARKERS", "Mostrando los eventos 2");
        model.showEvents();
    }
}
