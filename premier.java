import java.util.*;
class premier {
    
	public static Boolean check(Integer n) {
	    
	    boolean nbrPremier = true;
	    int i=2;
	    while( nbrPremier == true && i<=10){
	        if (n % i ==0 && n !=i)
	        nbrPremier= false; 
			i=i+1;
        }
		return nbrPremier;
	}	
	public static void main(String[] args) {
		int nbr = 2;
		System.out.print(check(nbr));
	}
}