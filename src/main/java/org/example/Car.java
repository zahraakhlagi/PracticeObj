package org.example;

public class Car {
    //private instance variable
    private String company_name;
    private String model_name;
    private int year;
    private  double mileage;

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getModel_name() {
        return model_name;
    }

    public void setModel_name(String model_name) {
        this.model_name = model_name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getMileage() {
        return mileage;
    }
    public static void main(String[] args) {
        //create object of car
        Car car= new Car();
        //set the values using the setter method
        car.setCompany_name("Scania");
        car.setModel_name("scania1");
        car.setYear(2020);

        //set values using the getter method
       String company_name= car.getCompany_name();
       String model_name= car.getModel_name();
       int year=car.getYear();
       double mileage=  car.getMileage();

       System.out.println(company_name);
       System.out.println(model_name);
       System.out.println(year);
       System.out.println(mileage);
    }
}
