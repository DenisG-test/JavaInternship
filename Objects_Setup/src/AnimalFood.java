public class AnimalFood {
    private String name;
    private int price;

    public int quantity;
    public String expirationDate;
    public boolean onStock;

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

    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}
