package pe.openlab.marker_clustering_gdg.ui.events;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.maps.android.clustering.Cluster;
import com.google.maps.android.clustering.ClusterManager;
import com.google.maps.android.clustering.view.DefaultClusterRenderer;
import com.google.maps.android.ui.IconGenerator;

import pe.openlab.marker_clustering_gdg.R;
import pe.openlab.marker_clustering_gdg.data.entity.EventTO;

public class MarkerRenderer extends DefaultClusterRenderer<EventTO> {

    private IconGenerator mIconGenerator;
    private IconGenerator mClusterIconGenerator;
    private final ImageView mImageView;
    private final ImageView mClusterImageView;
    private Drawable icMarker;

    public MarkerRenderer(Context context, EventView mapView, GoogleMap mMap, ClusterManager mClusterManager) {
        super(context, mMap, mClusterManager);

        icMarker = context.getResources().getDrawable(R.drawable.ic_gdg);

        mIconGenerator = new IconGenerator(context);
        mClusterIconGenerator = new IconGenerator(context);

        View itemCluster = mapView.getLayoutInflater().inflate(R.layout.item_cluster, null);
        mClusterIconGenerator.setContentView(itemCluster);
        mClusterImageView = itemCluster.findViewById(R.id.image);

        mImageView = new ImageView(context);
        mIconGenerator.setContentView(mImageView);
    }

    @Override
    protected void onBeforeClusterItemRendered(EventTO event, MarkerOptions markerOptions) {
        mImageView.setImageDrawable(icMarker);
        Bitmap icon = mIconGenerator.makeIcon();
        markerOptions.icon(BitmapDescriptorFactory.fromBitmap(icon));
    }

    @Override
    protected void onBeforeClusterRendered(Cluster<EventTO> cluster, MarkerOptions markerOptions) {
        mClusterImageView.setImageDrawable(icMarker);
        Bitmap icon = mClusterIconGenerator.makeIcon(String.valueOf(cluster.getSize()));
        markerOptions.icon(BitmapDescriptorFactory.fromBitmap(icon));
    }

    @Override
    protected boolean shouldRenderAsCluster(Cluster cluster) {
        return cluster.getSize() > 1;
    }
}