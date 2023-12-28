import java.io.IOException;
import java.nio.CharBuffer;

public class Car extends Vehicle implements Readable{
    private boolean rented ;
    private String name ;
    private Integer numberOfDay ;
    public Car(String brand, String model, Integer year, Integer id) {
        super(brand, model, id, year);
        rented = false;
    }

    public boolean isRented() {
        return rented;
    }

    public void setRented(boolean rented) {
        this.rented = rented;
    }
    public void setName(String name){
        this.name = name ;
    }
    public void setNumberOfDay(Integer numberOfDay){
        this.numberOfDay = numberOfDay ;
    }
    public Integer getNumberOfDay(){
        return numberOfDay;
    }
    public String getName() {
        return this.name;
    }

    @Override
    public void rent() {
        if (!rented) {
            System.out.println("Renting the car.");
            rented = true;
        } else {
            System.out.println("Car is already rented.");
        }
    }
    public Boolean isRent(){
        return rented;
    }

    @Override
    public void start() {
        System.out.println("Starting the car engine.");
    }
    @Override
    public void returnVehicle() {
        if (rented) {
            System.out.println("Returning the car.");
            rented = false;
        } else {
            System.out.println("Car is not currently rented.");
        }
    }

    public String toString() {
         super.displayInfo();
         return "\n the price is :" + numberOfDay * 5;
    }


    @Override
    public int read(CharBuffer cb) throws IOException {
        return 0;
    }
}
