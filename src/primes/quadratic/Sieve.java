package primes.quadratic ;

//import primes.erathostenes.Token;
public class Sieve extends primes.Sieve<Token> {

/**
 * In the extension of a class constructors arenot inherited
 */
public	Sieve (String[] args) {
		super(args, new Counter()) ;
				
		System.out.println("constructing quadratic Sieve");
	
		this.mainloop();
		this.print() ;
	}

public	boolean testloop(Token token) {
	System.out.println("token in testloop:\n residue :"+token.value()+" intero: "+token.value2());
	
	return ( token.value2().compareTo(this.getmax()) != 1) ;
}
	
	
/**
 * @override of the erathosenes.Sieve mainloop
 * the only difference is on the test of
 * the primality boolean in order to create a new Filter objet
 */
	public void mainloop() {
		Token token ;
		
		token = (Token) this.next().get() ;
		System.out.println("in Q:S:mailoop before while "+token.value2());
		
		
		while (testloop(token)) {
			if (token.primality()) {
				this.seteuler() ;
				this.set( new Filter(this.next() , token.value() ));
			}
			System.out.println("in Q:S:mailoop after while : ready to new S:get()");
			token = (Token)this.next().get() ;
			
			System.out.println("in Q:S:mailoop new integer : "+token.value2()+" "+token.value());
		};
		
	}
	
	public void printmatrix() {
		/* bisogna essere sicuri che si ha un Filter o un Matrix */
		((Bidimensional)this.next()).column().print() ;
		
	}
	
	public Token get() {
		return null;
	}


}
