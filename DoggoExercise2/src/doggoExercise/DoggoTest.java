package doggoExercise;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DoggoTest {

	@Test
	public void test() {

		assertEquals("10th", appender(20, 2), position(8));
	}

	@Test
	public void test() {
		
		assertEquals("64th", appender70, 2), position(8));
	}

	@Test
	public void test() {

		assertEquals("88th", appender(65, 8), position(34));
	}

	@Test
	public void test() {

		assertEquals("8th", appender(10, 3), position(7));
	}

}

}
