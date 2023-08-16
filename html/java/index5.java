import java.util.*;
public class index5 {
    public static void main(String[] args) {
        System.out.print("Enter your your salary = ");
        try (Scanner scan = new Scanner(System.in)) {
            int salary=scan.nextInt();
            int houserent=45*salary/100;
            int medicalalowance=15*salary/100;
            int bouns= 5*salary/100;
            int grosspay=salary+medicalalowance+bouns;
            int incometax=5*salary/100;
            double bills=2.5*salary/100;
            int conuanceAllowance=8*salary/100;
            double expenses=houserent+incometax+bills+conuanceAllowance;
            double incomeafterexpenses=grosspay-expenses;
            System.out.println("House rent = "+houserent);
            System.out.println("Medical allowance = "+medicalalowance);
            System.out.println("bouns = "+bouns);
            System.out.println("Grosspay = "+grosspay);
            System.out.println("Income tax = "+incometax);
            System.out.println("Bills = "+bills);
            System.out.println("Conuance allowance = "+conuanceAllowance);
            System.out.println("Total expenses = "+expenses);
            System.out.println("Income after expenses = "+incomeafterexpenses);
        }
 
    }
}
