import java.time.LocalDate;

public class Package {
    private Product product;
    private int quantity;
    private LocalDate entryDate;
    private LocalDate expirationDate;

    public Package(Product product, int quantity, LocalDate entryDate, LocalDate expirationDate) {
        this.product = product;
        this.quantity = quantity;
        this.entryDate = entryDate;
        this.expirationDate = expirationDate;
    }

    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public LocalDate getEntryDate() {
        return entryDate;
    }
    public void setEntryDate(LocalDate entryDate) {
        this.entryDate = entryDate;
    }
    public LocalDate getExpirationDate() {
        return expirationDate;
    }
    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public double getAdjustedPrice(LocalDate currentDate) {
        return product.adjustPrice(currentDate, expirationDate);
    }

}
