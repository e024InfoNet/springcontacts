package br.com.albertoferes.springcontacts.repositories;

import br.com.albertoferes.springcontacts.domain.Contato;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ContatoRepository {

    @GetMapping("/contatos")
    public List<Contato> getAll() {
        return Arrays.asList(
                new Contato(1,"Esdras", "bzr4@icloud.com", "99999-8899"),
                new Contato(2,"Erika", "erika@icloud.com","88888-7777"),
                new Contato(3,"Enzo", "enzo@icloud.com","66666-9999"),
                new Contato(4,"Frodo", "frodo@icloud.com","22222-4444"),
                new Contato(5,"Alvin", "alvin@icloud.com","33333-1111")
        );
    }

    @GetMapping("/enzo")
    public Contato getContato() {
        return new Contato(3,"Enzo", "enzo@icloud.com","66666-9999");
    }
}
