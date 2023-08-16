import java.util.*;
public class index4 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int loadperday=scan.nextInt();
            int trollyrecive=loadperday*1800;
            int drivertakeperday=loadperday*150;
            int paytaxpeerday=(10*1800/100)*loadperday;
            int fuelperday=(2*273)*loadperday;
            int income=trollyrecive-drivertakeperday-paytaxpeerday-fuelperday;
            System.out.println("load per day = "+ loadperday);
            System.out.println("trolly recive per day = "+ trollyrecive);
            System.out.println("driver salary per day = " +drivertakeperday);
            System.out.println("Pay tax per day = "+paytaxpeerday);
            System.out.println("fuel per day = "+ fuelperday);
            System.out.println("income = "+ income);
        }
    }
}
