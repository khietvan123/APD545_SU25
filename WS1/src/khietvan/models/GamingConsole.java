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
