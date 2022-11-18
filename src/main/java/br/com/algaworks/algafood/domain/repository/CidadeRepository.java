package br.com.algaworks.algafood.domain.repository;

import br.com.algaworks.algafood.domain.model.Cidade;

import java.util.List;

public interface CidadeRepository {

    List<Cidade> todas();

    Cidade porId(Long id);

    Cidade adicionar(Cidade cidade);

    void remover(Cidade cidade);
}
