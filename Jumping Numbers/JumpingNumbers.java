//Find jumping numbers below a certain input
import java.util.*;
public class JumpingNumbers {
	public static void Jump(int x){
		System.out.print("0 ");
		for(int i =1;i<=9&& i<x;i++){
			queue_action(x,i);
			
		}
	}
	
	public static void queue_action(int a, int b){
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(b);
		while(!queue.isEmpty()){
			b=queue.peek();
			queue.remove();
			if(b<=a){
				System.out.print(b + " ");
				int last_dig = b%10;
				
				if(last_dig ==0){
					queue.add((b*10) + last_dig+1);
				}
				
				else if (last_dig == 9){
					queue.add((b*10) + last_dig -1);
				}
				
				else{
					queue.add((b*10) + last_dig -1);
					queue.add((b*10) + last_dig +1);
				}
			}
		}
	}
	public static void main(String [] arg){
		Scanner s = new Scanner(System.in);
		int t;
		if(s.hasNext()){
			t= s.nextInt();
			while(t>0){
				int n;
				//int[] arr = new int[500];
				if(s.hasNext()){
					n = s.nextInt();
					Jump(n);
				}
				System.out.println("");
				t--;
			}
		}
		s.close();
	}
}
