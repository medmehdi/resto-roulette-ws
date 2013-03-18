package org.myplatforme.restoroulette.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.myplatforme.restoroulette.domain.Resto;
import org.myplatforme.restoroulette.services.RestoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Path("/restos")
public class RestoResource {

	@Autowired
	RestoService restoService;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAllRestos() {
		List<Resto> result = restoService.getAll();
		return Response.status(200).entity(result).build();
	}

	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getResto(@PathParam("id") String id) {
		Resto result = restoService.getById(id);
		return Response.status(200).entity(result).build();
	}

}
