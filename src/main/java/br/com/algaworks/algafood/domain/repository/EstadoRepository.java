package br.com.algaworks.algafood.domain.repository;

import br.com.algaworks.algafood.domain.model.Estado;

import java.util.List;

public interface EstadoRepository {

    List<Estado> todos();

    Estado porId(Long id);

    Estado adicionar(Estado estado);

    void remover(Estado estado);
}
