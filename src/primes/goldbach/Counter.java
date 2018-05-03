package primes.goldbach ;

import java.math.BigInteger ;
import primes.Item ;

class Counter extends primes.erathostenes.Counter {
private Sieve sieve;
    // costruttori
public Counter(Sieve sieve) {
		super(new Token());
		this.sieve = sieve;
	}

public Token get() {
		this.token().Set(this.sieve,this.value());
		this.set() ;
		
		return token() ;
	}
	
public Token token() {
		return (Token) super.token();
	}

}

