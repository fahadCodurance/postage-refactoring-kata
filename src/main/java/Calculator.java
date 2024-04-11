public class Calculator {
    public Money calculate(Package aPackage, Currency currency) {
        return convertCurrency(postageInBaseCurrency(aPackage), currency);
    }
    @Deprecated
    public Money calculate(int weight, int height, int width, int depth, Currency currency) {
        double postageInBaseCurrency = postageInBaseCurrency(new Package(weight, height, width, depth));
        return convertCurrency(postageInBaseCurrency, currency);
    }

    private double postageInBaseCurrency(Package aPackage) {
        return aPackage.postageInBaseCurrency();
    }

    private Money convertCurrency(double amountInBaseCurrency, Currency currency) {
        if (currency == Currency.Gbp)
            return new Money(Currency.Gbp, amountInBaseCurrency);
        if (currency == Currency.Eur)
            return new Money(Currency.Eur, (amountInBaseCurrency + 200) * 1.25);
        if (currency == Currency.Chf)
            return new Money(Currency.Chf, (amountInBaseCurrency + 200) * 1.36);
        return null;
    }
}
