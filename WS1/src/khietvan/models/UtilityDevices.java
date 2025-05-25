package khietvan.models;

import khietvan.interfaces.IDeviceOperable;

public abstract class UtilityDevices extends ElectronicDevice implements IDeviceOperable {
    public UtilityDevices(String name, double cost, String functionType, String functionality) {
        super(name, cost, functionType, functionality);
    }
}
