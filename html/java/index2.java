import java.util.*;
public class index2 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
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
        }
    }
}
