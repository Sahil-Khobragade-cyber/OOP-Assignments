/*3. Define a class CARRENTAL with the following details:
 Class Members are: CarId of int type, CarType of string type and Rent of
float type.
 Define GetCar() method which accepts CarId and CarType.
 GetRent() method which return rent of the car on the basis of car type, i.e.
Small Car = 1000, Van = 800, SUV = 2500
 ShowCar() method which allow user to view the contents of cars i.e. id, type
and rent. */

class CARRENTAL {
    int CarId;
    String CarType;
    float Rent;

    void GetCar(int id, String type) {
        CarId = id;
        CarType = type;
    }

    float GetRent() {
        if (CarType.equalsIgnoreCase("Small Car")) Rent = 1000;
        else if (CarType.equalsIgnoreCase("Van")) Rent = 800;
        else if (CarType.equalsIgnoreCase("SUV")) Rent = 2500;
        return Rent;
    }

    void ShowCar() {
        System.out.println(CarId + " " + CarType + " " + Rent);
    }
}

public class Demo {
    public static void main(String[] args) {
        CARRENTAL c = new CARRENTAL();
        c.GetCar(101, "Van");
        c.GetRent();
        c.ShowCar();
    }
}