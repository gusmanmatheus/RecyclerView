package br.com.jwk.myapplication.view.pessoa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import br.com.jwk.myapplication.Pessoa;
import br.com.jwk.myapplication.R;

public class PessoaActivity extends AppCompatActivity {

    public final static String EXTRA_PESSOA = "banana";
    private Pessoa pessoa;
    private TextView txtNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pessoa);

        txtNome = findViewById(R.id.pesTxtNome);
        pessoa = (Pessoa) getIntent().getSerializableExtra(EXTRA_PESSOA);

        txtNome.setText(pessoa.getNome());
    }
}
