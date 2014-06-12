package ph.adoremus.dj.sandbox.sportsorgjaxws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class HelloWorld {

	@WebMethod
	public String sayHello(String name) {
		return "Hello " + (name == null ? "" : name) + " !";
	}
	
}
