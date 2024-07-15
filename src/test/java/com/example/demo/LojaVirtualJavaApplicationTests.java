package com.example.demo;

import com.example.demo.controller.AcessoController;
import com.example.demo.model.Acesso;
import com.example.demo.repository.AcessoRepository;
import com.example.demo.service.AcessoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = LojaVirtualJavaApplication.class)
 public class LojaVirtualJavaApplicationTests {

	@Autowired
	private AcessoService acessoService;

	@Autowired
	private AcessoController acessoController;

	@Autowired
	private AcessoRepository acessoRepository;
	@Test
	public void testeCadastraAcesso() {
		Acesso  acesso = new Acesso();
		acesso.setDescricao("ROLE_ADMIN");

		acessoService.save(acesso);
	}

}
