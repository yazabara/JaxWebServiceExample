package com.zabara.calc;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

/**
 * Created with IntelliJ IDEA.
 * User: Yaroslav_Zabara
 * Date: 23.01.13
 * Time: 13:18
 * To change this template use File | Settings | File Templates.
 */
@WebService()
public interface CalculatorWs {

    @WebMethod(operationName = "sum")
    public int sum(int add1, int add2);

    @WebMethod(operationName = "mult")
    public int multiply(int mul1, int mul2);
}