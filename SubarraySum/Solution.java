//Subarray positions for a given sum in an array
import java.util.*;
public class SubarraySum {
	public static void main(String [] arg){
		Scanner s = new Scanner(System.in);
		int t;
		if(s.hasNext()){
			t = s.nextInt();
			{
				while(t>0){
					int sum=0;
					int n=0;
					if(s.hasNext()){
						n = s.nextInt();
						{
							if(s.hasNext()){
								sum = s.nextInt();

								int[] arr = new int[200];
								for(int i = 0;i<n;i++){
									if(s.hasNext()){
										arr[i] = s.nextInt();
									}
								}
								
								int res = arr[0];
								int beginning =0;
								int i=0;
								while(res !=sum && i<n){
									
									if(res<sum){
										i++;
										res = res + arr[i];
										
									}
									
									else if(res > sum){
										res = res - arr[beginning];
										beginning++;
									}
									
									
								}
								if(res == sum){
									System.out.println((beginning+1) + " " + (i+1));
								}
								
								else{
									System.out.println(-1);
								}
							}
						}
					}
					
					t--;
				}
			}
		}
		
		s.close();
	}
}
