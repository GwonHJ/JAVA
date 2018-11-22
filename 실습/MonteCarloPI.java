import java.util.*;

public class MonteCarloPI{
public static void main(String args[]){

	double x,y,d,pi;
	int count = 0;
	Scanner sc = new Scanner(System.in);
	
	System.out.print("How many samples to generate? ");

	int n = sc.nextInt();

	for(int i=0; i<n; i++){
		x = Math.random();
		y = Math.random();
		
		d = Math.sqrt(x*x+y*y);
		
		if(d<=1){
			count++;
		}

	}
	
	pi = 4.0*count/n;
	System.out.printf("pi from %d sample =\n%f",n,pi);

}

}