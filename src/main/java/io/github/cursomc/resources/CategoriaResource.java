package io.github.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.cursomc.domain.Categoria;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

	@GetMapping
	public List listar() {
		Categoria cat1 = new Categoria(1, "informatica");
		Categoria cat2 = new Categoria(2, "Escritorio");

		List<Categoria> lista = new ArrayList<>();

		lista.add(cat1);
		lista.add(cat2);

		return lista;
	}

}
