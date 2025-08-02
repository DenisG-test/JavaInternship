public class Puppy extends Dog {
    private String trainingLevel;

    public Puppy(String name, int age, int healthScore, int hungryScore, int dispositionScore, String preferredFood, String preferredActivity, String breed, String trainingLevel) {
        super(name, age, healthScore, hungryScore, dispositionScore, preferredFood, preferredActivity, breed);
        this.trainingLevel = trainingLevel;
    }

    public Puppy() {
        super();
        this.trainingLevel = "";
    }

    public String getTrainingLevel() {
        return trainingLevel;
    }

    public void setTrainingLevel(String trainingLevel) {
        this.trainingLevel = trainingLevel;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " the puppy is eating " + getPreferredFood());
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " the puppy is sleeping");
    }

    @Override
    public void bark() {
        System.out.println(getName() + " the puppy is barking");
    }

    public void play() {
        System.out.println(getName() + " the puppy is playing");
    }
}

