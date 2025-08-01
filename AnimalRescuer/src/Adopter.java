public class Adopter {
    private String name;
    public int budget;

    public Adopter(String name, int budget) {
        this.name   = name;
        this.budget = budget;
    }

    public Adopter() {
        this.name   = "";
        this.budget = 0;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name  = name;
    }

}
