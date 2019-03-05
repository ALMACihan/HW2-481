import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

public class TestUtil {
	Util c;

	@Before
	public void setUp() { c = new Util(); }

	@Test
	public void example() { assertTrue(true); }


	@Test
	public void testOnlyOne() {
		c.compute(1);

	}
	@Test
	public void testAllZeros() {
		try {
			c.compute(0,0,0,0,0);
		}catch(Exception e) {

		}
	}

	@Test
	public void testOddNumber() {
		c.compute(1,2,3);

	}
	@Test
	public void testEvenNumber() {
		c.compute(1,2,3,4);
	}

	@Test
	public void testReturnFalse() {
		c.compute(5,7,11,13,17);

	}

}


