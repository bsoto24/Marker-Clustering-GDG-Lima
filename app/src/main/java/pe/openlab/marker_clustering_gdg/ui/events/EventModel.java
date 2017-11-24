package pe.openlab.marker_clustering_gdg.ui.events;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import pe.openlab.marker_clustering_gdg.data.entity.EventTO;

/**
 * Created by Bryam Soto on 24/11/2017.
 */

public class EventModel implements Event.Model {

    private Event.Presenter presenter;

    public EventModel(Event.Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void showEvents() {
        Log.e("MARKERS", "Mostrando los eventos 3");
        presenter.showMarkers(findAllEvents());
    }

    @Override
    public List<EventTO> findAllEvents() {
        List<EventTO> eventos = new ArrayList<>();
        eventos.add(new EventTO("Evento 1", -12.0700534, -77.0417081));
        eventos.add(new EventTO("Evento 2", -12.0593718, -77.045644));
        eventos.add(new EventTO("Evento 3", -12.0690113, -77.0271513));
        eventos.add(new EventTO("Evento 4", -12.0593718, -77.045644));
        eventos.add(new EventTO("Evento 5", -12.0700534, -77.0417081));
        eventos.add(new EventTO("Evento 6", -12.0593718, -77.045644));
        eventos.add(new EventTO("Evento 7", -12.0690113, -77.0271513));
        eventos.add(new EventTO("Evento 8", -12.0593718, -77.045644));
        eventos.add(new EventTO("Evento 1", -12.0700534, -77.0417081));
        eventos.add(new EventTO("Evento 1", -12.0593718, -77.045644));
        eventos.add(new EventTO("Evento 1", -12.0690113, -77.0271513));
        eventos.add(new EventTO("Evento 1", -12.0593718, -77.045644));
        eventos.add(new EventTO("Evento 1", -11.951660, -76.996424));
        eventos.add(new EventTO("Evento 1", -11.951660, -76.996424));
        eventos.add(new EventTO("Evento 1", -11.951660, -76.996424));
        eventos.add(new EventTO("Evento 1", -11.951660, -76.996424));
        eventos.add(new EventTO("Evento 1", -11.951660, -76.996424));
        eventos.add(new EventTO("Evento 1", -11.951660, -76.996424));
        eventos.add(new EventTO("Evento 1", -11.973284, -77.081289));
        eventos.add(new EventTO("Evento 1", -11.973284, -77.081289));
        eventos.add(new EventTO("Evento 1", -11.973284, -77.081289));
        eventos.add(new EventTO("Evento 1", -11.973284, -77.081289));
        eventos.add(new EventTO("Evento 1", -12.065870, -77.006172));
        eventos.add(new EventTO("Evento 1", -12.110880, -77.001147));
        eventos.add(new EventTO("Evento 1", -12.062560, -77.024949));
        eventos.add(new EventTO("Evento 1", -12.062560, -77.024949));
        eventos.add(new EventTO("Evento 1", -12.062560, -77.024949));
        eventos.add(new EventTO("Evento 1", -12.062560, -77.024949));
        eventos.add(new EventTO("Evento 1", -12.005576, -77.064240));
        eventos.add(new EventTO("Evento 1", -12.005576, -77.064240));
        eventos.add(new EventTO("Evento 1", -12.071577, -77.023051));
        eventos.add(new EventTO("Evento 1", -12.071577, -77.023051));
        eventos.add(new EventTO("Evento 1", -12.071577, -77.023051));
        eventos.add(new EventTO("Evento 1", -12.071577, -77.023051));
        eventos.add(new EventTO("Evento 1", -12.071577, -77.023051));
        eventos.add(new EventTO("Evento 1", -11.871402, -77.013901));
        eventos.add(new EventTO("Evento 1", -11.871402, -77.013901));
        eventos.add(new EventTO("Evento 1", -11.871402, -77.013901));
        eventos.add(new EventTO("Evento 1", -11.871402, -77.013901));
        eventos.add(new EventTO("Evento 1", -11.871402, -77.013901));
        eventos.add(new EventTO("Evento 1", -12.097034, -77.069482));
        eventos.add(new EventTO("Evento 1", -12.084956, -76.995536));
        eventos.add(new EventTO("Evento 1", -12.108109, -77.054440));
        eventos.add(new EventTO("Evento 1", -12.165863, -77.031786));
        eventos.add(new EventTO("Evento 1", -12.165873, -77.031796));
        eventos.add(new EventTO("Evento 1", -12.165883, -77.031806));
        eventos.add(new EventTO("Evento 1", -12.165893, -77.035716));
        eventos.add(new EventTO("Evento 1", -12.165803, -77.032726));
        eventos.add(new EventTO("Evento 1", -12.165813, -77.031736));
        eventos.add(new EventTO("Evento 1", -12.165823, -77.036746));
        eventos.add(new EventTO("Evento 1", -12.165833, -77.031756));
        eventos.add(new EventTO("Evento 1", -12.165843, -77.033766));
        eventos.add(new EventTO("Evento 1", -12.165963, -77.036786));
        eventos.add(new EventTO("Evento 1", -12.165063, -77.031886));
        eventos.add(new EventTO("Evento 1", -12.165205, -77.033047));
        eventos.add(new EventTO("Evento 1", -12.165305, -77.039147));
        eventos.add(new EventTO("Evento 1", -12.165405, -77.033247));
        eventos.add(new EventTO("Evento 1", -12.165505, -77.032347));
        eventos.add(new EventTO("Evento 1", -12.165605, -77.031447));

        Log.e("MARKERS", "Eventos agregados");
        return eventos;
    }
}
