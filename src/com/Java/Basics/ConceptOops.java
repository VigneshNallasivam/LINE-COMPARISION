package com.Java.Basics;

public class ConceptOops 
{
	static int x1 = 10,x2 = 5;
	static int y1 = 20,y2 = 10;
	static int line1;
	static int line2;
	
	/*
	 * creating static Function for getting length of the line
	 */
	static void getLength()
	{
		line1 = x2-x1;
		line2 = y2-y1;
        double length = Math.sqrt( (line1*line1) + (line2*line2) );
	    System.out.println("Length of the Line = " +length);
	}
	
	/*
	 * Creating Non-static function for line Comparision
	 */
	  
	void getCompare()
	{
	    if(line1==line2)
	    {
	       System.out.println("Lines Are Equal");
	    }
	    
	    else if(line1>line2)
	    {
	    	System.out.println("Line1 is greater");
	    }
	    
	    else
	    {
	    	System.out.println("Line2 is greater");

	    }
	}

	public static void main(String[] args) 
	{
		/**
		 * Object 'obj' is Created to Access Non-static Function getCompare()
		 */
		ConceptOops obj = new ConceptOops();
		getLength();
		obj.getCompare();
	}

}
