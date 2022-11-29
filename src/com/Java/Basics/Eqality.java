package com.Java.Basics;

public class Eqality 
{

	public static void main(String[] args) 
	{
		/*
		 * Giving inputs to the plot points x and y & declaring two lines line1 and line2
		 */
		int x1 = 10,x2 = 5;
		int y1 = 20,y2 = 10;
		int line1;
		int line2;
		
		/*
		 *Finding the Values of line1 & line2 using formula 
		 */
		line1 = x2-x1;
		line2 = y2-y1;
		
		/*
		 *Finding the Length of lines using formula along with Math.sqrt function
		 */
	    double length = Math.sqrt( (line1*line1) + (line2*line2) );
	    System.out.println("Length of the Line = " +length);
	    
	    
	    /*
	     * Comparing line1 & line2 using If-Else
	     */
		 if(line1==line2)
		    	System.out.println("Lines Are Equal");
		 else
		    	System.out.println("Lines Are Not Equal");
	}

}
