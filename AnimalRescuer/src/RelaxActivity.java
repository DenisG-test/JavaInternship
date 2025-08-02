public class RelaxActivity {
    private String name;
    private int duration;

    public RelaxActivity(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    public RelaxActivity() {
        this.name = "";
        this.duration = 0;
    }

    public String getName() {
        return name;
    }
    public int getDuration() { return duration;}
    public void setName(String name) {
        this.name = name;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void getReady(){ System.out.println("Somebody is ready to go out"); }

}
