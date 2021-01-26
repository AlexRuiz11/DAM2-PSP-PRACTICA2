package dDAM2_PSP_PRACTRICA2.DAM2_PSP_PRACTRICA2;

public class CONSUMIDOR extends Thread{
	
	private Pila pila;
	static int id;
	
	int numVueltas;

 

	public CONSUMIDOR(int numVueltas, Pila pila) {
		
		
		this.numVueltas = numVueltas;
		this.pila = pila;
	
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
