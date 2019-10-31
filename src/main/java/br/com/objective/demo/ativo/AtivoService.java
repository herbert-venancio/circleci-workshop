package br.com.objective.demo.ativo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AtivoService {

    @Autowired
    private AtivoRepository repository;


    public List<Ativo> listarTodosAtivos() {
        return repository.listarTodosAtivos();
    }

    public Ativo criarNovoAtivo(String nome) {
        Ativo novoAtivo = new Ativo(nome);
        return repository.salvarNovoAtivo(novoAtivo);
    }
}
