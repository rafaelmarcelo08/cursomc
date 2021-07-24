package io.github.cursomc.services;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.github.cursomc.domain.Categoria;
import io.github.cursomc.repositories.CategoriaRepository;
import io.github.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	public CategoriaRepository categoriaRepository;

	public Categoria buscar(Integer id) {
		Optional<Categoria> categoria = categoriaRepository.findById(id);
		return categoria.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! ID:" + id + ", Tipo: " + Categoria.class.getName()));
	}
}
