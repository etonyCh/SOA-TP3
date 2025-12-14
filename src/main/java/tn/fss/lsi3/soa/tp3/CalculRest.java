package tn.fss.lsi3.soa.tp3;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/calcul")
public class CalculRest {

    private Calculatrice calculatrice = new Calculatrice();

    @GET
    @Path("/somme")
    @Produces(MediaType.APPLICATION_JSON)
    public Operation somme(@QueryParam("a") double a, @QueryParam("b") double b) {
        Operation op = new Operation();
        op.setVal1(a);
        op.setVal2(b);
        op.setType("ADDITION");
        op.setResult(calculatrice.somme(a, b));
        return op;
    }

    @GET
    @Path("/soustraction")
    @Produces(MediaType.APPLICATION_JSON)
    public Operation soustraction(@QueryParam("a") double a, @QueryParam("b") double b) {
        Operation op = new Operation();
        op.setVal1(a);
        op.setVal2(b);
        op.setType("SOUSTRACTION");
        op.setResult(calculatrice.difference(a, b));
        return op;
    }

    @GET
    @Path("/multiplication")
    @Produces(MediaType.APPLICATION_JSON)
    public Operation multiplication(@QueryParam("a") double a, @QueryParam("b") double b) {
        Operation op = new Operation();
        op.setVal1(a);
        op.setVal2(b);
        op.setType("MULTIPLICATION");
        op.setResult(calculatrice.produit(a, b));
        return op;
    }

    @GET
    @Path("/division")
    @Produces(MediaType.APPLICATION_JSON)
    public Response division(@QueryParam("a") double a, @QueryParam("b") double b) {
        if (b == 0) {
            return Response.status(Response.Status.BAD_REQUEST)
                    .entity("Division par zéro impossible")
                    .type(MediaType.TEXT_PLAIN)
                    .build();
        }
        Operation op = new Operation();
        op.setVal1(a);
        op.setVal2(b);
        op.setType("DIVISION");
        op.setResult(calculatrice.quotient(a, b));
        return Response.ok(op).build();
    }
}
