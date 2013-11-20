import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestHello {
	
	private Hello h;
	@Before
	public void setUp() throws Exception{
		h = new Hello();
	}
	
	@Test
	public void testHelloEmpty() {
		assertEquals(h.getName(),"");
		assertEquals(h.getMessage(),"Hello!");
	}

	@Test
	public void testHello(){
		h.setName("Germi");
		assertEquals(h.getName(), "World");
		assertEquals(h.getMessage(), "Hello World!");
		System.out.println("sukses");
		
	}
}
