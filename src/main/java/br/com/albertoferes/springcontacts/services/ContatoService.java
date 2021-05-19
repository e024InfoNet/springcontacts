package br.com.albertoferes.springcontacts.services;

import br.com.albertoferes.springcontacts.domain.Contato;
import br.com.albertoferes.springcontacts.repositories.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContatoService {

    @Autowired
    private ContatoRepository repository;

    public List<Contato> buscarTodos() {
        return repository.findAll();
    }
}
