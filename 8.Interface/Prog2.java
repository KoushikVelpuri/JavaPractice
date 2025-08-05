interface Bike {
    public String cname = "KKCC INFO SYSTEMS";
    public String city = "Ongole";

    public void getBenifit();
}

class Honda implements Bike {
    @Override
    public void getBenifit() {
        System.out.println("Hond runs very smooth " + city);
    }
}

class Bullet implements Bike {
    @Override
    public void getBenifit() {
        System.out.println("Its high pickup vehicle");
    }
}

class Bajaj implements Bike {
    @Override
    public void getBenifit() {
        System.out.println("It gives more millage");
    }
}

public class Prog2 {
    public static void main(String args[]) {
        Bike honda = new Honda();
        Bike bullet = new Bullet();
        Bike bajaj = new Bajaj();
        honda.getBenifit();
        bullet.getBenifit();
        bajaj.getBenifit();
    }
}