package dDAM2_PSP_PRACTRICA2.DAM2_PSP_PRACTRICA2;

public class CONSUMIDOR extends Thread{
	
	private Pila pila;
	   private int id;
	
	int numVueltas;

	private static int count = 0; 


	public CONSUMIDOR(int numVueltas, Pila pila) {
		
		
		this.numVueltas = numVueltas;
		this.pila = pila;
		id= count++;

	}


	@Override
	public void run ()
	{
	   
		for (int i = 0; i < numVueltas; ++i) {
            int c =  pila.sacar();
            System.out.println("Consumidor "+ id++ +": "+c);
        }
	}
	
	

	
	

}
