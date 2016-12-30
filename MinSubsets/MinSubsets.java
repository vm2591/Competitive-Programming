//Program to find mininum subsets of consecutive numbers
import java.util.*;
public class MinSubsets {
	public static void main(String [] arg){
		Scanner s = new Scanner(System.in);
		int t;
		if(s.hasNext()){
			t = s.nextInt();
			while(t>0){
				int n=0;
				int[] arr = new int[50];
				if(s.hasNext()){
					n = s.nextInt();
					for(int i=0;i<n;i++){
						if(s.hasNext()){
							arr[i] = s.nextInt();
						}
					}
					
					for(int z=0;z<n;z++){
						int temp=0;
						for(int x=z+1;x<n;x++){
							if(arr[z]>arr[x]){
								temp = arr[z];
								arr[z] = arr[x];
								arr[x] = temp;
							}
						}
					}
					
					int[] subset = new int[50];
					int num_subsets = 0;
					int index =0;
					//subset[0]=arr[0];
					for(int i=0;i<n;i++){
						if(index==0)
						{
							subset[index] = arr[i];
							index++;
							num_subsets++;
						}
						else {
							if(arr[i]==subset[index-1]+1){
								subset[index] = arr[i];
								index++;
							}
							else if(arr[i]==subset[index-1]){
								
							}
							else {
								index = 0;
								subset[index] = arr[i];
								index++;
								num_subsets++;
							}
						}
						
					}
					
					
					System.out.println(num_subsets);
				}
				t--;
			}
		}
		
			
		s.close();
	}
}
