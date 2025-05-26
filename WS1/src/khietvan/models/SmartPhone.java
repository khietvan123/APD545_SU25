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
