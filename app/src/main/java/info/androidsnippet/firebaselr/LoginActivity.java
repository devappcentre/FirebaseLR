package info.androidsnippet.firebaselr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    private Button btnLogin;
    private EditText edEmail;
    private EditText edPassword;
    private TextView txtSignup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //Lets find some components
        btnLogin = (Button) findViewById(R.id.btnLogin);
        edEmail = (EditText) findViewById(R.id.edEmail);
        edPassword = (EditText) findViewById(R.id.edPassword);
        txtSignup = (TextView) findViewById(R.id.txtSignup);


    }
}
