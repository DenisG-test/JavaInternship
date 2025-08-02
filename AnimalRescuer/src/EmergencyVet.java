public class EmergencyVet extends TheVet {
    public EmergencyVet(String name, String speciality){
        super();
    }
    public EmergencyVet(){
        super();
    }

    @Override
    public void isOperating(){
        System.out.println("The vet is in an urgent situation");
    }
    @Override
    public void isConsulting(){
        System.out.println("The consultation had to be done urgently");
    }
}
