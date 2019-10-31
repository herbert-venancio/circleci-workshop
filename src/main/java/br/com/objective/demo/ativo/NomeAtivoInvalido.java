package br.com.objective.demo.ativo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "Nome inválido para Ativo")
public class NomeAtivoInvalido extends RuntimeException {
}
