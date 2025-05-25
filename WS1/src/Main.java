import java.util.Scanner;
import khietvan.controllers.DeviceController;
import khietvan.view.DeviceView;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DeviceController device = new DeviceController(); //private variable --> create an array of all object.
        DeviceView deviceView = new DeviceView(device);

        deviceView.runProgram();
    }
}