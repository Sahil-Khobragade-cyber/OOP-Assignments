/*15. A ride booking application supports different types of rides. Each ride calculates
fare differently.
Question:
Create an abstract class Ride with:
 distance
 abstract method calculateFare()
Create subclasses:
 BikeRide → fare = ₹5 per km
 AutoRide → fare = ₹8 per km
 CarRide → fare = ₹12 per km
Store different rides in a Ride array and calculate fares using runtime
polymorphism.*/

abstract class Ride {
    double distance;

    Ride(double distance) {
        this.distance = distance;
    }

    abstract double calculateFare();
}

class BikeRide extends Ride {
    BikeRide(double d) {
        super(d);
    }

    double calculateFare() {
        return distance * 5;
    }
}

class AutoRide extends Ride {
    AutoRide(double d) {
        super(d);
    }

    double calculateFare() {
        return distance * 8;
    }
}

class CarRide extends Ride {
    CarRide(double d) {
        super(d);
    }

    double calculateFare() {
        return distance * 12;
    }
}

public class RideDemo {
    public static void main(String[] args) {

        Ride[] rides = {
            new BikeRide(10),
            new AutoRide(10),
            new CarRide(10)
        };

        for (Ride r : rides) {
            System.out.println("Fare: ₹" + r.calculateFare());
        }
    }
}