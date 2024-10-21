package ro.cozmanca.models;

public class Invoice {
    private String issuer;
    private Integer quantity;

    public Invoice() {
    }

    public Invoice(String issuer, Integer quantity) {
        this.issuer = issuer;
        this.quantity = quantity;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "issuer='" + issuer + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
