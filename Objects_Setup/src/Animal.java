public class Animal {
    private String  name;
    private int     age;

    public int healthScore;
    public int hungryScore;
    public int dispositionScore;

    public String preferredFood;
    public String preferredActivity;

    public Animal(String name, int age, int healthScore, int hungryScore, int dispositionScore, String preferredFood, String preferredActivity) {
        this.name               = name;
        this.age                = age;
        this.healthScore        = healthScore;
        this.hungryScore        = hungryScore;
        this.dispositionScore   = dispositionScore;
        this.preferredFood      = preferredFood;
        this.preferredActivity  = preferredActivity;
    }

    public Animal(){
        this.name              = "";
        this.age               = 0;
        this.healthScore       = 0;
        this.hungryScore       = 0;
        this.dispositionScore  = 0;
        this.preferredFood     = "";
        this.preferredActivity = "";
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
