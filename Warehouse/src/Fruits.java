import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Fruits extends Product{
    private int nutriQuality;

    public Fruits(String name, String measurableUnit, double price, int nutriQuality) {
        super(name, measurableUnit, price);
        this.nutriQuality = nutriQuality;
    }

    public int getNutriQuality() {
        return nutriQuality;
    }
    public void setNutriQuality(int nutriQuality) {
        this.nutriQuality = nutriQuality;
    }

    public String getCategory() {
        return "Fruit";
    }
    public double adjustPrice(LocalDate entryDate, LocalDate expirationDate) {
        double weeksUntilExpiration = ChronoUnit.WEEKS.between(entryDate,expirationDate);
        if ( weeksUntilExpiration == 0){
            return 0;
        }
        else if(weeksUntilExpiration <= 5) {
            return getPricePerUnit() - getPricePerUnit() * (weeksUntilExpiration * 0.1);
        }
    return getPricePerUnit();
    }
}
