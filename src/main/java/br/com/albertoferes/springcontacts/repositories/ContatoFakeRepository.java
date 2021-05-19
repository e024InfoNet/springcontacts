package br.com.albertoferes.springcontacts.repositories;

import br.com.albertoferes.springcontacts.domain.Contato;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ContatoFakeRepository {

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

    @GetMapping("/contato/{id}")
    public Contato findbyId(@PathVariable Integer id) {
        List<Contato> contatos = getAll();
        for(Contato contato : contatos) {
            if (id.equals(contato.getId())) return contato;
        }
        return new Contato();
    }

    @GetMapping("/contato/{nome}")
    public Contato findbyName(@PathVariable String nome) {
        List<Contato> contatos = getAll();
        for(Contato contato : contatos) {
            if (nome.equals(contato.getNome())) return contato;
        }
        return new Contato();
    }
}
