package NullObjectDesignPattern;

public class Main {

    public static void main(String args[]){

        VehicleFactory vehicleObj = new VehicleFactory();
        Vehicle vehicle = vehicleObj.getVehicleObject("Bike");
        printVehicleDetails(vehicle);
    }


    private static void printVehicleDetails(Vehicle vehicle) {

        // ab mujhe yha if(vehicle != null) likhne ki need nahi hai
        System.out.println("Seating Capacity: " + vehicle.getSeatingCapacity());
        System.out.println("Fuel Tank Capacity: " + vehicle.getTankCapacity());
    }
}

