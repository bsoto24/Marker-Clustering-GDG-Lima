package pe.openlab.marker_clustering_gdg.ui.login;

/**
 * Created by Bryam Soto on 24/11/2017.
 */

public class LoginPresenter implements Login.Presenter {

    private Login.Model model;
    private Login.View view;

    public LoginPresenter(Login.View view) {
        this.view = view;
        model = new LoginModel(this);
    }

    @Override
    public void loginSuccess() {
        if (view != null)
            view.loginSuccess();
    }

    @Override
    public void loginError(String error) {
        if (view != null)
            view.loginError(error);
    }

    @Override
    public void loginUser(String user, String password) {
        model.loginUser(user, password);
    }
}
