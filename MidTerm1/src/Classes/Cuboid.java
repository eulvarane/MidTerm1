package Classes;


import java.util.*; 
import java.io.*;


public class Cuboid extends Rectangle{

	private int iDepht;
	
	
	public Cuboid(int iWidth, int iLenght, int iDepht) {
		super(iWidth, iLenght);
		this.iDepht = iDepht;
	}

	
	
	public int getiDepht() {
		return iDepht;
	}

	public void setiDepht(int iDepht) {
		this.iDepht = iDepht;
	}

	
	
	public double volume(int iDepht, int iWidth, int iLength ) {
		double volume = iDepht*iWidth*iLength;
		return volume;
	}

	
	
	@Override
	public double Area() {
		return (super.Area()*2+((iDepht*super.getiWidth())*4));
	}

	
	
	@Override
	public double Perimeter() {
		throws Exception;
		return 0;
	}

	
	public int compareTo(Cuboid o) {
		return this.Area().compareTo(o.Area());
	}
	
	
	
	class SortByArea implements Comparator<Cuboid> {
		
		public int compare(Cuboid a,  Cuboid b) {
	        return a.Area().compareTo(b.Area()); 
	    } 
		
	}
	
	
	class SortByVolume implements Comparator<Cuboid> {
		
		public int compare(Cuboid a,  Cuboid b) {
			return a.volume().compareTo(b.volume());
		}
		
	}
	
	
}
