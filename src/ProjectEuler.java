public class ProjectEuler {
	public static int sumSquareDifference(){
		int tot1 = 0;
		int tot2 = 0;
		int fin = 0;
		for (int i = 0; i <= 100; i++){
			tot1 = tot1 + i*i;
			tot2 = tot2 + i;
		}
		fin = ((tot2*tot2) - tot1);
		return fin;
	}
	public static int multiples35(){
		int tot = 0;
		for (int i = 0; i <= 1000; i++){
			if (i % 3 == 0 || i % 5 == 0){
				tot = tot + i;
			}
		}
		return tot;
	}
	public static int fib(){
		int tot = 0;
		int fiber1 = 1;
		int fiber2 = 0;
		int fiber3 = 1;
		while (fiber2 <= 4000000){
			fiber2 = fiber2 + fiber1;
			if (fiber2 % 2 == 0){
				tot = tot + fiber2;
			}
			fiber1 = fiber3;
			fiber3 = fiber2;
		}
		return tot;
	}
	public static int divisible(){
		int num = 19;
		boolean done = false;
		while (done == false){
			num++;
			int tot = 0;
			for (int i = 1; i <= 20; i++){
				if (num % i == 0){
					tot++;
				}
			}
			if (tot == 20){
				done = true;
			}
		}
		return num;
	}
	
	
	public static boolean isPal(int num){
		int reversed = 0;
		int original = num;
		    
		if (num < 10) return true;
		if (num % 10 == 0) return false;
		while (num >= 1){
			reversed = (reversed * 10) + (num % 10);
			num = num/10;
		}
		if(original == reversed) return true;
		else{ return false;}
	}
	public static int largestPalindrome(){
		int max = 0;
		int a = 999;
		int b = 999;
		int prod = 0;
		while(a > 99){
			b = 999;
			while(b > a){
				prod = a*b;
				if(prod>max && isPal(prod)){
					max = prod;
				}
				b--;
			}
			a--;
		}
		return max;
	}
	
	
	public static void main(String[] args){
		System.out.println("Method 1:" + sumSquareDifference());
		System.out.println("Method 2:" + multiples35());
		System.out.println("Method 3:" + fib());
		System.out.println("Method 4:" + divisible());
		System.out.println("Method 5:" + largestPalindrome());
	}
	
}