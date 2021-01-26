package dDAM2_PSP_PRACTRICA2.DAM2_PSP_PRACTRICA2;

import java.util.Random;

public class PRODUCTOR extends Thread {

	
	
		private Pila pila;
		private Random random = new Random();
		static int id;
		int numVueltas;
		
		
		public PRODUCTOR (int numVueltas, Pila pila){
			this.pila = pila;
			this.numVueltas=numVueltas;
		
		}
		
		
	@Override
		public void run ()
		{
			
			
			for (int i = 0; i < numVueltas; ++i) {
				
			
	            int c =  random.nextInt(100)+1;
	            pila.poner(c);
	            System.out.println("Productor  "+id++ +": "+c);
	            
	            
	            
	        }
		    	
		}
			
		

		
}
