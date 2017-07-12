package primeFibo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeFibo {
	int fib1=0,fib2=1,fib;
	static int num1=0;
	static int num;
	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		input:
		System.out.println("Enter number to find fibo and prime");
		num = Integer.parseInt(br.readLine());
		PrimeFibo pf = new PrimeFibo();
		if(num>1){
			if(num==2){
				int result = pf.primeF(num1);
				System.out.println(result);
			}
			else if(num%2==0){
				System.out.println("not a prime");
			}else{
				num1=num;
				int result = pf.primeF(num1);
				System.out.println(result);
			}
		}else{
			System.out.println("enter num greater than 1");
			
		}
		
	}
	
	int primeF(int num){
		for(int i=1;i<=num;i++){
			fib=fib1+fib2;
			fib1=fib2;
			fib2=fib;
			
			if(fib==num){
				return 0;
			}
		}	
		return 1;
	}

}
