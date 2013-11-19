//SHAHRUZ GHAEMi
//HW 27
//pd 8
//2013-11-18

public class Rational {
    //instance vars
    private int _n; //numerator
    private int _d; //denominator
    /*==============
      default constructor--creates Rational with 0/1
      ==============*/
    public Rational(){
	_n = 0;
	_d = 1;
    }
    /*==============
      overloaded constructor--takes num and denom parameters
      ==============*/
    public Rational(int num, int denom){
	_n = num;
	_d = denom;
    }
    //accessors
    public int getNum() {return _n;}
    public int getDenom() {return _d;}
    /*==============
      toString--string representation of the rational number
      ==============*/
    public String toString(){
	return ""+_n+"/"+_d;
    }
    /*==============
      floatValue--floating point value of the Rational, most precise
      ==============*/
    public float floatValue(){
	return (float) (((float)_n)/((float)_d));
    }
    /*==============
      multiply--takes one Rational input and multiplies it by caller Rational
      does not return any value, it changes the calling Rational
      ==============*/
    public void multiply(Rational factor){
	_n *= factor.getNum();
	_d *= factor.getDenom();
    }
    /*==============
      divide--works same as multiply
      ==============*/
    public void divide(Rational divisor){
	_n *= divisor.getDenom();
	_d *= divisor.getNum();
    }
    /*==============
      add--takes a Rational and adds to calling Rational
      ==============*/
    public void add(Rational addend){
	_n *= addend.getDenom();
	_n += addend.getNum() * _d;
	_d *= addend.getDenom();
    }
    /*==============
      subtract--works the same as add
      ==============*/
    public void subtract(Rational addend){
        _n *= addend.getDenom();
	_n -= addend.getNum() * _d;
	_d *= addend.getDenom();
    }
    /*==============
      gcd--returns the gcd of _n and _d
      ==============*/
    public int gcd(){
	int a = _n; 
	int b = _d;	
	while (true) {
	    if (a%b == 0) {
		return b;}
	    else {
		b = a%b;}
	}
    }
    /*==============
      reduce--changes the calling Rational to a reduced form
      ==============*/
    public void reduce(){
	int gcd = this.gcd();
	_n /= gcd;
	_d /= gcd;
    }
   
/*
    public static void main(String[] args){
	Rational r = new Rational(2,3);
	Rational s = new Rational(1,2);
	System.out.println("r: "+r );
	System.out.println("s: "+s );
	System.out.print(""+r.toString()+" / "+s.toString()+" = ");
	r.divide(s);
	System.out.println(r.toString() );
	System.out.println("r: "+r);
	System.out.println("s: "+s);
	System.out.print("add r and s = " );
	r.add(s);
	System.out.println(r);
	System.out.print("subtract s from r = ");
	r.subtract(s);
	System.out.println(r);
	r.reduce();
	System.out.println("r: "+r);
	
    } */ //end main
} //end class
