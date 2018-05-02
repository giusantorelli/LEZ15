package primes.erathostenes ;

import java.math.BigInteger ;

public class Counter extends primes.Item<Token> {
private    BigInteger count ;
private    Token tok;
    // costruttori
public Counter() {
		super();
		this.tok=new Token();
		this.count = new BigInteger("2") ;
	}
	
public Counter(Token token) {
		super();
		this.tok = token ;
		this.count = new BigInteger("2") ;
	}
	
public Counter(Sieve sieve) {
		this();
	}
	
    // setters
public	void set() {
		this.count = this.count.add(BigInteger.ONE) ;
	}

    // getters
	
public void print() {
		System.out.println("C:"+this.count);
	}
	
public	Token get() {
		
		this.tok.Set(this.count);
		this.set() ;
		
		return tok ;
	}
	
public	BigInteger value() {
		return this.count ;
	}
	
public 	Token token() {
		return this.tok;
	}

}
