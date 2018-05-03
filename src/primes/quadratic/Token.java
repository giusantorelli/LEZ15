/**
 * This new variant of the Token class has to manage
 * residuals of the factoring integer
 * @author MP
 */

package primes.quadratic ;

import java.math.BigInteger ;


class Token extends primes.erathostenes.Token {
//private BigInteger num ;
private BigInteger safenum ;
//private Item row ;
private boolean primality ;

	static final BigInteger TWO = new BigInteger("2");
	
	//costruttori
	 Token() {
		 System.out.println("new quadratic Token");
		 
		 
		this.Set(BigInteger.ZERO) ;
		
	}

	// setters
/*	void Set(BigInteger n) {
		
		this.num = n ;
		
		
	}
*/
	
	public void Set(BigInteger n) {
		super.Set(n) ;
		this.safenum = n;

		//this.row = null ;
		this.primality = true ;
	}
	
	
	// getters
/*	BigInteger value() {
		
		return this.num;
	}
*/
	public void SetPrimality(boolean b) {
		
		this.primality = b;
	}
	
	public BigInteger value2() {
		System.out.println("in quadratic Token "+this.safenum);
		
		return this.safenum ;
		
	}
	
	boolean primality() {
		
		return this.primality;
	}


}
