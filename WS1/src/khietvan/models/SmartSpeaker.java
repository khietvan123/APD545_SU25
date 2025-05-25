package khietvan.models;

public class SmartSpeaker extends UtilityDevices {

    public SmartSpeaker(String name, double cost, String functionType, String functionality) {
        super(name, cost, functionType, functionality);
    }

    public SmartSpeaker(double cost){
        this("SmartSpeaker",cost,"Audio assistance","Voice-controlled assistance");
    }

    @Override
    public String operatingInstructions(){
        return "";
    }
}
