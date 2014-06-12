/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ph.adoremus.dj.sandbox.sportsorgsoap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 *
 * @author djadoremus
 */
@WebService
@SOAPBinding(style=SOAPBinding.Style.RPC)
public class SportsOrgService {
    @WebMethod(operationName="someMethod")
    public String someMethod(){
        return "yo!";
    }
    
    @WebMethod(operationName="sayHello")
    public String sayHello(@WebParam(name="name") String name){
        return "Hello, " + ((name != null) ? name : "Anonymous") + "!";
    }
}
