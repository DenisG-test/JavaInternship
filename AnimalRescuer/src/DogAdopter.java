public class DogAdopter extends Adopter{
    private boolean onTime;

    public DogAdopter(String name, int budget, int height, int weight,  boolean onTime) {
        super(name, budget, height, weight);
        this.onTime = onTime;
    }

    public DogAdopter() {
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
    @Override
    public void leave(){ System.out.println("Adopter is leaving with a dog"); }


}
