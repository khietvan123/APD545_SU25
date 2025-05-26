/**********************************************
 Workshop #
 Course:        APD545 - SU25
 Last Name:     Phan
 First Name:    Khiet Van
 ID:            147072235
 Section:       NAA
 This assignment represents my own work in accordance with Seneca Academic Policy.
 Khiet Van Phan
 Date:          May 25th,2025
 **********************************************/

package khietvan.models;

import khietvan.interfaces.IDeviceOperable;

public abstract class EntertainmentDevices extends ElectronicDevice implements IDeviceOperable {

    public EntertainmentDevices(String name, double cost, String functionType, String functionality) {
        super(name, cost, functionType, functionality);
    }

}
