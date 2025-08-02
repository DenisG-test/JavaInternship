import java.time.LocalDateTime;

public class AnimalFood {

    private String  name;
    private int     price;
    private int     quantity;
    private String  expirationDate;
    private boolean onStock;

    public AnimalFood(String name, int price, int quantity, String expirationDate, boolean onStock) {
        this.name           = name;
        this.price          = price;
        this.quantity       = quantity;
        this.expirationDate = expirationDate;
        this.onStock        = onStock;
    }

    public AnimalFood() {
        this.name = "";
        this.price = 0;
        this.quantity = 0;
        this.expirationDate = "";
        this.onStock = false;
    }

    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public int getQuantity() { return quantity; }
    public String getExpirationDate() {
        return expirationDate;
    }
    public boolean isOnStock() { return onStock; }

    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public void setExpirationDate(LocalDateTime myDateObj) {this.expirationDate = expirationDate;}
    public void setOnStock(boolean onStock) { this.onStock = onStock; }
    public void spoiled(){
        System.out.println("The food has spoiled at " + this.expirationDate);
    }
    public void upstanding(){
        System.out.println("The food has upstanding at " + this.expirationDate);
    }
}
