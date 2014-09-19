package bitManipulation;

public class problem2 {
	
	public static void main(String args[]){
		
	
		double doubleVal = 0.72;
		
		long val = doubleToLong(doubleVal);
		
		System.out.println(convertToBin(val));
	}
	
	public static char[] convertToBin(long value){
		
		char c[] = new char[32];
		
		int i;
		
		for(i=0; i<32 ; i++){
			c[i] = '0';
			System.out.print(c[i]);
		}
		
		for(i=0; i < 64; i++){
			
		if( i < 32 ){
			System.out.println(value & (1 << i));
			c[i] =  (char) (value & (1 << i)) ;
		}	
		else if((value & (1 << i)) == 1){
			System.out.println("ERROR");
			break;
		}
			
		}
		
		for(i=0; i<32 ; i++){
			System.out.print(c[i]);
		}
		
		
		return c;
		
	}
	
	public static long doubleToLong(double value){
		long newValue = 0;
		
		for( int i = 0 ; i < 64 ; i++ ){
			value = 10 * value;
			newValue = (long) value;
			
			System.out.println(value);
			System.out.println(newValue);
			
			if( (value - newValue) == 0){
				break;
			}
		}
		
		return  newValue;
	}
}
