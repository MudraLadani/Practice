package bitManipulation;

public class problem1 {
	
	public static void main(String args[]){
		
		int N = 2048;
		int M = 19;
		int i = 2 ;
		int j = 6 ;
		
		
		System.out.println("final value : " + changeBits( N, M , i , j));
		
		
	}
	
	public static int changeBits(int N, int M, int i , int j)
	{
		int diffIndex;
		
		if(j > i){
			diffIndex = j - i + 1;
		}
		else
			diffIndex = i - j + 1;
		
		int mask = (int) Math.pow(10, diffIndex);
		
		mask = ~ (mask);
		
		if(j > i)
			mask = mask << i;
		else
			mask = mask << j;
		
		mask = ~ (mask);
		
		N = N & mask;
		
		if(j > i) 
			M = M << i;
		else
			M = M << j;
		
		N = N | M;
		
		return N;
	}
}
