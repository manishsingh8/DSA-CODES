package Pattern;
import java.util.*;

public class HollowSquare {
    
    public static void main(String arg[]){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int r=1;r<=n;r++){
            for(int c=1;c<=n;c++){
                if(r==1 || r==n){
                    System.out.print("*");
                }
                else if(c==1 || c==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
