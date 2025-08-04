import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class PackagesGen {
    private List<Package> packages;
    private Random random;

    private List<String> fruitNames = Arrays.asList("Apples", "Peaches", "Oranges", "Bananas", "Grapes");
    private List<String> vegetableNames = Arrays.asList("Potatoes", "Onions", "Carrots", "Lettuce", "Broccoli");
    private List<String> otherNames = Arrays.asList("Crackers", "Biscuits", "Chips");

    private List<String> units = Arrays.asList("Kg", "Bag (10 kg)", "Bag (4 kg)", "Box (6 kg)", "Bag (2.5 kg)", "Pack");
    private List<Integer> quantities = Arrays.asList(50, 15, 20, 30, 25, 100);

    public PackagesGen() {
        packages = new ArrayList<>();
        random = new Random();
    }

    public void generateStoragePackages(int numPackages) {
        for (int i = 0; i < numPackages; i++) {
            Product product = getRandomProduct();
            int quantity = getRandomQuantity();
            LocalDate entryDate = generateRandomEntryDate();
            LocalDate expirationDate = entryDate.plusWeeks(5 + random.nextInt(6));

            packages.add(new Package(product, quantity, entryDate, expirationDate));
        }
    }

    private Product getRandomProduct() {
        String category = getRandomCategory();
        String name = getRandomName(category);
        String unit = getRandomUnit();
        double pricePerUnit = getRandomPrice();

        switch (category) {
            case "Fruits":
                return new Fruits(name, unit, pricePerUnit, 8);
            case "Vegetables":
                return new Vegetables(name, unit, pricePerUnit, 7, "Farmer " + name);
            default:
                return new Other(name, unit, pricePerUnit);
        }
    }

    private String getRandomCategory() {
        List<String> categories = Arrays.asList("Fruits", "Vegetables", "Other");
        return categories.get(random.nextInt(categories.size()));
    }

    private String getRandomName(String category) {
        switch (category) {
            case "Fruits":
                return fruitNames.get(random.nextInt(fruitNames.size()));
            case "Vegetables":
                return vegetableNames.get(random.nextInt(vegetableNames.size()));
            default:
                return otherNames.get(random.nextInt(otherNames.size()));
        }
    }

    private String getRandomUnit() {
        return units.get(random.nextInt(units.size()));
    }

    private int getRandomQuantity() {
        return quantities.get(random.nextInt(quantities.size()));
    }

    private double getRandomPrice() {
        return 1 + random.nextDouble() * 29; // Random price between 1 and 30
    }

    private LocalDate generateRandomEntryDate() {
        return LocalDate.now().minusDays(random.nextInt(30));
    }

    public List<Package> getStoragePackages() {
        return packages;
    }
}

