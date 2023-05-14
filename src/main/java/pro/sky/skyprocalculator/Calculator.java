package pro.sky.skyprocalculator;

import org.springframework.stereotype.Service;

@Service
public class Calculator implements CalculatorInterface {
    public String hello(){
        return "Добро пожаловать в калькулятор";
    }
    public String error(){return "Не корректно введены значения чисел";}
public Integer numbPlus(Integer num01,Integer num02){
    //if (num01==null&&num02==null){error();}
       //else if (num01==null){error();}
       // else if (num02==null){error();}
    Integer num3=num01+num02;
        return num3;
}
    public Integer numbMinus(Integer num01,Integer num02){
        //if (num01==null&&num02==null){System.out.println("Введите значения чисел!");}
        //else if (num01==null){throw new RuntimeException("не введено значение первого числа!");}
        //else if (num02==null){throw new RuntimeException("не введено значение первого числа!");}
        Integer num3=num01-num02;
        return num3;
    }

    public Integer numbMultiply(Integer num01,Integer num02){
       // if (num01==null&&num02==null){throw new RuntimeException("Введите значения чисел!");}
        //else if (num01==null){throw new RuntimeException("не введено значение первого числа!");}
        //else if (num02==null){throw new RuntimeException("не введено значение первого числа!");}
        Integer  num3=num01*num02;
        return num3;
    }

    public Integer numbDivide(Integer num01,Integer num02){
        //if (num01==null&&num02==null){throw new RuntimeException("Введите значения чисел!");}
        //else if (num01==null){throw new RuntimeException("не введено значение первого числа!");}
        //else if (num02==null){throw new RuntimeException("не введено значение первого числа!");}
        if (num02==0){return 0;}
        else {Integer num3=num01/num02;return num3;}
    }
}
