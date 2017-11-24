package pe.openlab.marker_clustering_gdg.ui.login;

/**
 * Created by Bryam Soto on 24/11/2017.
 */

public interface Login {

    interface View {
        void loginSuccess();

        void loginError(String error);
    }

    interface Presenter {
        void loginSuccess();

        void loginError(String error);

        void loginUser(String user, String password);
    }

    interface Model {
        void loginUser(String user, String password);
    }

}
