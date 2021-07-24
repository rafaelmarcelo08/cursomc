package io.github.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import io.github.cursomc.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
