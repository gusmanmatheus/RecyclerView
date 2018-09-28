package br.com.jwk.myapplication.view.pessoas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import br.com.jwk.myapplication.BancoDeDados;
import br.com.jwk.myapplication.Pessoa;
import br.com.jwk.myapplication.R;
import br.com.jwk.myapplication.view.pessoa.PessoaActivity;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recPessoas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recPessoas = findViewById(R.id.mainRecPessoas);
        recPessoas.setLayoutManager(new LinearLayoutManager(this));
        recPessoas.setAdapter(new PessoaAdapter(this, BancoDeDados.pessoas, new PessoaAdapter.OnPessoaClick() {
            @Override
            public void onClick(Pessoa pessoa) {
                Intent intent = new Intent(MainActivity.this, PessoaActivity.class);
                intent.putExtra(PessoaActivity.EXTRA_PESSOA, pessoa);
                startActivity(intent);
            }
        }));
    }
}
