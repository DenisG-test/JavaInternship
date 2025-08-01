public class Adopter {
    private String name;
    private int budget;
    private int height;
    private int weight;

    public Adopter(String name, int budget, int height, int weight) {
        this.name = name;
        this.budget = budget;
        this.height = height;
        this.weight = weight;
    }

    public Adopter() {
        this.name   = "";
        this.budget = 0;
        this.height = 0;
        this.weight = 0;
    }

    public String getName() {
        return name;
    }
    public int    getBudget() { return budget; }
    public int    getHeight() { return height; }
    public int    getWeight() { return weight; }
    public void setName(String name) {
        this.name  = name;
    }
    public void setBudget(int budget) { this.budget = budget; }
    public void setHeight(int height) { this.height = height; }
    public void setWeight(int weight) { this.weight = weight; }

    public void adopts(){
        System.out.println("Adopter is trying to adopt");
    }
    public void leave(){
        System.out.println("Adopter is leaving the clinic");
    }

}
