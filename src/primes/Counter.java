package primes ;

import java.math.BigInteger ;

public abstract class Counter<T> extends Item<T> {
private    BigInteger count ;
private    T tok;
    // costruttori

 public Counter() {
		super();
//		this.tok=new T();
		this.count = new BigInteger("2") ;
	}


 public Counter(T token) {
		super();
		this.settoken(token) ;
		this.count = new BigInteger("2") ;
	}

/*public Counter(Sieve<T> sieve) {
		this();
	}
*/
public	void set() {
		this.count = this.count.add(BigInteger.ONE) ;
	}

public void settoken(T token) {
	this.tok = token;
}

    // getters
	
public void print() {
		System.out.println("C:"+this.count);
	}
	
	public abstract	T get() ;
	


public	BigInteger value() {
		return this.count ;
	}
	
public 	T token() {
		return this.tok;
	}

public Item<T> column(){
	 return null;
}

}
