public class DogFood extends AnimalFood {
    public DogFood(String name, int price, int quantity, String expirationDate, boolean onStock) {
        super(name,price, quantity, expirationDate, onStock);
    }
    public DogFood() {
        super();
    }

    @Override
    public void spoiled(){
        System.out.println("The dog food has spoiled at " + super.getExpirationDate());
    }
    @Override
    public void upstanding(){ System.out.println("The dog food has upstanding at " + super.getExpirationDate()); }
}
