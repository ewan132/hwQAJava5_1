import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class ServiceCalcTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/weekend.csv")
    public void dayWeek(int income, int expenses, int threshold, int expected) {
        ServiceCalc calc = new ServiceCalc();
        int actual = calc.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);

    }

}
