import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Warehouse {
    public static void main(String[] args) {
        PackagesGen warehouseManager = new PackagesGen();
        warehouseManager.generateStoragePackages(200);

        List<Package> packages = warehouseManager.getStoragePackages();
        LocalDate currentDate = LocalDate.now();

        String filePath = "storage_packages_output.txt";

        // Maps to store summary data
        Map<String, Double> categoryTotalQuantities = new HashMap<>();
        Map<String, Double> categoryTotalPrices = new HashMap<>();
        Map<String, Double> categoryTotalOriginalPrices = new HashMap<>();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            // Write package details and aggregate data
            for (Package pkg : packages) {
                Product product = pkg.getProduct();
                double originalPrice = product.getPricePerUnit() * pkg.getQuantity();
                double adjustedPrice = pkg.getAdjustedPrice(currentDate) * pkg.getQuantity();
                String category = product.getCategory();
                double quantity = pkg.getQuantity();

                // Write package details to file
                writer.write(String.format("Package Details: Product Name: %s, Category: %s, Quantity: %.2f %s, Entry Date: %s, Expiration Date: %s, Original Price: $%.2f, Adjusted Price: $%.2f%n",
                        product.getName(), category, quantity, product.getMeasurableUnit(), pkg.getEntryDate(), pkg.getExpirationDate(), originalPrice, adjustedPrice));


                categoryTotalQuantities.merge(category, quantity, Double::sum);
                categoryTotalPrices.merge(category, adjustedPrice, Double::sum);
                categoryTotalOriginalPrices.merge(category, originalPrice, Double::sum);
            }

            // Write summary to file
            writer.write("\nWarehouse Summary:\n");
            for (Map.Entry<String, Double> entry : categoryTotalQuantities.entrySet()) {
                String category = entry.getKey();
                double totalQuantity = entry.getValue();
                double totalPrice = categoryTotalPrices.getOrDefault(category, 0.0);
                double totalOriginalPrice = categoryTotalOriginalPrices.getOrDefault(category, 0.0);
                double averageDiscountPercentage = totalOriginalPrice > 0 ? ((totalOriginalPrice - totalPrice) / totalOriginalPrice) * 100 : 0;

                writer.write(String.format("%s: Total: %.2f kg, Total Original Price: $%.2f, Total Adjusted Price: $%.2f, Average Discount: %.2f%%%n",
                        category, totalQuantity, totalOriginalPrice, totalPrice, averageDiscountPercentage));
            }

            System.out.println("Output has been written to " + filePath);
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
