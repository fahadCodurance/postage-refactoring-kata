import org.junit.Before;
import org.junit.Test;

import static org.approvaltests.combinations.CombinationApprovals.verifyAllCombinations;

public class CalculatorShould {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void calculate_cost() {
        verifyAllCombinations(
                this::doCalculation,
                new Integer[] {0, 60, 61, 500, 502},
                new Integer[] {0, 229, 230, 324, 325},
                new Integer[] {0, 162, 163, 229, 230},
                new Integer[] {0, 25, 26, 100, 101},
                new Currency[] {Currency.Gbp, Currency.Chf, Currency.Eur, null}
        );
    }

    private String doCalculation(int weight, int height, int width, int depth, Currency currency) {
        return calculator.calculate(weight, height, width, depth, currency).toString();
    }
}
