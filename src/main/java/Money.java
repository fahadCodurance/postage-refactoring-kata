public class Money {
    private final Currency currency;
    private final double amount;

    public Money(Currency currency, double amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Money{" +
                "currency=" + getCurrency() +
                ", amount=" + String.format("%.2f", getAmount()) +
                '}';
    }
}
