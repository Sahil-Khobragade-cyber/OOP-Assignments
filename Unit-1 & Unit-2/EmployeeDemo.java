/*5. Define a class employee with the following specification:
 Members are: empno of type integer, ename of type String, basic, hr and da
are of type float, netpay of type float.
 Member functions:
 Calculate() : A function to find basix+hra+da with the float return type.
 havedata(): function to accept values for empno, ename, basic, hra, da and
invoke calculate() to calculate netpay.
 dispdata(): function to display all the data members. */

class employee {
    int empno;
    String ename;
    float basic, hra, da, netpay;

    float Calculate() {
        netpay = basic + hra + da;
        return netpay;
    }

    void havedata(int no, String name, float b, float h, float d) {
        empno = no;
        ename = name;
        basic = b;
        hra = h;
        da = d;
        Calculate();
    }

    void dispdata() {
        System.out.println(empno + " " + ename + " " + basic + " " + hra + " " + da + " " + netpay);
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        employee e = new employee();
        e.havedata(101, "Darshan", 10000, 2000, 1500);
        e.dispdata();
    }
}