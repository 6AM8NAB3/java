package Car;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar ele = new ElectricCar();
        ele.move();
        ele.charge();

        GasCar gas = new GasCar();
        gas.move();
        gas.charge();
    }
}

