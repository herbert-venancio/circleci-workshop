package br.com.objective.demo.ativo;

import org.springframework.util.StringUtils;

public class Ativo {

    private String nome;
    private AtivoId id;

    private Ativo(){}

    public Ativo(String nome) {
        if (StringUtils.isEmpty(nome)){
            throw new NomeAtivoInvalido();
        };
        this.nome = nome;
        this.id = new AtivoId();
    }

    public String getNome() {
        return this.nome;
    }

    public String getId() {
        return this.id.getId();
    }
}
