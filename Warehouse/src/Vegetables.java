import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Vegetables extends Product{
    private int nutriQuality;
    private String producer;

    public Vegetables(String name, String measurableUnit, double price, int nutriQuality, String producer) {
        super(name, measurableUnit, price);
        this.nutriQuality = nutriQuality;
        this.producer = producer;
    }

    public int getNutriQuality() {
        return nutriQuality;
    }
    public void setNutriQuality(int nutriQuality) {
        this.nutriQuality = nutriQuality;
    }
    public String getProducer() {
        return producer;
    }
    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getCategory() {
        return "Vegetable";
    }

    public double adjustPrice(LocalDate entryDate, LocalDate expirationDate) {
        double weeksUntilExpiration = ChronoUnit.WEEKS.between(entryDate,expirationDate);
        if ( weeksUntilExpiration == 0){
            return 0;
        }
        else if(weeksUntilExpiration <= 4) {
            return getPricePerUnit() - getPricePerUnit() * (weeksUntilExpiration * 0.05);
        }
        return getPricePerUnit();
    }
}
