package ro.cozmanca.models;

public class Invoice {
    String issuer;
    Integer amount;

    public Invoice(String issuer, Integer amount) {
        this.issuer = issuer;
        this.amount = amount;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "issuer='" + issuer + '\'' +
                ", amount=" + amount +
                '}';
    }
}
