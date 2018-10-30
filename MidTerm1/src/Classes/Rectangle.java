package Classes;

public class Rectangle extends Shape implements Comparable<Rectangle> {

	private int iWidth;
	private int iLenght;
	
	public Rectangle(int iWidth, int iLenght) {
		super();
		this.iWidth=iWidth;
		this.iLenght=iLenght;
		
	}

	public int getiWidth() {
		return iWidth;
	}

	public void setiWidth(int iWidth) {
		this.iWidth = iWidth;
	}

	public int getiLenght() {
		return iLenght;
	}

	public void setiLenght(int iLenght) {
		this.iLenght = iLenght;
	}


	
	@Override
	public double Area() {
		double are = (this.iWidth*this.iLenght);
		return are;
	}

	@Override
	public double Perimeter() {
		double per = (this.iWidth+this.iLenght)*2;
		return per;
	}
	 
	@Override
	public int compareTo(Rectangle o) {
		return this.Area().compareTo(o.Area());
	}
	

}
