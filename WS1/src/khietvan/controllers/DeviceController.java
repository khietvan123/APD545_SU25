package khietvan.controllers;
import khietvan.models.ElectronicDevice;
import khietvan.models.*;
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
    public ElectronicDevice mostExpensiveDevice(){
        int index = 1;
        int resultIndex = 0;
        for(int i = 0 ; i < m_devices.length;i++){
            if(m_devices[i].getCost() > m_devices[index++].getCost()){ //checking through all element, find the largest
                resultIndex = i;
                if(index==m_devices.length){
                    index--; //prevent index goes up too much
                }
            }
        }
        System.out.println("The most expensive device is: "+m_devices[resultIndex].getName());
        return m_devices[resultIndex];
    }



    //Test input
    public void printAllDevice(){
        for(int i = 0 ; i < m_devices.length;i++){
            System.out.println(m_devices[i].toString());
        }
    }
}
