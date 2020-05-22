package br.edu.ifms.provap1;

import br.edu.ifms.provap1.model.Pessoa;
import br.edu.ifms.provap1.validate.ValidaCPF;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 *
 * @author Caio Henrique
 */
@WebService(targetNamespace = "http://localhost:8000/provap1ws")
public class Webservice {
    @WebMethod(operationName = "RetornaSeOCPFEValido")
    @WebResult(name = "Validacao")
    public String validar(@WebParam(name = "pessoa") Pessoa pessoa) {
        if (ValidaCPF.isCPF(pessoa.getCpf())) {
            return "CPF Válido";
        } else {
            return "CPF Inválido";
        }
    }
}
