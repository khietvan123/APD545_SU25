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
package khietvan.controllers;
import khietvan.models.ElectronicDevice;
import khietvan.models.*;

import java.util.Arrays;
import java.util.Scanner;

public class DeviceController {
    private ElectronicDevice[] m_devices;

    private double getPrice(Scanner sc,String name){
        System.out.print("Enter the price for "+name+": ");
        return sc.nextDouble();
    }

    //Requirement 1
    public void initializeDevices(Scanner sc){
        m_devices = new ElectronicDevice[]{ //create an array of obj
                new SmartPhone(getPrice(sc, "SmartPhone")),         //get the double then store it in the constructor (shorter code teehee ;D ) --> Delete this when submit
                new Tablet(getPrice(sc, "Tablet")),
                new GamingConsole(getPrice(sc, "GamingConsole")),
                new SmartTV(getPrice(sc, "SmartTV")),
                new SmartSpeaker(getPrice(sc, "SmartSpeaker"))
        };
        System.out.println(); // new line
    }

    //Requirement 2
    public ElectronicDevice mostExpensiveDevice() {
        if (m_devices == null || m_devices.length == 0) {
            return null; // or throw an exception if appropriate
        }

        int resultIndex = 0;

        for (int i = 1; i < m_devices.length; i++) {
            if (m_devices[i].getCost() > m_devices[resultIndex].getCost()) {
                resultIndex = i;
            }
        }

        System.out.println("The most expensive device is: " + m_devices[resultIndex].getName());
        return m_devices[resultIndex];
    }

    //Requirement 3
//    public void sortPriceAndPrint(){    //bubble sort --> Normal Way
//        int n = m_devices.length;
//        boolean swapped;
//
//        for(int i = 0 ; i < n-1 ; i++) {
//            swapped = false;
//            for (int j = 0; j < n - i - 1; j++) {
//                if (m_devices[j].getCost() < m_devices[j + 1].getCost()) {
//                    ElectronicDevice temp = m_devices[j];
//                    temp = m_devices[j];
//                    m_devices[j] = m_devices[j + 1];
//                    m_devices[j + 1] = temp;
//                    swapped = true;
//                }
//            }
//        }
//        printAllDevice();
//        System.out.println(); //empty line
//    }

    //Requirement 4
    public void functionalityInformation(String category) {
        System.out.println("\nFunctionality of " + category + ":");
        for (ElectronicDevice d : m_devices) {
            switch (category) {
                case "CommunicationDevices":
                    if (d instanceof CommunicationDevices)
                        System.out.println(d.getName() + ": " + d.deviceFunctionality());
                    break;
                case "EntertainmentDevices":
                    if (d instanceof EntertainmentDevices)
                        System.out.println(d.getName() + ": " + d.deviceFunctionality());
                    break;
                case "UtilityDevices":
                    if (d instanceof UtilityDevices)
                        System.out.println(d.getName() + ": " + d.deviceFunctionality());
                    break;
            }
        }
    }

    //Requirement 5
    public void sortPriceAndPrint(){
        int n = m_devices.length;
        boolean swapped;

        for(int i = 0 ; i < n-1 ; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (m_devices[j].compareTo(m_devices[j + 1]) > 0) { // Use compareTo to sort descending (most expensive first)
                    ElectronicDevice temp = m_devices[j];
                    m_devices[j] = m_devices[j + 1];
                    m_devices[j + 1] = temp;
                    swapped = true;
                }
            }
        }
        printAllDeviceName();
        System.out.println(); //empty line
    }


        //Test input
    public void printAllDeviceName(){
        for(int i = 0 ; i < m_devices.length;i++){
            System.out.println(m_devices[i].toString());
        }
    }
}
