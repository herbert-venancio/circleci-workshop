package br.com.objective.demo.ativo;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AtivoRepository {

    private List<Ativo> ativos = new ArrayList<>();

    public List<Ativo> listarTodosAtivos() {
        return this.ativos;
    }

    public Ativo salvarNovoAtivo(Ativo novoAtivo) {
        this.ativos.add(novoAtivo);
        return novoAtivo;
    }
}
