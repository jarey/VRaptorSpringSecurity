package br.com.triadworks.controller;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.triadworks.service.Servico;

@Resource
public class AdminController {

	public AdminController(Servico servico) {
		super();
	}

	@Get
	@Path("/admin")
	public void admin() {
	}
	
}
