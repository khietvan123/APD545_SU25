package khietvan.models;

import khietvan.interfaces.IDeviceMaintainable;

public class SmartTV extends EntertainmentDevices implements IDeviceMaintainable {

    public SmartTV(String name, double cost, String functionType, String functionality) {
        super(name, cost, functionType, functionality);
    }

    public SmartTV(double cost){
        this("SmartTV",cost,"Visual entertainment","Streaming and media viewing");
    }

    @Override
    public String operatingInstructions(){
        return "By using remote control";
    }

    public String maintenanceInstructions(){
        return "Update firmware, clean screen";
    }
}
