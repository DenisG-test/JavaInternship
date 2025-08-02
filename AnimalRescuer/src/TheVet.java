public class TheVet {
    private String name;
    private String speciality;

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
    public String getSpeciality() { return speciality;}

    public void setName(String name) {
        this.name = name;
    }
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public void isOperating(){
        System.out.println("The Vet is operating");
    }

    public void isConsulting(){
        System.out.println("The Vet is consulting");
    }
}
