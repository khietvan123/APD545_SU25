package khietvan.models;

import khietvan.interfaces.IDeviceOperable;

public abstract class EntertainmentDevices extends ElectronicDevice implements IDeviceOperable {

    public EntertainmentDevices(String name, double cost, String functionType, String functionality) {
        super(name, cost, functionType, functionality);
    }


}
