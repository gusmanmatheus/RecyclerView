package br.com.jwk.myapplication.view.pessoas;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import br.com.jwk.myapplication.Pessoa;
import br.com.jwk.myapplication.R;

public class PessoaAdapter extends RecyclerView.Adapter<PessoaAdapter.PessoaHolder> {

    private List<Pessoa> pessoas;
    private Context context;
    private OnPessoaClick listener;

    public PessoaAdapter(Context context, List<Pessoa> pessoas, OnPessoaClick listener) {
        this.pessoas = pessoas;
        this.context = context;
        this.listener = listener;
    }

    @NonNull
    @Override
    public PessoaHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int type) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_pessoa, viewGroup, false);
        PessoaHolder holder = new PessoaHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull PessoaHolder pessoaHolder, int position) {
        final Pessoa pessoa = pessoas.get(position);

        pessoaHolder.txtNome.setText(pessoa.getNome());
        pessoaHolder.txtAnoNascimento.setText(String.valueOf(pessoa.getAnoNascimento()));

        pessoaHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onClick(pessoa);
            }
        });
    }

    @Override
    public int getItemCount() {
        return pessoas.size();
    }

    class PessoaHolder extends RecyclerView.ViewHolder {

        TextView txtNome;
        TextView txtAnoNascimento;

        public PessoaHolder(@NonNull View itemView) {
            super(itemView);

            txtNome = itemView.findViewById(R.id.ipeTxtNome);
            txtAnoNascimento = itemView.findViewById(R.id.ipeTxtAnoNascimento);
        }
    }

    public interface OnPessoaClick {
        void onClick(Pessoa pessoa);
    }
}
