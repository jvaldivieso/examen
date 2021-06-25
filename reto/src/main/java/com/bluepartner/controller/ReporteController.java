package com.bluepartner.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bluepartner.model.Resultado;
import com.bluepartner.repo.IRetoRepo;

@RestController
public class ReporteController {

	@Autowired
	private IRetoRepo resultado;
	@GetMapping("/reto")
	public Resultado reto(@RequestParam(value = "texto", defaultValue = "") String texto )  {
		return resultado.valida(texto);
	}
}
