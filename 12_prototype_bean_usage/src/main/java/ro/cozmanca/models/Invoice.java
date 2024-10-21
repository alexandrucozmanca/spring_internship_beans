package ro.cozmanca.models;

public class Invoice {
    private Integer number;
    private Integer quantity;

    public Invoice(Integer number, Integer quantity) {
        this.number = number;
        this.quantity = quantity;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
