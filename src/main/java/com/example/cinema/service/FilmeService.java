
package com.example.cinema.service;

import com.example.cinema.model.Filme;
import com.example.cinema.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FilmeService {

    @Autowired
    private FilmeRepository filmeRepository;

    public List<Filme> listarTodos() {
        return filmeRepository.findAll();
    }

    public Optional<Filme> buscarPorId(Long id) {
        return filmeRepository.findById(id);
    }

    public Filme salvar(Filme filme) {
        return filmeRepository.save(filme);
    }

    public Filme atualizar(Long id, Filme filme) {
        filme.setId(id);
        return filmeRepository.save(filme);
    }

    public void deletar(Long id) {
        filmeRepository.deleteById(id);
    }
}
