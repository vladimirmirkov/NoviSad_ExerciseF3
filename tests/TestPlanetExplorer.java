import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {

	@Test
	public void test_executeCommand() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testMovingForth()
	{
		Explorer exp = new Explorer();		
		exp.moveForth();
		assertEquals(1, exp.getY());
	}
}
