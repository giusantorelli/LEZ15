package primes.quadratic ;

import java.math.BigInteger ;
import primes.erathostenes.Item;

class Filter extends primes.erathostenes.Filter implements Bidimensional {
	Matrix column ;
	
	
// costruttori
Filter(Item tail, BigInteger p) {
		super(tail,p) ;
		
		Item tmp;
		System.out.println(" new quadratic Filter "+" is token value = 2 ? "+p.compareTo(new BigInteger("2")));
		
		if( p.compareTo(new BigInteger("2")) == 0 )
				{
					tmp = null ;
			
					System.out.println(" reference to next object (2): "+tmp);
					this.column = new Matrix(tmp , tmp, BigInteger.ONE);
				}
			else
				{	
					tmp = ((Filter)tail).column();
					System.out.println(" reference to next object (step): "+tmp);
					this.column = new Matrix(tmp , this.setzerocolumn(tmp), BigInteger.ONE);
				};
		
	

		//this.column = new Matrix(tmp , tmp, BigInteger.ONE);
		
		System.out.println(" fine creazione filtro ");
	}

private Item setzerocolumn(Item r) {
		if (((Matrix)r).column() != null)
			return (new Matrix(((Matrix)r).column(),this.setzerocolumn(((Matrix)r).column()),BigInteger.ZERO));
		else
			return null ;
	}

private Token factorize(Token tok) {
		Item tmp;
		
		BigInteger exp = BigInteger.ZERO ;
		
		while(test(tok)) {
			exp = exp.add(BigInteger.ONE);
			System.out.println("dividing "+tok.value2()+" by "+this.value()+"-> exponent "+exp);
			tok.Set(tok.value().divide(this.value()));
			tok.SetPrimality(false) ;
		}
				
		if( this.value().compareTo(new BigInteger("2")) == 0 )
		{
			tmp = null ;
	
			//System.out.println(" reference to next object (2): "+tmp);
			this.column = new Matrix(tmp , this.column(), exp);
		}
	else
		{	
			tmp = ((Filter)this.next()).column();
			//System.out.println(" reference to next object (step): "+tmp);
			this.column = new Matrix(tmp , this.column(), exp);
		};

		
		//this.column = new Matrix( ((Filter) this.next()).column(), this.column(), exp ) ;
	return tok;
	}
	

/**
 
 */
public Token get() {
		Token token;
		token=(Token)this.next().get() ;
		token = factorize(token);
		return token;
		
	}
	
	
public Item column () {
		
		return this.column ;
	}

}










