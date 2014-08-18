package com.zabara.calc.client;

import com.zabara.calc.CalculatorWs;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebServiceRef;
import java.net.URL;
import java.util.logging.Logger;

/**
 * Created with IntelliJ IDEA.
 * User: Yaroslav_Zabara
 * Date: 23.01.13
 * Time: 13:25
 * To change this template use File | Settings | File Templates.
 */
public class ClientWs {

    static Logger logger = Logger.getLogger("ClientWs");

    public static void main(String[] argv) {
        try{
            ClientWs clientWs = new ClientWs();
            clientWs.test();
        }catch (Exception ex){
            logger.info("Error" + ex);
        }
    }

    public void test() throws Exception {
        Service calculatorService = Service.create(
                new URL("http://localhost:8080/services/Calculator?wsdl"),
                new QName("http://calc.zabara.com/", "CalculatorService"));

        CalculatorWs calculator = calculatorService.getPort(new QName("http://calc.zabara.com/", "CalculatorPort"),
                CalculatorWs.class);
        logger.info("4+6=" + calculator.sum(4, 6));
        logger.info("4*3=" + calculator.multiply(3, 4));
    }
}
