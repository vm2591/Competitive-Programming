//Reverse Sub Array
import java.util.*;
public class RevSubArray {
	public static void main(String [] arg){
		int T;
		Scanner s = new Scanner(System.in);
		if(s.hasNext()){
			T = s.nextInt();
			while(T>0){
				int n;
				int L=0,R=0;
				int[] arr = new int[100];
				if(s.hasNext()){
					n = s.nextInt();
					for(int i=0;i<n;i++){
						if(s.hasNext()){
							arr[i] = s.nextInt();
						}
					}
					if(s.hasNext()){
						L = s.nextInt();
					}
					if(s.hasNext()){
						R = s.nextInt();
					}
					int temp = 0;
					for(int i =L-1, j = R-1; i<L+(R-L)/2; i++ , j--){
						temp = arr[j];
						arr[j] = arr[i];
						arr[i]= temp;
					}
					
					for(int i = 0;i<n;i++){
						System.out.print(arr[i] + " ");
					}
				}
				System.out.println("");
				T--;
			}
		}
		s.close();
	}
}
