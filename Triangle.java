package examples;

/* 

Question1

Make Triangle class that can store base and height of triangle. 
At the same time, define constructor. Make method that can change base and height of triangle
and return extent of triangle.*/


public class Triangle 
{
	int base;
	int height;
	
	public Triangle(int b, int h)
	{
		base = b;
		height = h;
	}
	
	public int CalExtentTriangle()
	{
		return base*height/2; 
	}
}
