package br.com.objective.demo.ativo;

import java.util.UUID;

public class AtivoId {

    private String id;

    public AtivoId(){
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return this.id;
    }
}
