public class RelaxWalking extends RelaxActivity {
    public RelaxWalking(String name, int duration) {
        super(name, duration);
    }

    public RelaxWalking() {
        super();
    }

    @Override
    public void getReady() {
        System.out.println("Somebody is ready to go for a relaxing walking in the morning");
    }
}
