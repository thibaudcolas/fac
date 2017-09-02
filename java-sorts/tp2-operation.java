package pack;

import java.util.Stack;

public class Operation {


		public static int factRecursive(int n) 
		{
			  return n <= 1
			       ? 1
			       : n * factRecursive(n - 1);
		}
		
		public static long benchFactRec(int n)
		{
			long top = System.nanoTime(); 
			
			factRecursive(n);
			
			return System.nanoTime() - top; 
		}
		
		public static int factRecursive2(int n) 
		{
			int res;
			if (n <= 1) 
				res=1;
			else 
				res = n * factRecursive2(n-1);
			
			
			return res;

		}
		
		public static long benchFactRec2(int n)
		{
			long top = System.nanoTime(); 
			
			factRecursive2(n);
			
			return System.nanoTime() - top; 
		}
		
		public static int factIterative(int n)
		{
			int res =1;
			if (n > 1) for (int i=1; i<=n; i++){ res *= i; }
			
			return res;
		}
		
		public static long benchFactIter(int n)
		{
			long top = System.nanoTime(); 
			
			factIterative(n);
			
			return System.nanoTime() - top; 
		}
		
		public static int somChRecursive(int n)
		{
			if(n == 0) return 0;
			
			int total = 0;
		    do 
		    {
		    	total += n%10;
		    	n /= 10;
		    } 
		    while(n != 0);
		    
		    if(total <= 9)
		    	return total;
		    else
		    	return somChRecursive(total);
		}
		
		public static long benchSomChRec(int n)
		{
			long top = System.nanoTime(); 
			
			somChRecursive(n);
			
			return System.nanoTime() - top; 
		}
		
		public static int somChIterative(int n)
		{
			if(n == 0) return 0;
			int total = 0;

			do 
			{
				total += n%10;
				n /= 10;
				
				if (total >9 && n==0) 
				{
					n = total;
					total = 0;
				}
			} 
			while(n != 0);
				
			
		    return total;
		}
		
		public static long benchSomChIter(int n)
		{
			long top = System.nanoTime(); 
			
			somChIterative(n);
			
			return System.nanoTime() - top; 
		}
		
		public static int fiboRecursive(int n)
		{
			return n==0 || n==1
					? n
					: fiboRecursive(n-1) + fiboRecursive(n-2);
		}
		
		public static long benchFiboRec(int n)
		{
			long top = System.nanoTime(); 
			
			fiboRecursive(n);
			
			return System.nanoTime() - top; 
		}
		
		public static int fiboRecursive2(int n)
		{
			int terme;
			
			if (n==0 || n==1) 
				terme=n;
			else 
				terme=fiboRecursive(n-1) + fiboRecursive(n-2);
			return terme;
		}
		
		public static long benchFiboRec2(int n)
		{
			long top = System.nanoTime(); 
			
			fiboRecursive2(n);
			
			return System.nanoTime() - top; 
		}
		
		public static int fiboIterative(int n)
		{
			int fi = 0, fj = 1, fs = fi + fj;
			
			if (n==0 || n==1) 
				return n;
			else
			{
				for (int i=1;i<n;i++)
				{
					fs = fi + fj; 
					fi = fj; 
					fj = fs; 
				}
				
				return fs; 
			}
		}
		
		public static long benchFiboIter(int n)
		{
			long top = System.nanoTime(); 
			
			fiboIterative(n);
			
			return System.nanoTime() - top; 
		}
			
		public static int ackerRecursive(int m, int n)
		{
			if (m == 0) 
				return n + 1;
			else if (n == 0) 
				return ackerRecursive(m - 1, 1);
			else
				return ackerRecursive(m - 1, ackerRecursive(m, n - 1));
		}
		
		public static long benchAckerRec(int m, int n)
		{
			long top = System.nanoTime(); 
			
			ackerRecursive(m, n);
			
			return System.nanoTime() - top; 
		}
		
		public static int ackerIterative(int n, int m) 
		{

			 return 0;
		}

		
		
		public static long benchAckerIter(int m, int n)
		{
			long top = System.nanoTime(); 
			
			ackerIterative(m, n);
			
			return System.nanoTime() - top; 
		}

	public static void main(String[] args) 
	{
		int n=0;
		
		n=3;
		System.out.println("Factorielle récursive de " + n + " : " + factRecursive(n) + ", exécutée en " + benchFactRec(n) + "ns.");
		
		n=4;
		System.out.println("Factorielle récursive2 de "  + n + " : "+ factRecursive2(n) + ", exécutée en " + benchFactRec2(n) + "ns.");
		
		n=5;
		System.out.println("Factorielle itérative de "  + n + " : "+ factIterative(n) + ", exécutée en " + benchFactIter(n) + "ns.");
		
		n=124;
		System.out.println("Somme récursive des chiffres de " + n + " : " + somChRecursive(n) + ", exécutée en " + benchSomChRec(n) + "ns.");
		
		n=589;
		System.out.println("Somme itérative des chiffres de " + n + " : " + somChIterative(n) + ", exécutée en " + benchSomChIter(n) + "ns.");
		
		n=10;
		System.out.println("Fibonacci récursive : terme n° " + n + " : " + fiboRecursive(n) + ", exécutée en " + benchFiboRec(n) + "ns.");
		
		n=7;
		System.out.println("Fibonacci récursive 2 : terme n° " + n + " : " + fiboRecursive2(n)+ ", exécutée en " + benchFiboRec2(n) + "ns.");
		
		n=10;
		System.out.println("Fibonacci itérative : terme n° " + n + " : " + fiboIterative(n) + ", exécutée en " + benchFiboIter(n) + "ns.");
		
		n=5;
		System.out.println("Ackermann récursive : " + n + " : " + ackerRecursive(3, n)+ ", exécutée en " + benchAckerRec(3, n) + "ns.");
		
		n=2;
		System.out.println("Ackermann itérative : " + n + " : " + ackerIterative(2, n) + ", exécutée en " + benchAckerIter(2, n) + "ns.");
		
	}

}
