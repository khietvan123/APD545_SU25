package khietvan.models;

public abstract class ElectronicDevice {
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
    public String toString() {
        return "ElectronicDevice{" +
                "m_name='" + m_name + '\'' +
                ", m_cost=" + m_cost +
                ", m_functionType='" + m_functionType + '\'' +
                ", m_functionality='" + m_functionality + '\'' +
                '}';
    }


}
