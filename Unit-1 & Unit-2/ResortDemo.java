/*4. Define a class Resort with the following description:
 Members are: RNo to store Room Number, Name store customer name,
Charges to store per day charges, Days to store number of days of stay.
 Member functions:
 Compute() to calculate and return Amount as Days * Charges and if the
values of Days*Charges is more than 11000 then as 1.02*Days*Charges
 Getinfo() A function to enter the content Rno, Name, Charges and Days.
 DispInfo() A function to enter the content Rno, Name, Charges, Days and
Amount by calling function Compute(). */

class Resort {
    int RNo, Days;
    String Name;
    float Charges, Amount;

    void Getinfo(int r, String n, float c, int d) {
        RNo = r;
        Name = n;
        Charges = c;
        Days = d;
    }

    float Compute() {
        Amount = Days * Charges;
        if (Amount > 11000)
            Amount = 1.02f * Amount;
        return Amount;
    }

    void DispInfo() {
        Compute();
        System.out.println(RNo + " " + Name + " " + Charges + " " + Days + " " + Amount);
    }
}

public class ResortDemo {
    public static void main(String[] args) {
        Resort r = new Resort();
        r.Getinfo(101, "Darshan", 2000, 6);
        r.DispInfo();
    }
}