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
								int res =0;
								for(int i=0;i<n;i++){
									res = 0;
									//System.out.println(sum);
									res = res+arr[i];
									for(int j=i+1;j<n;j++){
										res = res+arr[j];
										//System.out.println(res);
										if(res == sum){
											//System.out.println("Here");
											System.out.println((i+1) + " " + (j+1));
											break;
										}
										
										else if(res>sum){
											break;
										}
									}
									if(res == sum){
										break;
									}
								}
								if(res!=sum){
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
