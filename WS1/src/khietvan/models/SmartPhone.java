package khietvan.models;

public class SmartPhone extends CommunicationDevices{
    public SmartPhone(String name, double cost, String functionType, String functionality) {
        super(name, cost, functionType, functionality);
    }

    public SmartPhone(double cost){
        this("Smartphone",cost,"Multi-functional","Communication and apps"); //hard code constructor
    }

    @Override
    public String operatingInstructions(){
        return "By using touchscreen";
    }

    public String maintenanceInstructions(){
        return "Regular software updates";
    }
}
