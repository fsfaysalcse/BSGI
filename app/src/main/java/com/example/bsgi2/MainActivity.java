package com.example.bsgi2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.JsonHttpResponseHandler;
import com.loopj.android.http.RequestParams;
import com.loopj.android.http.TextHttpResponseHandler;

import org.json.JSONArray;
import org.json.JSONException;

import cz.msebera.android.httpclient.Header;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    TextInputEditText email, password;
    Button btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = findViewById(R.id.IEmail);
        password = findViewById(R.id.IPassword);
        btnlogin = findViewById(R.id.btnlogin);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TextUtils.isEmpty(email.getText().toString()) || TextUtils.isEmpty(password.getText().toString())){

                    Toast.makeText(MainActivity.this,"Email / Password required", Toast.LENGTH_LONG).show();
                }
                else{
                    //proceed to login
                    login( email.getText().toString(),password.getText().toString());
                }
            }
        });
    }
    public void login(String email, String pass){

        AsyncHttpClient client = new AsyncHttpClient(true, 80, 443);
//        client.setSSLSocketFactory(MySSLSocketFactory.getFixedSocketFactory());
        client.setEnableRedirects(true);

        RequestParams params = new RequestParams();

        params.add("email",email);
        params.add("password",pass );

        client.post("https://bsgi.org.bd/api/login", params,new TextHttpResponseHandler()  {

            @Override
            public void onSuccess(int statusCode, Header[] headers, String responseString) {

                Toast.makeText(MainActivity.this, "Login Successfull", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this, dashboard.class);
                startActivity(intent);
                finish();

            }

            @Override
            public void onFailure(int statusCode, Header[] headers, String responseString, Throwable throwable) {

                Toast.makeText(MainActivity.this, "Login Failed", Toast.LENGTH_SHORT).show();
            }

        });



    }
}