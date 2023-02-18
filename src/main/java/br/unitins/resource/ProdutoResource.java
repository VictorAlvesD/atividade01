package br.unitins.resource;
import java.util.List;

import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.unitins.model.*;

@Path("/produtos")
public class ProdutoResource {
    @GET
    public List<Produtos> getAll() {

        // seleciona todas as pessoas do banco de dados
        return Produtos.findAll().list();

    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Produtos insert(Produtos produto) {

        // adiciona a pessoa no banco de dados
        produto.persist();

        return produto;
    }
}
