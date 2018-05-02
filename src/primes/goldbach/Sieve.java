package primes.goldbach ;

import java.math.BigInteger ;

public class Sieve extends primes.erathostenes.Sieve {

    // costruttori
public Sieve(String[] args) {
	super(args,null);
	this.set(new Counter(this));
	this.mainloop();
	this.print2() ;

	}
	
private boolean testloop(Token token) {
		return (( token.value().compareTo(this.getmax()) != 1) && (!token.parity())) ;
	}
	
	
private void mainloop() {
		Token token ;
			//System.out.println("in main loop - before the first get");
		token = (Token) this.next().get() ;
	
		while (testloop(token)) {
			this.seteuler()  ;
			this.set( new Filter(this.next() , token.value() ));
			token = (Token) this.next().get() ;
		};
		
	}


}
