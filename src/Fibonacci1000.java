import java.math.BigInteger;
import java.util.*;

public class Fibonacci1000 {
	
	public void calc() {
		List<BigInteger> lBigInt = new ArrayList<>();
		lBigInt.add( BigInteger.valueOf(1) );			
		lBigInt.add( BigInteger.valueOf(2) );
		lBigInt.add( BigInteger.valueOf(3) );
	  for (int i=0; i <=999; i++) { 
		  lBigInt.set( 2, lBigInt.get(0).add( (new BigInteger( lBigInt.get(1).toString() ) ) ) );
		  lBigInt.set( 0, lBigInt.get(1));
		  lBigInt.set( 1, lBigInt.get(2));
	   }
	  System.out.println( "Fibonacci n(1000) = " + lBigInt.get(2)); 
	}

}
