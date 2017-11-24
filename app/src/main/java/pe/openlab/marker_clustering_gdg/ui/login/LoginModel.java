package pe.openlab.marker_clustering_gdg.ui.login;

/**
 * Created by Bryam Soto on 24/11/2017.
 */

public class LoginModel implements Login.Model {

    private Login.Presenter presenter;

    public LoginModel(Login.Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void loginUser(String user, String password) {
        if (user.equals(password)) {
            presenter.loginSuccess();
        } else {
            presenter.loginError("Usuario y/o contraseña incorrectos");
        }
    }
}
