/*==================================================
  class GuessNumber -- fun fun fun!

  eg, sample interaction with end user:
  Guess a # fr 1-100: 50
  Too high
  Guess a # fr 1-49: 25
  Too low
  Guess a # fr 26-49: 38
  Correct! It took 3 guesses
  ==================================================*/

/*==================================================
  the Breakdown:
  Blah blah blah, yakkity smakkity, and a nice tall glass of OJ...
  ==================================================*/


import cs1.Keyboard; /* must have cs1 dir in same dir as this file 
			for this to work */

public class GuessNumber {

    //instance vars
    private int _lo, _hi, _guessCtr, _target;



    /*==================================================
      constructor -- initializes a guess-a-number game
      pre:  
      post: _lo is lower bound, _hi is upper bound,
            _guessCtr is 1, _target is random int on range [_lo,_hi]
      ==================================================*/
    public GuessNumber( int a, int b ) {
	_lo = a;
	_hi = b;
	_guessCtr = 0;
	_target = (int)(Math.random() * (_hi - _lo) + _lo);
    }


    /*==================================================
      void playRec() -- Prompts a user to guess until guess is correct.
                        Uses recursion.
      pre:  
      post: 
      ==================================================*/
    public void playRec() {
	System.out.println("Guess a # fr "+_lo+" to "+_hi+" : ");
	int guess = Integer.parseInt( Keyboard.readString() );
	if (guess == _target){
	    System.out.println("Yay you finally achieved something. It only took "+_guessCtr+" times.");
	   
	}
	else{
	    if (guess > _target){
		System.out.println("Too high. Guess again");
		_hi = guess;
	    }
	    else {
		System.out.println("Too low. Guess again");
		_lo = guess;
	    }
	    _guessCtr++;
	    playRec();}
    }


    /*==================================================
      void playIter() -- Prompts a user to guess until guess is correct.
                         Uses iteration.
      pre:  
      post: 
      ==================================================*/
    public void playIter() {
	//*** YOUR IMPLEMENTATION HERE ***
    }


    //wrapper for playRec/playIter to simplify calling
    public void play() { 
	//use one or the other below:
	playRec();
	//playIter();
    }


    //main method to run it all
    public static void main( String[] args ) {

	//instantiate a new game
	GuessNumber g = new GuessNumber(1,100);

	//start the game
	g.play();
    }


    /*==================================================
      _ _(_) -- 
      pre:  
      post: 
      ==================================================*/
}//end class
