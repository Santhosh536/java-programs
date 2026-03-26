package practice_java;

class vehicle {
    String brand;
    int year;

    void startEngine() {

    }
}

class car extends vehicle {
    String fueltype;

    @Override
    void startEngine() {
        System.out.println("car engine starts");
    }

    void drive() {
        System.out.println("car is driving");
    }
}

class truck extends vehicle {
    int loadcapacity;

    @Override
    void startEngine() {
        System.out.println("truck engine starts");
    }

    void haul() {
        System.out.println("truck is hauling");
    }
}


public class demo {

	public static void main(String[] args) {
		
		car c=new car();
		c.brand="hero";
		c.year=2007;
		c.fueltype="petrol";
		System.out.println(c.brand);
		System.out.println(c.year);
		System.out.println(c.fueltype);
		c.startEngine();
		c.drive();
		
		truck t=new truck();
		t.brand="maruthi";
		t.year=2009;
		t.loadcapacity=20000;
		System.out.println(t.brand);
		System.out.println(t.year);
		System.out.println(t.loadcapacity);
		t.startEngine();
		t.haul();
	}

}
