package br.com.albertoferes.springcontacts.resources;

import br.com.albertoferes.springcontacts.domain.Contato;
import br.com.albertoferes.springcontacts.services.ContatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/contatos")
@RestController
public class ContatoResource {

    @Autowired
    private ContatoService service;

    @GetMapping
    public ResponseEntity<List<Contato>> buscarTodos() {
        List<Contato> contatos = service.buscarTodos();
        return ResponseEntity.ok().body(contatos);
    }
}
