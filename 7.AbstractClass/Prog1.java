abstract class Bike {
    public static final String cname = "KKCC INFO SYSTEMS";
    public String city = "";

    public void showCity() {
        System.out.println("City:" + city);
    }

    abstract void getBenifit();
}

class Honda extends Bike {
    void getBenifit() {
        System.out.println("Hond runs very smooth " + city);
    }
}

class Bullet extends Bike {
    void getBenifit() {
        System.out.println("Its high pickup vehicle");
    }
}

class Bajaj extends Bike {
    void getBenifit() {
        System.out.println("It gives more millage");
    }
}

public class Prog1 {
    public static void main(String args[]) {
        Bike honda = new Honda();
        Bike bullet = new Bullet();
        Bike bajaj = new Bajaj();
        // honda.cname="Hello";
        honda.city = "Ongole";
        honda.getBenifit();
        honda.showCity();
        bullet.getBenifit();
        bullet.showCity();
        bajaj.getBenifit();
        bajaj.showCity();
    }
}