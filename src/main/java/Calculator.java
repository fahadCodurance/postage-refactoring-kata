public class Calculator {
    private final CurrencyConverter currencyConverter = new CurrencyConverter();

    public Money calculate(Package aPackage, Currency currency) {
        return currencyConverter.convertCurrency(postageInBaseCurrency(aPackage), currency);
    }
    @Deprecated
    public Money calculate(int weight, int height, int width, int depth, Currency currency) {
        double postageInBaseCurrency = postageInBaseCurrency(new Package(weight, height, width, depth));
        return currencyConverter.convertCurrency(postageInBaseCurrency, currency);
    }

    private double postageInBaseCurrency(Package aPackage) {
        return aPackage.postageInBaseCurrency();
    }

    private Money convertCurrency(double amountInBaseCurrency, Currency currency) {
        return currencyConverter.convertCurrency(amountInBaseCurrency, currency);
    }


}
