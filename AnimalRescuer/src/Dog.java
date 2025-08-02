public class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, int healthScore, int hungryScore, int dispositionScore, String preferredFood, String preferredActivity, String breed) {
        super(name, age, healthScore, hungryScore, dispositionScore, preferredFood, preferredActivity);
        this.breed = breed;
    }

    public Dog() {
        super();
        this.breed = "";
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " the dog is eating " + getPreferredFood());
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " the dog is sleeping");
    }

    public void bark() {
        System.out.println(getName() + " the dog is barking");
    }
}

