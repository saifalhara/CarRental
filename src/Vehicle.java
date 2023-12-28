public abstract class Vehicle {
     String brand ;
     String model ;
     Integer id ;
     Integer year ;

    public Vehicle(String brand , String model , Integer id , Integer year) {
        this.brand = brand;
        this.id = id;
        this.model = model;
        this.year = year;
    }

    public abstract void rent();

    public abstract void returnVehicle();

    public abstract void start();

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year:  " + year);
        System.out.println("Id: " + id);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear( Integer year) {
        this.year = year;
    }
}
