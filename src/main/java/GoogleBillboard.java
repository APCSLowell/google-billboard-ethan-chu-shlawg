public class GoogleBillboard {
	public final static String e = "2.7182818284590452353602874713526624977572470936999595749669676277240766303535475945713821785251664274274663919320030599218174135966290435";  
	public static void main(final String[] args) {
		 for(int i = 10; i < e.length(); i++){
		   if(isPrime(Double.parseDouble(e.substring(i-10, i)))){
		     System.out.println(e.substring(i-10, i));
		     break;
		   }
		 }
	}


	//Finish this function
	public static boolean isPrime(double dNum){
	int score = 0;
	  if(dNum <= 1)
	    score++;
	  for(int i = 2; i <= Math.sqrt(dNum); i++){
	    if(dNum%i == 0)
	      score++;
	  }
	  return score == 0;
	}

}
