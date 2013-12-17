import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class HelloTest {
	
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
		assertEquals(h.getName(),"Germi");
		assertEquals(h.getMessage(), "Hello Germi!");
		System.out.println("sukses");
		
	}
	
	
}
