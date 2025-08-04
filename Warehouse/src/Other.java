import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Other extends Product {
    public Other(String name, String measurableUnit, double price){
        super(name, measurableUnit, price);
    }
        public String getCategory(){
            return "Other";
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
