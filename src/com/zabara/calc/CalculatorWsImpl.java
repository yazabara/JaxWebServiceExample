package com.zabara.calc;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created with IntelliJ IDEA.
 * User: Yaroslav_Zabara
 * Date: 23.01.13
 * Time: 13:19
 * To change this template use File | Settings | File Templates.
 */
@WebService(
        portName = "CalculatorPort",
        serviceName = "CalculatorService"
)
public class CalculatorWsImpl implements CalculatorWs {

    @WebMethod(operationName = "sum")
    public int sum(int add1, int add2) {
        return add1 + add2;
    }

    @WebMethod(operationName = "mult")
    public int multiply(int mul1, int mul2) {
        return mul1 * mul2;
    }
}