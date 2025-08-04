import java.time.LocalDate;

public abstract class Product {
    private String name;
    private String measurableUnit;
    private double pricePerUnit;

    public Product(String name, String measurableUnit, double pricePerUnit) {
        this.name = name;
        this.measurableUnit = measurableUnit;
        this.pricePerUnit = pricePerUnit;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getMeasurableUnit() {
        return measurableUnit;
    }
    public void setMeasurableUnit(String measurableUnit) {
        this.measurableUnit = measurableUnit;
    }
    public double getPricePerUnit() {
        return pricePerUnit;
    }
    public void setPricePerUnit(double price) {
        this.pricePerUnit = price;
    }

    abstract public String getCategory();
    abstract public double adjustPrice(LocalDate entryDate, LocalDate expirationDate);

}
