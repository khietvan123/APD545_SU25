package khietvan.models;

import khietvan.interfaces.IDeviceMaintainable;

public abstract class CommunicationDevices extends ElectronicDevice implements IDeviceMaintainable {
    public CommunicationDevices(String name, double cost, String functionType, String functionality) {
        super(name, cost, functionType, functionality);
    }

    @Override
    public String maintenanceInstructions(){
        return "";
    }
}
