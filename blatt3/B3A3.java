package blatt3;

public class B3A3 {
	
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Eingabe: ");
        int n = sc.nextInt();
        
        
        if(n < 1) {
        	System.out.println("Zahl muss positiv sein");
        	return;
        }
        
        System.out.println(n + " Werte werden eingelesen:");
	    
        double[] values = new double[n];
        
        for(int i = 0; i < n; i++) {
        	System.out.println("Wert " + (i + 1) + ":");
        	values[i] = sc.nextDouble();
        }
        
       
        sc.close();
		
        double arithmMittel = arithmMittel(n, values);
        
        System.out.println("Arithm. Mittel: " + arithmMittel);
        
        System.out.println("Varianz: " + varianz(n, values, arithmMittel));
	}
	
	public static double arithmMittel(int size, double[] values) {
		double sum = 0;
		for(int i = 0; i < size; i++) {
			sum += values[i];
		}
		return sum / size;
	}

	public static double varianz(int size, double[] values, double arithmMittel) {
		double sum = 0;
		for(int i = 0; i < size; i++) {
			sum += (values[i] - arithmMittel) *  (values[i] - arithmMittel);
			
		}
		
		return sum * (1d / (size - 1d));
	}
	
}
