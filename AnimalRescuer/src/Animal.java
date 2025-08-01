public class Animal {
    private String  name;
    private String  preferredFood;
    private String  preferredActivity;
    private int     age;
    private int healthScore;
    private int hungryScore;
    private int dispositionScore;


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

    public String getName               () {
        return name;
    }
    public int    getAge                () {
        return age;
    }
    public int    getHealthScore        () { return healthScore; }
    public int    getHungryScore        () { return hungryScore; }
    public int    getDispositionScore   () { return dispositionScore; }
    public String getPreferredFood      () { return preferredFood; }
    public String getPreferredActivity  () { return preferredActivity; }

    public void setName             (String name)            {
        this.name = name;
    }
    public void setAge              (int age) {
        this.age = age;
    }
    public void setHealthScore      (int healthScore)           { this.healthScore = healthScore; }
    public void setHungryScore      (int hungryScore)           { this.hungryScore = hungryScore; }
    public void setDispositionScore (int dispositionScore)      { this.dispositionScore = dispositionScore; }
    public void setPreferredFood    (String preferredFood)      { this.preferredFood = preferredFood; }
    public void setPreferredActivity(String preferredActivity)  { this.preferredActivity = preferredActivity; }
}
