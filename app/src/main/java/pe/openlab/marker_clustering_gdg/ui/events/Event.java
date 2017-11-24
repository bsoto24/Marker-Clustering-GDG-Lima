package pe.openlab.marker_clustering_gdg.ui.events;

import java.util.List;

import pe.openlab.marker_clustering_gdg.data.entity.EventTO;

/**
 * Created by Bryam Soto on 24/11/2017.
 */

public interface Event {

    interface Model {
        void showEvents();
        List<EventTO> findAllEvents();
    }

    interface View {
        void showMarkers(List<EventTO> eventTOS);
    }

    interface Presenter {
        void showMarkers(List<EventTO> eventTOS);
        void showEvents();
    }
}
