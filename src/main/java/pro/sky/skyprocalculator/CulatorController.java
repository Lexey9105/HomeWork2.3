package pro.sky.skyprocalculator;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/calculator")
public class CulatorController {
    private final Calculator calculator;

    public CulatorController(Calculator calculator) {
        this.calculator = calculator;
    }

    @GetMapping
    public String hello() {
        return calculator.hello();
    }

    @GetMapping(path = "/error")
    @ExceptionHandler({IllegalStateException.class, RuntimeException.class})
    public String errorPage() {
        return calculator.error();
    }

    @GetMapping(path = "/plus")
    public Integer numbPlus(@RequestParam(value = "num1", required = false) Integer num01, @RequestParam(value = "num2", required = false) Integer num02) {
        if (num01 == null || num02 == null) {
            errorPage();
            throw new RuntimeException();
        }
        return calculator.numbPlus(num01, num02);
    }

    @GetMapping(path = "/minus")
    public int numbMinus(@RequestParam(value = "num1", required = false) Integer num01, @RequestParam(value = "num2", required = false) Integer num02) {
        if (num01 == null || num02 == null) {
            errorPage();
            throw new RuntimeException();
        }
        return calculator.numbMinus(num01, num02);
    }

    @GetMapping(path = "/multiply")
    public int numbMultiply(@RequestParam(value = "num1", required = false) Integer num01, @RequestParam(value = "num2", required = false) Integer num02) {
        if (num01 == null || num02 == null) {
            errorPage();
            throw new RuntimeException();
        }
        return calculator.numbMultiply(num01, num02);
    }

    @GetMapping(path = "/divide")
    public int numbDivide(@RequestParam(value = "num1", required = false) Integer num01, @RequestParam(value = "num2", required = false) Integer num02) {
        if (num01 == null || num02 == null||num02==0) {
            errorPage();
            throw new RuntimeException();
        }
        return calculator.numbDivide(num01, num02);
    }
}
