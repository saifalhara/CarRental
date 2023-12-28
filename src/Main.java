import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Car[] cars = new Car[10];
        cars[0] = new Car("Toyota", "Camry", 2022, 123);
        cars[1] = new Car("Honda", "Civic", 2023, 456);
        cars[2] = new Car("Ford", "Mustang", 2021, 789);
        cars[3] = new Car("Chevrolet", "Malibu", 2020, 101112);
        cars[4] = new Car("Tesla", "Model 3", 2023, 131415);
        cars[5] = new Car("Volkswagen", "Golf", 2022, 161718);
        cars[6] = new Car("BMW", "X5", 2021, 192021);
        cars[7] = new Car("Mercedes-Benz", "C-Class", 2023, 222324);
        cars[8] = new Car("Audi", "A4", 2022, 252627);
        cars[9] = new Car("Nissan", "Altima", 2021, 282930);
        System.out.print("Please select the number of user: ");
        int numberOfUsers = input.nextInt();
        System.out.println();
        while (numberOfUsers-- > 0) {
            System.out.println("This is the car available to rent");
            for (int i = 0; i < 10; i++) {
                if (!cars[i].isRent()) {
                    System.out.println("the number of car is : " + (i + 1) + " ");
                    cars[i].displayInfo();
                }
            }

            System.out.println("Please enter your name");
            String name = input.next();
            System.out.println("Please insert the number of day you want to rent the car");
            int numberOfYear = input.nextInt();
            System.out.println("Enter the start date (Day/Month)");
            String startDate = input.next();
            System.out.println("Enter the end date (Day/Month)");
            String endDate = input.next();
            System.out.println("please select the number of car you need to rent");

            int number = input.nextInt();
            number--;
            if (number < 0 || number >= 10) {
                System.out.println("Enter valid number of car between (1 , 10 ) to rent");
                numberOfUsers++;
            }
            cars[number].rent();
            cars[number].setNumberOfDay(numberOfYear);
            cars[number].setName(name);

            Customer customer = new Customer(name, startDate, endDate, cars[number]);
            System.out.println(customer.toString());
        }
    }
}