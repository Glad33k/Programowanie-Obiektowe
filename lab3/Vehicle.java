package zad3;

import java.util.Objects;

public class Vehicle {
    public String brand;
    public String model;
    public int yearOfProduction;

    public Vehicle(String brand, String model, int yearOfProduction){
        this.yearOfProduction = Math.min(yearOfProduction, 2025);
        if(brand == null || brand.isEmpty()){
            this.brand="";
        }
        else{
            this.brand=brand;
        }
        if(model == null || model.isEmpty()){
            this.model="";
        }
        else{
            this.model=model;
        }
    }

    @Override
    public String toString() {
        return
                "Vehicle: " + brand + ' ' +
                  model + ", Year: " +
                yearOfProduction +
                '.';
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Vehicle vehicle)) {
            return false;}
            return this.yearOfProduction == vehicle.yearOfProduction
                    && this.brand.equals(vehicle.brand)
                    && this.model.equals( vehicle.model);
        }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, yearOfProduction);
    }

    public static void main(String[] args) {
        Vehicle auto1=new Vehicle("Opel","Astra",2005);
        Vehicle auto2=new Vehicle("Opel","Astra",2005);
        System.out.println(auto1);
        System.out.println(auto2.equals(auto1));
        System.out.println(auto1.hashCode()==auto2.hashCode());
    }
}


