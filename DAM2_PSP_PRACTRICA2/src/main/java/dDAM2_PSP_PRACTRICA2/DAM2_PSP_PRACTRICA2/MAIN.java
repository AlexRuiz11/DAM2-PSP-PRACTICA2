package dDAM2_PSP_PRACTRICA2.DAM2_PSP_PRACTRICA2;

import java.util.ArrayList;
import java.util.List;

public class MAIN {
	
	    public static void main(String[] args)  throws InterruptedException{
	

	    	int NumVueltas=2;
	    	int NumPd=101;
	    	int NumCS=100;

	    	
	    	Pila miPila = new Pila();
	  
	    	 List<Thread> Lhilos = new ArrayList<Thread>();

	         for (int i = 0; i < NumPd; ++i) {
	        	 Lhilos.add(new PRODUCTOR(NumVueltas, miPila));
	         }

	         for (int i = 0; i < NumCS; ++i) {
	        	 Lhilos.add(new CONSUMIDOR(NumVueltas, miPila));
	         }

	         for (Thread hilo : Lhilos) {
	             hilo.start();
	         }

	         for (Thread hilo : Lhilos) {
	             try {
	                 hilo.join();
	             } catch (InterruptedException e) {
	                 e.printStackTrace();
	             }
	         }

	     
			
				


	    	
	    	

	    	
	    	
	    	System.out.println(miPila.toString());
	    	

	    	
	    	
	    	
	    	
	    	

		}
	    
	    
	    	    
	    
	}

	
	
	
	
	
	
	

