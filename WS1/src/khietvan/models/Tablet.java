package khietvan.models;

public class Tablet extends CommunicationDevices{
    public Tablet(String name, double cost, String functionType, String functionality) {
        super(name, cost, functionType, functionality);
    }

    public Tablet(double cost){
        this("Tablet",cost,"Multi-functional","Larger screen communication");//hard code constructor
    }

    @Override
    public String operatingInstructions(){
        return "By using touchscreen";
    }

    public String maintenanceInstructions(){
        return "Regular software updates";
    }
}
