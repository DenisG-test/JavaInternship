public class CatAdopter extends Adopter{
    private boolean onTime;

    public CatAdopter(String name, int budget, int height, int weight,  boolean onTime) {
        super(name, budget, height, weight);
        this.onTime = onTime;
    }

    public CatAdopter() {
        super();
        this.onTime = false;
    }

    public boolean getOnTime() {
        return onTime;
    }
    public void setOnTime(boolean onTime) {
        this.onTime = onTime;
    }

    @Override
    public void adopts(){
        System.out.println("Adopter is adopting a cute dog");
    }

    public void leave() {
        super.leave();
    }

    public void isLate(){ System.out.println("Adopter is on time: " +getOnTime()); }

}
