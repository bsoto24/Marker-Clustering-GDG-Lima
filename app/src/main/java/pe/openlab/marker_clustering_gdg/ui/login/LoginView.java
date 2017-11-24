package pe.openlab.marker_clustering_gdg.ui.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import pe.openlab.marker_clustering_gdg.R;
import pe.openlab.marker_clustering_gdg.ui.events.EventActivity;

/**
 * Created by Bryam Soto on 24/11/2017.
 */

public class LoginView extends AppCompatActivity implements Login.View {

    private TextInputEditText edtUser, edtPassword;
    private Button btnLogin;
    private TextView tvError;
    private Login.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtUser = findViewById(R.id.edt_user);
        edtPassword = findViewById(R.id.edt_password);
        btnLogin = findViewById(R.id.btn_login);
        tvError = findViewById(R.id.tv_error);

        presenter = new LoginPresenter(this);
    }


    public void login(View view) {
        presenter.loginUser(edtUser.getText().toString(), edtPassword.getText().toString());
    }

    @Override
    public void loginSuccess() {
        Intent intent = new Intent(LoginView.this, EventActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void loginError(String error) {
        tvError.setText(error);
    }
}
