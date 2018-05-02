package primes.quadratic ;

import java.math.BigInteger ;

//import primes.erathostenes.Token;
public class Counter extends primes.erathostenes.Counter {
	

public Counter() {
		super(new Token());
		
		Token t = new Token();
		
		System.out.println("in new Counter : "+t.value2());
		
	}


public 	Token token() {
	return (Token) super.token();
}


public Token get() {
	return (Token) super.get();
	
}

}