package primes.goldbach ;

import java.math.BigInteger ;
import primes.erathostenes.Item ;

class Filter extends primes.erathostenes.Filter {
// costruttori
	Filter(Item tail, BigInteger p ) {
		super(tail,p) ;
    }

private boolean	test(Token t) {
		if (t.parity())
			return this.testgoldbach(t) ;
		else
			return super.test(t) ;
	}
	
private boolean testgoldbach(Token t) {
		int tmp;
		//System.out.println("Goldbach test:");
		tmp = t.value().compareTo(this.value().add(t.top().value()));
		while (tmp == -1) {
			t.SetTop(t.top().next());
			tmp = t.value().compareTo(this.value().add(t.top().value())) ;
		};
		
		if (tmp == 0 ) System.out.println("Ok Goldbach: "+this.value()+"+"+t.top().value()+"="+t.value());
		
		return (tmp == 0) ;
	}
	
public Token get() {
	 	Token token;
	 	token=(Token) this.next().get() ;
	 	while (test(token)) token=(Token) this.next().get();
	 	return token;
	 
	 }
	
	

}










