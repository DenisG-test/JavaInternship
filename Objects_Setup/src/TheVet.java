public class TheVet {
    private String name;

    public String speciality;

    public TheVet(String name, String speciality) {
        this.name = name;
        this.speciality = speciality;
    }

    public TheVet(){
        this.name = "";
        this.speciality = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
