public class Main {
    public static void main(String[] args) {
        Car car = new Car ();
        car.setMake(" Porshe ");
        car.setModel(" Carrera ");
        car.setDoors(2);
        car.setConvertible( true  );
        car.setColor(" black ");
        System.out.println(" make = " + car.getMake());
        System.out.println("model = " + car.getModel());
        car.describeCar();

        Car targa = new Car();
        targa.setMake(" Porshe ");
        targa.setModel(" targa ");
        targa.setDoors(2);
        targa.setConvertible( false  );
        targa.setColor(" red ");

    }
}