import java.util.*;
public class project {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println();
            System.out.println("1. Marks Calculator\n\n2. About Your Trolly Income And Expenses\n\n3. Employee Basic Pay\n\n4. ATM\n\n5. Factorial\n\n6.Unit converter \n\n7. Calculator");
            System.out.print("Enter your choice=");
            int select=scan.nextInt();
            switch (select){
                case 1:
                    int sum=0;
                    for (int i = 0; i < 5; i++) {
                        System.out.print("Enter your marks of any subject =");
                        int marks=scan.nextInt();
                        do {
                            if (marks>100){
                                System.out.print("!Error NO#01 Enter your marks below than 100 or equal to 100 = ");
                                marks=scan.nextInt();
                            }
                        } while (marks>100);
                        if(marks<=100){
                            sum +=marks;
                        }
                        System.out.println();
                    }
                    System.out.println("Total marks ="+sum);
                    int percen=(sum*100)/500;
                    System.out.println("Percentage ="+percen+"%");
                    if(percen<=40){
                        System.out.println("Congratolations Your are fail");
                    }
                    else if(percen<=60){
                        System.out.println("you have accqiured Grade C");
                    }
                    else if(percen<=70){
                        System.out.println("you have accqiured Grade B");
                    }
                    else if(percen<=80){
                        System.out.println("Congratolations you have accqiured Grade A");
                    }
                    else{
                        System.out.println("Congratolations you have accqiured Grade A+");
                    }
                    break;
                case 2:
                    System.out.print("Enter how many trollys are loaded today=");
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
                    break;
                case 3:
                    System.out.print("Enter your salary = ");
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
                    break;
                case 4:
                    System.out.print("Enter the amount you want to withdraw =");
                    int amount=scan.nextInt();
                    int fiveth=amount/5000;
                    int oneth=(amount%5000)/1000;
                    int fivehundred=((amount%5000)%1000)/500;
                    int onehundred=(((amount%5000)%1000)%500)/100;
                    int tweentyrupee=((((amount%5000)%1000)%500)%100)/20;
                    int tenrupee=(((((amount%5000)%1000)%500)%100)%20)/10;
                    int tworupee=((((((amount%5000)%1000)%500)%100)%20)%10)/2;
                    int onerupee=(((((((amount%5000)%1000)%500)%100)%20)%10)%2);
                    System.out.println(fiveth+" Five thousand");
                    System.out.println(oneth+" One thousand");
                    System.out.println(fivehundred+" Five hundred");
                    System.out.println(onehundred+" One hundred");
                    System.out.println(tweentyrupee+" Tweenty rupee");
                    System.out.println(tenrupee+" Ten rupee");
                    System.out.println(tworupee+" Ten rupee");
                    System.out.println(onerupee+" One rupee");
                    System.out.println("thank you for using ATM");
                    break;
                case 5:
                    System.out.print("Enter a factorial = ");
                    int num=scan.nextInt();
                    int factorial=1;
                    if(num==0){
                        System.out.println("value of that factorial = 0");
                    }
                    else{
                        for(int i=1;i<=num;i++){
                            factorial=factorial*i;
                            if(i==num){
                                System.out.println("value of that factorial ="+factorial);
                                
                            }
                        }
                    }
                    break;
                case 6:
                    System.out.println("1. Convert meters into killometer\n\n2. Convert meters into feet\n\n3. Convert meters into inch");
                    System.out.print("Enter your choice =");
                    int select1=scan.nextInt();
                    System.out.print("Enter the meters =");
                    double meters =scan.nextDouble();
                    switch (select1){
                        case 1:
                            meters=Math.round(meters);
                            System.out.print("Killometers ="+(meters/1000));
                        break;
                        case 2:
                            meters=Math.round(meters);
                            System.out.print("foots ="+(meters*3.281));
                        break;
                    }
                    
                    break;    
                case 7:
                    System.out.println("Enter two values all operations will be perfromed\n");
                    System.out.println("Enter the value of a");
                    double a=scan.nextDouble();
                    System.out.println("Enter the value of b");
                    double b=scan.nextDouble();
                    System.out.println("   a + b = "+(a+b));
                    System.out.println("   a - b = "+(a-b));
                    System.out.println("   a x b = "+(a*b));
                    System.out.println("   a / b = "+(a/b));
                    break;
            }
        }
    }
}