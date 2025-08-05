
//Hierarchical Inheritance
import java.util.*;

class Vehicle {
    String model;
    String color;
    float millage;
    float tank_capacity;
    int mfg_year;

    Vehicle(String model, String color, float millage, float tank_capacity, int mfg_year) {
        this.model = model;
        this.color = color;
        this.millage = millage;
        this.tank_capacity = tank_capacity;
        this.mfg_year = mfg_year;
    }

    public void showVehicleMasterDetails() {
        System.out.println("Model: " + this.model);
        System.out.println("Color: " + this.color);
        System.out.println("Millage: " + this.millage);
        System.out.println("Tank Capacity: " + this.tank_capacity);
        System.out.println("Mfg.Year: " + this.mfg_year);
    }
}

class Honda extends Vehicle {
    String airbrake;

    Honda(String model, String color, float millage, float tank_capacity, int mfg_year, String airbrake) {
        super(model, color, millage, tank_capacity, mfg_year);
        this.airbrake = airbrake;
    }

    void showVehicleDetails() {
        showVehicleMasterDetails();
        System.out.println("AirBrake: " + this.airbrake);
    }
}

class Bullet extends Vehicle {
    int no_of_pistons;

    Bullet(String model, String color, float millage, float tank_capacity, int mfg_year, int no_of_pistons) {
        super(model, color, millage, tank_capacity, mfg_year);
        this.no_of_pistons = no_of_pistons;

    }

    void showVehicleDetails() {
        showVehicleMasterDetails();
        System.out.println("No of Pistons: " + this.no_of_pistons);
    }
}

class Bajaj extends Vehicle {
    String disc_brake;

    Bajaj(String model, String color, float millage, float tank_capacity, int mfg_year, String disc_brake) {
        super(model, color, millage, tank_capacity, mfg_year);
        this.disc_brake = disc_brake;
    }

    void showVehicleDetails() {
        showVehicleMasterDetails();
        System.out.println("Disk Break: " + this.disc_brake);
    }
}

class Prog4 {
    public static void main(String args[]) {
        String model, color, airbrake, disc_brake;
        float millage, tank_capacity;
        int mfg_year, no_of_pistons;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Honda Vehicle Details");
        System.out.println("Enter Vehicle Model");
        model = in.next();
        System.out.println("Enter Vehicle Color");
        color = in.next();
        System.out.println("Enter Vehicle Millage");
        millage = in.nextFloat();
        System.out.println("Enter Vehicle Tank Capacity");
        tank_capacity = in.nextFloat();
        System.out.println("Enter Vehicle Mfg. year");
        mfg_year = in.nextInt();
        System.out.println("Enter Vehicle Airbrake");
        airbrake = in.next();
        Honda honda = new Honda(model, color, millage, tank_capacity, mfg_year, airbrake);
        System.out.println("Enter Buulet Vehicle Details");
        System.out.println("Enter Vehicle Model");
        model = in.next();
        System.out.println("Enter Vehicle Color");
        color = in.next();
        System.out.println("Enter Vehicle Millage");
        millage = in.nextFloat();
        System.out.println("Enter Vehicle Tank Capacity");
        tank_capacity = in.nextFloat();
        System.out.println("Enter Vehicle Mfg. year");
        mfg_year = in.nextInt();
        System.out.println("Enter Vehicle No of Pistons");
        no_of_pistons = in.nextInt();

        Bullet bullet = new Bullet(model, color, millage, tank_capacity, mfg_year, no_of_pistons);

        System.out.println("Enter Baja Vehicle Details");
        System.out.println("Enter Vehicle Model");
        model = in.next();
        System.out.println("Enter Vehicle Color");
        color = in.next();
        System.out.println("Enter Vehicle Millage");
        millage = in.nextFloat();
        System.out.println("Enter Vehicle Tank Capacity");
        tank_capacity = in.nextFloat();
        System.out.println("Enter Vehicle Mfg. year");
        mfg_year = in.nextInt();
        System.out.println("Enter Vehicle Disk Brake");
        disc_brake = in.next();
        Bajaj bajaj = new Bajaj(model, color, millage, tank_capacity, mfg_year, disc_brake);
        honda.showVehicleDetails();
        bullet.showVehicleDetails();
        bajaj.showVehicleDetails();
    }
}