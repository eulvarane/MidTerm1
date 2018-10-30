package Classes;

import static org.junit.Assert.*;

import org.junit.Test;

public class RectangleTest {

	@Test
	public void getiWidth() {
		Rectangle r = new Rectangle(5,6);  
		assertEquals(r.getiWidth(), 5);
	}
	
	@Test
	public void getiLength() {
		Rectangle r = new Rectangle(5,6); 
		assertEquals(r.getiLenght(), 6);
	}
	
	@Test 
	public void setiLength() {
		Rectangle r = new Rectangle(5,6);
		r.setiLenght(3);
		assertEquals(r.getiLenght(), 3);
	}
	
	@Test 
	public void setiWidth() {
		Rectangle r = new Rectangle(5,6);
		r.setiWidth(3);
		assertEquals(r.getiWidth(), 3);
	}
	
	@Test
	public void Area() {
		Rectangle r = new Rectangle(5,6);
		assertEquals(r.Area(), 30);
	}
	
	@Test 
	public void Perimeter() {
		Rectangle r = new Rectangle(5,6);
		assertEquals(r.Perimeter(), 22);
	}
}
