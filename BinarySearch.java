import java.util.*;
public class BinarySearch{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a[]={31,36,45,50,60,75,86,90};
        int n=0;

        System.out.println("Enter the element to be searched");
        n=sc.nextInt();

        int start=0;
        int end=a.length-1;
        int pos = -1;

        int mid = (start+end)/2;

        while(start<=end){
            if(n==mid){
                pos=mid;
                break;
            }
            if(n<a[mid]){
                end=mid+1;
            }else if(n>a[mid]){
                start=mid-1;
            }
        }

        if(pos!=1){
            System.out.println("Element found!");
        }else{
            System.out.println("Element not found!");
        }
    }
}