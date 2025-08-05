//Hybrid
class Vehicles {
    void start() {
        System.out.println("Vehicle started");
    }
}

class Car extends Vehicles {
    void drive() {
        System.out.println("Car is driving");
    }
}

interface Charge {
    void charge();
}

class ElectricCar extends Car implements Charge {
    @Override
    public void charge() {
        System.out.println("Electric car is charging");
    }

    void showDetails() {
        start();
        drive();
        charge();
    }
}

class PetrolCar extends Car implements Charge {
    @Override
    public void charge() {
        System.out.println("Petrol car is Loaded");
    }

    void showDetails() {
        start();
        drive();
        charge();
    }
}

public class Prog5 {
    public static void main(String[] args) {
        ElectricCar electriccar = new ElectricCar();
        PetrolCar petrolcar = new PetrolCar();
        electriccar.showDetails();
        petrolcar.showDetails();
    }
}