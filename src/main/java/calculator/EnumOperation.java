package calculator;

import exception.DivisionByZero;

/**
 * Created by Anastasiya on 19.02.2017.
 */
class EnumOperation {
    static final String plus = "+";
    static final String minus = "-";
    static final String multiply = "*";
    static final String divided = "/";
    private int number1;
    private int number2;

    EnumOperation(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    int getResultDivide() throws DivisionByZero{
        if (number2 == 0) throw new DivisionByZero("Нельзя делить на ноль!");
        else return number1 / number2;
    }

    int getResultMultiplication(){
        return number1 * number2;
    }

    int getResultAddition() {
        return number1 + number2;
    }

    int getResultSubtraction() {
        return number1 - number2;
    }
}
