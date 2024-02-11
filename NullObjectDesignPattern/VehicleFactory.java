package NullObjectDesignPattern;

public class VehicleFactory {


    // implemented Factory Design Pattern here
    public static Vehicle getVehicleObject(String typeOfVehicle){

        if("Car".equals(typeOfVehicle)) {

            return new Car();
        }

        // here Null Object replaces Null return type, so mene null return krne ki jagah null object return kardia
        return new NullVehicle();
    }
}


