import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class BusinessmanAccountTaxOfficeTest {

    @ParameterizedTest(name = "{index} {0}")
    @CsvFileSource (resources = { "increaseIncome.csv"} )
    public void testIncreaseIncome (String title, double income, double value, double expected){
        BusinessmanAccountTaxOffice bato = new BusinessmanAccountTaxOffice(income,0);
        bato.increaseIncome(value);
        double actual = bato.getIncome();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest(name = "{index} {0}")
    @CsvFileSource (resources = { "increaseExpenses.csv"} )
    public void testIncreaseExpenses (String title, double expenses, double value, double expected){
        BusinessmanAccountTaxOffice bato = new BusinessmanAccountTaxOffice(0,expenses);
        bato.increaseExpenses(value);
        double actual = bato.getExpenses();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest(name = "{index} {0}")
    @CsvFileSource (resources = { "taxSixPercentIncome.csv"} )
    public void testTaxSixPercentIncome (String title, double income, double expected){
        BusinessmanAccountTaxOffice bato = new BusinessmanAccountTaxOffice(income, 0);
        double actual = bato.taxSixPercentIncome();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest(name = "{index} {0}")
    @CsvFileSource (resources = { "taxFifteenPercentIncomeMinusExpenses.csv"} )
    public void testTaxFifteenPercentIncomeMinusExpenses (String title, double income, double expenses, double expected){
        BusinessmanAccountTaxOffice bato = new BusinessmanAccountTaxOffice(income, expenses);
        double actual = bato.taxFifteenPercentIncomeMinusExpenses();
        Assertions.assertEquals(expected, actual);
    }

}
