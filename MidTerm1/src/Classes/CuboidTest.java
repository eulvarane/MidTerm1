package Classes;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuboidTest {

	@Test
	public void getiWidth() {
		Cuboid r = new Cuboid(5,6,7);  
		assertEquals(r.getiWidth(), 5);
	}
	
	@Test
	public void getiLength() {
		Cuboid r = new Cuboid(5,6,7); 
		assertEquals(r.getiLenght(), 6);
	}
	
	@Test
	public void getiDepht() {
		Cuboid r = new Cuboid(5,6,7); 
		assertEquals(r.getiDepht(), 7);
	}
	
	@Test 
	public void setiLength() {
		Cuboid r = new Cuboid(5,6,7);
		r.setiLenght(3);
		assertEquals(r.getiLenght(), 3);
	}
	
	@Test 
	public void setiWidth() {
		Cuboid r = new Cuboid(5,6,7);
		r.setiWidth(3);
		assertEquals(r.getiWidth(), 3);
	}
	
	@Test 
	public void setiDepht() {
		Cuboid r = new Cuboid(5,6,7);
		r.setiDepht(3);
		assertEquals(r.getiWidth(), 3);
	}
	
	@Test
	public void Area() {
		Cuboid r = new Cuboid(5,6,7);
		assertEquals(r.Area(), 200);
	}
	
	@Test 
	public void Perimeter() {
		Cuboid r = new Cuboid (5,6,7);
		asserEquals(r.Perimeter(), Exception c);
	}
	
	@Test 
	public void compare(Cuboid a,  Cuboid b){
		Cuboid r = new Cuboid (5,6,7);
		Cuboid s = new Cuboid (6,7,8);
		asserEquals(a.Area().compareTo(b.Area()), -1);
	}
	
	@Test 
	public void compare(Cuboid a,  Cuboid b){
		Cuboid r = new Cuboid (5,6,7);
		Cuboid s = new Cuboid (6,7,8);
		asserEquals(a.volume().compareTo(b.volume()), -1);
	}
}

	

