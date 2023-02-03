package com.pluralcamp.aspects.xml;


public class ItemsValidator {

	//Before 
	public void checkAmount() {
		System.out.println("Comprobando la cantidad de " 
				+ "producto sea correcta");
	}
	
	//After
	public void pack() {
			System.out.println("Se empaquetan los productos");
			
	}
		
	//When Exception is thrown (Cuando una excepcion es lanzada)
	public void fileComplain() {
		System.out.println("Queja presentada por productos "
				+ " defectuosos");
	}
	
	
}

