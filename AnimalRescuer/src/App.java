public class App {
    public static void main(String[] args) {
        DogAdopter dogAdopter = new DogAdopter("Denis", 500, 180, 70, true);

        System.out.println("Adopter Name: " + dogAdopter.getName());
        System.out.println("Adopter Budget: " + dogAdopter.getBudget());
        System.out.println("Adopter Height: " + dogAdopter.getHeight());
        System.out.println("Adopter Weight: " + dogAdopter.getWeight());
        System.out.println("Is Adopter on time? " + dogAdopter.getOnTime());


        dogAdopter.adopts();
        dogAdopter.leave();


        Dog myDog = new Dog("Rex", 3, 90, 30, 85, "meat", "playing fetch", "German Shepard");

        myDog.eat();
        myDog.sleep();
        myDog.bark();

        DogFood food = new DogFood("Premium Dog Food", 50, 100, "2023-12-31", true);

        // Use some methods to showcase the AnimalFood class
        System.out.println("Food Name: " + food.getName());
        System.out.println("Food Price: " + food.getPrice());
        System.out.println("Food Quantity: " + food.getQuantity());
        System.out.println("Expiration Date: " + food.getExpirationDate());
        System.out.println("Is on Stock: " + food.isOnStock());

        // Call the spoiled and upstanding methods
        food.spoiled();
        food.upstanding();
    }
    }
