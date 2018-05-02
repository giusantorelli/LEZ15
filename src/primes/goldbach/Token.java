package primes.goldbach ;

import java.math.BigInteger ;
import primes.erathostenes.Sieve ;
import primes.erathostenes.Item ;

class Token extends primes.erathostenes.Token {
//private BigInteger num ;
private Item top ;
private boolean parity ;

	static final BigInteger TWO = new BigInteger("2");
	
	//costruttori
	 Token() {
		this.Set(BigInteger.ZERO) ;
		
	}

	// setters
/*	void Set(BigInteger n) {
		
		this.num = n ;
		
		
	}
*/
	
	public void Set(Sieve sieve,BigInteger n) {
		this.Set(n) ;
		this.top = sieve.next() ;
		this.parity = ((!(n.compareTo(Token.TWO)==0))&& (n.mod(Token.TWO).compareTo(BigInteger.ZERO) == 0))  ;
	}
	
	void SetTop(Item link) {
		this.top = link ;
		
	}
	
	
	// getters
/*	BigInteger value() {
		
		return this.num;
	}
*/
	
	Item top() {
		
		return this.top;
	}
	
	boolean parity() {
		
		return this.parity;
	}



}
