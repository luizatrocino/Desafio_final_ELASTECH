package br.com.divasbank.service;


import br.com.divasbank.model.Cliente;
import br.com.divasbank.model.Endereco;
import br.com.divasbank.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;

    public List<Endereco> listarTodos() {
        return enderecoRepository.findAll();
    }

    public Optional<Endereco> listarEnderecoPorId(Long id) {
        return enderecoRepository.findById(id);
    }

    //Falta implementar corretamente
    /*public Optional<Endereco> listarEnderecoPorCliente(Long id) {

        return enderecoRepository.findById(id);
    } */


    public Endereco editar(Long id, Endereco endereco) {
        listarEnderecoPorId(endereco.getIdEndereco());
        return enderecoRepository.save(endereco);
    }

}
