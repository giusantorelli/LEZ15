package primes;

import java.math.BigInteger;


public abstract class Filter<T> extends Item<T> {

	 private BigInteger prime ;

	 // costruttori
	 public Filter(Item<T> tail, BigInteger p ) {
	 	//System.out.println("new erathostenes Filter");
	 	this.Set(tail,p) ;
	 }
	 
	 public Filter() {
		 this.Set(null,BigInteger.ZERO);
	 }
	 
	    // setters
	 private void Set(Item<T> tail, BigInteger p) {
	 	this.prime = p ;
	 	super.set(tail) ;
	 }
	 
	 public	BigInteger value() {
			return this.prime ;		
	}

	 
	 public void print() {
			
			System.out.print("F:"+this.prime+"->");
			//if (!(this.next==null))
			this.next.print() ;
			
	}
	 
	 public Item<T> column(){
		 return null;
	 }
	 
	 public abstract boolean test(T token);
	 public abstract T get();
}
