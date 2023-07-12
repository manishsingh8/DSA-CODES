package Pattern;
import java.util.*;

public class RhombusPattern {
    
    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space =0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=n;k++){
                System.out.print("*");
            } 
            System.out.println();  
        }

    }
}
