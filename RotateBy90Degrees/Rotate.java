//Rotate the matrix anti-clockwise by 90 degress
import java.util.Scanner;
public class Rotate {
	public static void main(String [] arg){
		int T=0;
		Scanner s = new Scanner(System.in);
		if(s.hasNext()){
			T = s.nextInt();
			while(T>0){
				int n;
				int[][] arr = new int[50][50];
				if(s.hasNext()){
					n = s.nextInt();
					for(int i = 0; i<n;i++){
						for(int j = 0; j<n;j++){
							if(s.hasNext()){
								arr[i][j] = s.nextInt();
							}
						}
					}
					
					for(int i =n-1;i>=0;i--){
						for(int j=0;j<n;j++){
							System.out.print(arr[j][i] + " ");
						}
					}
					System.out.println("");
				}
				T--;
			}
		}
		s.close();
	}
}
