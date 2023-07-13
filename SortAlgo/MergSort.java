package SortAlgo;

// merge sort works on divide and conqure technique first divide the array and then sort the array
// for dividing the complexity is O(logn)
// and for sorting the complexity O(n)  so the time complexity is O(nlogn)

public class MergSort {
    
    public static void conqure(int arr[],int si,int mid,int ei){

        int merged[] = new int[ei-si+1];
        int indx1=si;
        int indx2= mid+1;
        int x=0;
        while(indx1<=mid && indx2<=ei){
            if(arr[indx1]<=arr[indx2]){
               merged[x++] = arr[indx1++];   
            }else{
                merged[x++] = arr[indx2++];
            }
        }
        while(indx1<=mid){
             merged[x] = arr[indx1];
               x++; indx1++;  
        }
        while(indx2<=ei){
            merged[x] = arr[indx2];
            x++;indx2++;
        }
    //   now copy the sorted array to original array
     for(int i=0,j=si;i<merged.length;i++, j++){
            arr[j] = merged[i];
     }
    } 

    public static void divide(int arr[],int si,int ei){  
        if(si>=ei){
            return;
        }
        
        int mid = si + (ei-si)/2;
        divide(arr,si,mid);
        divide(arr,mid+1,ei);
        conqure(arr,si,mid,ei);
    }
    public static void main(String arg[]){
      
        int arr[] = {6,3,9,5,2,8};
        int n = arr.length;
        divide(arr,0,n-1); 
        // now print the sorted array
        // for(int i=0;i<n;i++){
        //     System.out.print(arr[i]);
        // }

    }
}
