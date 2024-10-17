package calculator;

import calculator.calc.Calculatable;
import calculator.calc.Calculator;
import camp.nextstep.edu.missionutils.Console;

public class Application {

    public static void main(String[] args) {
        Calculatable calculator = new Calculator();

        String input = getInput();

        long result = calculator.sumOfString(input);
        System.out.println("결과 : " + result);

        Console.close();
    }

    private static String getInput() {
        System.out.println("덧셈할 문자열을 입력해주세요.");
        String input = Console.readLine();
        System.out.println("input = " + input);
        return input;
    }
}
