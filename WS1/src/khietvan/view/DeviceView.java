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

package khietvan.view;

import khietvan.controllers.DeviceController;
import khietvan.interfaces.IDeviceMaintainable;
import khietvan.interfaces.IDeviceOperable;
import khietvan.models.ElectronicDevice;
import khietvan.models.SmartTV;

import java.util.Scanner;

public class DeviceView {
    private DeviceController m_controller;

    public DeviceView(DeviceController m_controller) {
        this.m_controller = m_controller;
    }

    public void printDevice(ElectronicDevice device){
        System.out.println(device.getName()+"'s cost is: "+device.getCost());
        if(device instanceof IDeviceOperable){
            System.out.println(device.getName()+" is operated: "+((IDeviceOperable)device).operatingInstructions());
        }
        if(device instanceof IDeviceMaintainable){
            System.out.println(device.getName()+" maintenance: "+((IDeviceMaintainable)device).maintenanceInstructions());
        }
        System.out.println(device.getName()+" function type: "+device.getFunctionType());
        System.out.println(); //empty line
    }

    public void runProgram(){
        Scanner sc = new Scanner(System.in);

        System.out.println("--:Requirement 1:--");
        m_controller.initializeDevices(sc);

        System.out.println("--:Requirement 2:--");
        printDevice((m_controller.mostExpensiveDevice()));

        System.out.println("--:Requirement 3:--");
        m_controller.sortPriceAndPrint();

        System.out.println("--:Requirement 4:--");
        System.out.print("Enter a device category (CommunicationDevices, EntertainmentDevices, UtilityDevices): ");
        sc.nextLine();
        m_controller.functionalityInformation(sc.nextLine());

    }
}
