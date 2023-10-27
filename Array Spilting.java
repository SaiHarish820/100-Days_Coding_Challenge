// TC : O(n) & SC : O(1)
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		    int n = sc.nextInt(), k = sc.nextInt();
		    int arr[] = new int[n];
		    for(int i = 0 ; i< n ; i++){
		        arr[i] = sc.nextInt();
		    }
		    
		    for(int i = n-1 ; i >=0 ; i--){
		        if(i == 0){
		            arr[i] = 0;
		        }
		        else{
		       arr[i] = arr[i] - arr[i-1];
		        }
		    }
		    Arrays.sort(arr);
		    int sum=0;
		     for(int i = 0 ; i < n-k+1 ; i++){
		        // System.out.print(arr[i] + " ");
		       sum+= arr[i];
		    }
		    //System.out.println();
		    System.out.println(sum);
	}
}