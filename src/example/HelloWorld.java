package example;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

/**
 * Created with IntelliJ IDEA.
 * User: Yaroslav_Zabara
 * Date: 23.01.13
 * Time: 13:06
 * To change this template use File | Settings | File Templates.
 */
@WebService
public class HelloWorld {
  @WebMethod
  public String sayHelloWorldFrom(String from) {
    String result = "Hello, world, from " + from;
    System.out.println(result);
    return result;
  }
  public static void main(String[] argv) {
    Object implementor = new HelloWorld();
    String address = "http://localhost:8181/HelloWorld";
    Endpoint.publish(address, implementor);
  }
}