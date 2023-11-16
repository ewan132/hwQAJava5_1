import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ServiceCalcTest {

    @Test
    public void dayWeek(){
        ServiceCalc calc = new ServiceCalc();

        int income = 10_000; // прибыль
        int expenses = 3_000; // еж.месячные траты
        int threshold = 20_000;

        int actual = calc.calculate(income, expenses, threshold);

        int expected = 3;
        Assertions.assertEquals(expected, actual);

    }

}
