public class Calculator {
    public Money calculate(Package aPackage, Currency currency) {
        double postageInBaseCurrency = postageInBaseCurrency(aPackage);
        return convertCurrency(postageInBaseCurrency, currency);
    }
    @Deprecated
    public Money calculate(int weight, int height, int width, int depth, Currency currency) {
        double postageInBaseCurrency = postageInBaseCurrency(new Package(weight, height, width, depth));
        return convertCurrency(postageInBaseCurrency, currency);
    }

    private double postageInBaseCurrency(Package aPackage) {
        if (aPackage.getWeight() <= 60 && aPackage.getHeight() <= 229 && aPackage.getWidth() <= 162 && aPackage.getDepth() <= 25) {
            return 120;
        }
        if (aPackage.getWeight() <= 500 && aPackage.getHeight() <= 324 && aPackage.getWidth() <= 229 && aPackage.getDepth() <= 100) {
            return aPackage.getWeight() * 4;
        }
        return Math.max(aPackage.getWeight(), aPackage.getHeight() * aPackage.getWidth() * aPackage.getDepth() / 1000) * 6;
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
