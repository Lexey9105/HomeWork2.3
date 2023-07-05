package pro.sky.skyprocalculator;

import org.springframework.stereotype.Service;

@Service
public class Calculator implements CalculatorInterface {
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    public String error() {
        return "Не корректно введены значения чисел";
    }

    public Integer numbPlus(Integer num01, Integer num02) {
        Integer num3 = num01 + num02;
        return num3;
    }

    public Integer numbMinus(Integer num01, Integer num02) {
        Integer num3 = num01 - num02;
        return num3;
    }

    public Integer numbMultiply(Integer num01, Integer num02) {
        Integer num3 = num01 * num02;
        return num3;
    }

    public Integer numbDivide(Integer num01, Integer num02) {
            Integer num3 = num01 / num02;
            return num3;

    }
}
