package pe.openlab.marker_clustering_gdg.ui.events;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import pe.openlab.marker_clustering_gdg.R;
import pe.openlab.marker_clustering_gdg.util.ActivityUtils;

/**
 * Created by Bryam Soto on 24/11/2017.
 */

public class EventActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);

        EventView eventView = (EventView) getSupportFragmentManager().findFragmentById(R.id.body_events);
        if (eventView == null) {
            eventView = EventView.newInstance();
            ActivityUtils.addFragmentToActivity(getSupportFragmentManager(), eventView, R.id.body_events);
        }

    }
}
