import java.util.Arrays;
import java.util.Scanner;

public class kthelementsum {
	public static void main(String [] arg){
		int arr[] = new int[50];
		int t;
		Scanner s = new Scanner(System.in);
		if(s.hasNext()){
			t = s.nextInt();
			while(t>0){
				int n,k1=0,k2=0;
				if(s.hasNext()){
					n = s.nextInt();
					for(int i=0;i<n;i++){
						if(s.hasNext()){
							arr[i] = s.nextInt();
						}
					}
					if(s.hasNext()){
						k1=s.nextInt();
					}
					
					if(s.hasNext()){
						k2= s.nextInt();
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
					
					int sum = 0;
					for(int j=k1;j<k2-1;j++){
						sum+= arr[j];
					}
					
					System.out.println(sum);
				}
				t--;
			}
		}
		s.close();
	}
}
