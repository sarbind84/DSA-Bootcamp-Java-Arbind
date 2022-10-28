package com.example.source_dsa.Patterns.Java_8_Conceptes;

class invalidageexception extends Exception{

	public invalidageexception(String s) {
		// TODO Auto-generated constructor stub
		super(s);
	}
}




class myOwnException {
	
	public static void validate(int age) throws invalidageexception{
		
		if(age<15) {
			
			throw new invalidageexception("Age is below 18 and throw is this ");
			
		}else {
			System.out.println("age is above 18 should not print");
			
		}	
	}
	
	
	public static void main(String[] args) {
		 
		try {
			validate(13);
			
		} catch (Exception e) {
			System.out.println("\n");
			System.out.println("\ncatch is this" + e );
		}
		
	}
	
	
	
}