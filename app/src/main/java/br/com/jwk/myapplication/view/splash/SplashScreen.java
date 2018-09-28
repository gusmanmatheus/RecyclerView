package br.com.jwk.myapplication.view.splash;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import br.com.jwk.myapplication.BancoDeDados;
import br.com.jwk.myapplication.R;
import br.com.jwk.myapplication.view.pessoas.MainActivity;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new AsyncTask<Void, Void, Void>(){
            @Override
            protected Void doInBackground(Void... strings) {
                BancoDeDados.init();

                return null;
            }

            @Override
            protected void onPostExecute(Void aVoid) {
                startActivity(new Intent(SplashScreen.this, MainActivity.class));
                finish();
            }
        }.execute();
    }
}
