import javax.xml.namespace.QName;
import java.util.Date;
import java.util.stream.Stream;

public class Customer {
    String name;
    String startDate;
    String endDate;

    Car car ;
    public Customer(String name, String startDate, String endDate , Car car) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.name = name;
        this.car = car;
    }

    public String toString() {
        return name + " rent the car form " + startDate + " to " + endDate + " " + car.toString();
    }
}
