//All the building receiving sunlight

import java.util.*;
public class SunlightProblem {
	public static void main(String [] arg){
		Scanner s = new Scanner(System.in);
		int t=0;
		if(s.hasNext())
		{
			t = s.nextInt();
			while(t>0){
				int n;
				int[] arr = new int[100];
				if(s.hasNext()){
					n = s.nextInt();
					for(int i=0;i<n;i++){
						if(s.hasNext()){
							arr[i] = s.nextInt();
						}
					}
					
					int max_height = arr[0];
					int count =1;
					
					for(int i=1;i<n;i++){
						if(arr[i]>=max_height){
							max_height = arr[i];
							count++;
						}
					}
					System.out.println(count);
				}
				
				t--;
			}
		}
		s.close();
	}

}
