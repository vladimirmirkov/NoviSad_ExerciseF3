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
	
	@Test
	public void testMovingBack()
	{
		Explorer exp = new Explorer();
		exp.moveBack();
		assertEquals(4, exp.getY());
	}
	
	@Test
	public void testTurnRight()
	{
		Explorer exp = new Explorer();
		exp.turnRight();
		assertEquals("E", exp.getDirection());
	}
}
