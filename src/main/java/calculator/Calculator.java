package calculator;

import exception.DivisionByZero;

/**
 * Created by Anastasiya on 19.02.2017.
 */
public class Calculator {

    public static void implementation() throws DivisionByZero {
        EnumOperation enumOperation = new EnumOperation(12,0);

        print(EnumOperation.plus, enumOperation.getResultAddition());
        print(EnumOperation.minus, enumOperation.getResultSubtraction());
        print(EnumOperation.multiply, enumOperation.getResultMultiplication());
        print(EnumOperation.divided, enumOperation.getResultDivide());

    }

    public static void print(String operation, int result) {
        System.out.println("Операция " + operation + " : " + result);
    }
}
