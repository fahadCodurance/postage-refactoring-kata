import org.junit.Test;

import static org.junit.Assert.*;

public class PackageShould {

    @Test
    public void calculate_postage_in_base_currency_for_small_package() {
        Package aPackage = new Package(0, 0, 0, 0);
        double actualPostage = aPackage.postageInBaseCurrency();
        double expectedPostage = 120;

        assertEquals(expectedPostage, actualPostage, 0);
    }

    @Test
    public void calculate_postage_in_base_currency_for_medium_package() {
        Package aPackage = new Package(60, 0, 0, 100);
        int expectedPostage = 240;
        double actualPostage = aPackage.postageInBaseCurrency();

        assertEquals(expectedPostage, actualPostage, 0);
    }
    @Test
    public void calculate_postage_in_base_currency_for_large_package() {
        Package aPackage = new Package(500, 230, 230, 101);
        int expectedPostage = 32052;
        double actualPostage = aPackage.postageInBaseCurrency();

        assertEquals(expectedPostage, actualPostage, 0);
    }



}