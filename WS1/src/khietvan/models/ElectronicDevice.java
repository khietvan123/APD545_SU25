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

public abstract class ElectronicDevice implements Comparable<ElectronicDevice> {
    private String m_name;
    private double m_cost;
    private String m_functionType;
    private String m_functionality;

    public ElectronicDevice(String name, double cost, String functionType, String functionality){
        m_name = name;
        m_cost = cost;
        m_functionality = functionality;
        m_functionType = functionType;
    }

    public ElectronicDevice(ElectronicDevice device){           //Copy constructor
        m_name = device.getName();
        m_cost = device.getCost();
        m_functionType = device.getFunctionType();
        m_functionality = device.deviceFunctionality();
    }

    public String getName(){
        return m_name;
    }

    public double getCost() {
        return m_cost;
    }

    public String getFunctionType(){
        return m_functionType;
    }

    public String deviceFunctionality(){
        return m_functionality;
    }

    @Override
    public String toString() { //Override just to print the name
        return this.getName();
    }

    @Override
    public int compareTo(ElectronicDevice other) {
        return Double.compare(other.getCost(), this.getCost());
    }
}
