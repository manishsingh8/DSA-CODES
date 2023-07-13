package Arrays;
import java.util.*;

public class SortingWithoutaAlgo {
    
    public static void main(String arg[]){
       
        Scanner sc = new Scanner(System.in);
        // user input
        int n = sc.nextInt();
        // array
        int array[] = new int[n];
        // storing element in array
        for(int i=0;i<n;i++){
            array[i] = sc.nextInt();
        } 

        int countzero=0,countone=0,counttwo=0;
        // counting the number of zero one and two in given array
        for(int i=0;i<n;i++){
            if(array[i]==0){
               countzero = countzero +1;
            }else if(array[i] == 1){
                countone = countone +1;
            }else{
                counttwo = counttwo +1;
            }
        }
        
    //    update the array in sorted way
              for(int i=0;i<n;i++){
                if(i<countzero){
                    array[i] =0;
                }else if(countone>0){
                    array[i] =1;
                    countone = countone-1;
                }else{
                    array[i] = 2;
                }
              }
    // now print the sorted array
    for(int i=0;i<n;i++){
        System.out.print(array[i]);
    }

    }
}
