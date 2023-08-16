public class index1 {
    public static void main(String[] args) {
        for(int k=0;k<16;k++){
            if(k<=8){
                for(int l=0;l<k;l++){
                    System.out.print(" ");
                }
            }
            else{
                for(int l=16;l>k;l--){
                    System.out.print(" ");
                }
            }
            for(int i=0;i<1;i++){
                 System.out.print("*");
            }
            for(int i=8;i>k;i--){
                System.out.print(" ");
            }
            for(int i=8;i>k;i--){
                System.out.print(" ");
            }
            for(int i=8;i<k;i++){
                 System.out.print(" ");
            }
            for(int i=8;i<k;i++){
                 System.out.print(" ");
            }
            for(int i=0;i<1;i++){
                 System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
