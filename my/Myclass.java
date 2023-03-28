package my;

public class Myclass {

	// you can also use imports, for example:
	// import java.util.*;

	    
	    private static boolean isBadVersion(int version){
	    	boolean isBad = false;
	        return isBad;
	    }
	    public static int firstBadVersion(int n) {
	        int bad = 0;
	        boolean isBad, found;
	        int firstVersion = 0;
	    for (int i = 1; i < n; i++){
	            if( i == i+ 1)
	            found = isBadVersion(i);
	            bad = 1;
	        }
	        return bad;
	    }

	

	    public static void main(String [] args) {
	    	int n = 5;
	        firstBadVersion(n);
	    }
	}
