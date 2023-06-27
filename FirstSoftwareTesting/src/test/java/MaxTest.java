import static org.junit.Assert.*;

import com.demo.MaxNumberUsingArray;

import org.junit.Test;

public class MaxTest {

	@Test
	public void test() {
		assertEquals(2, MaxNumberUsingArray.maxArray(new int []{1,2,3,4}));
	}

}
