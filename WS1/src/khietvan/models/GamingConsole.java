package khietvan.models;

public class GamingConsole extends EntertainmentDevices{

    public GamingConsole(String name, double cost, String functionType, String functionality) {
        super(name, cost, functionType, functionality);
    }

    public GamingConsole(double cost){
        this("GamingConsole",cost,"Interactive entertainment","Video gaming");
    }

    @Override
    public String operatingInstructions(){
        return "By using game controllers";
    }

    public String maintenanceInstructions(){
        return "Clean vents, software updates";
    }
}
