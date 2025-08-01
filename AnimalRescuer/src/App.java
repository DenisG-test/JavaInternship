import java.time.LocalDateTime;

public class App {
    public static void main(String[] args) {
        LocalDateTime myDateObj = LocalDateTime.now();
        Animal        objAnimal        = new Animal();
        Adopter       objAdopter       = new Adopter();
        AnimalFood    objAnimalFood    = new AnimalFood();
        RelaxActivity objRelaxActivity = new RelaxActivity();
        TheVet        objTheVet        = new TheVet();

        objAnimal.setAge(5);
        objAnimal.setName("Rex");
        objAnimal.setDispositionScore(10);
        objAnimal.setHealthScore(9);
        objAnimal.setHungryScore(4);
        objAnimal.setPreferredActivity("Alergat");
        objAnimal.setPreferredFood("Oase");

        objAdopter.setName("Daniel");
        objAdopter.setBudget(1000);

        objAnimalFood.setName("OaseMari");
        objAnimalFood.setPrice(30);
        objAnimalFood.setExpirationDate(myDateObj);
        objAnimalFood.setOnStock(true);

        objRelaxActivity.setName("Plimbare");

        objTheVet.setName("Ghita");
        objTheVet.setSpeciality("Chirurg");
        }
    }
