package br.com.unicarioca.projetointegrador.timec.rs;

import java.util.List;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/prototipo")
public class PrototipoRest {

	@GET
	@Path("/teste")
	public String geTest() {
	
			
			return "TESTE PROJETO INTEGRADOR" ;

	}

}
