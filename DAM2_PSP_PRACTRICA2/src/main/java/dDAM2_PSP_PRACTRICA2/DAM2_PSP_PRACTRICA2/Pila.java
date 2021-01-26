package dDAM2_PSP_PRACTRICA2.DAM2_PSP_PRACTRICA2;

import java.util.ArrayList;

public class Pila {


			
	
	ArrayList<Integer> pila  = new ArrayList<Integer>(20); // Create an ArrayList object
	private int c;

	
	public synchronized  int sacar(){
		
		if(pila.isEmpty()){
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	
		c = pila.remove(0);
		notify();

		return c;
	}	
	
	public synchronized int poner(int c){	
		
		
		if (pila.size()==20){
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	
		pila.add(c);
	    notify();
		
		return c;

	}
	

	

	@Override
	public String toString() {
		return "Pila=" + pila;
	}
	
	

}
