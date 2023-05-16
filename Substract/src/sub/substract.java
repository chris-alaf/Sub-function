package sub;

public class substract {
	
	public String subt (int num1, int num2) {       
        
        int result = num1 - num2;
        
        if (result > 0) {
            return("Positive");
        } 
        else if (result < 0) {
            return("Negative");
        } 
        else {
            return("Zero");
        	}
	}
}


