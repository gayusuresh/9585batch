import static org.junit.Assert.*;

import com.demo.CubeExample;

import org.junit.Test;

public class CubeTest {

	@Test
	public void test() {
		assertEquals(27,CubeExample.cube(3));
	}

}
