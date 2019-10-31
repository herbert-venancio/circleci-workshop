package br.com.objective.demo.ativo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ativo")
public class AtivoController {

    @Autowired
    private AtivoService service;

    @GetMapping
    public List<Ativo> listarTodosAtivos(){
        return service.listarTodosAtivos();
    }

    @PostMapping
    public Ativo criarNovoContrato(CriarAtivoDto requestBody){
        return service.criarNovoAtivo(requestBody.nome);
    }
}
