package ca.khietvan.com.models;

public abstract class ElectronicDevice {
    private String m_name;
    private double m_cost;
    private String m_functionType;
    private String m_functionality;

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


}
