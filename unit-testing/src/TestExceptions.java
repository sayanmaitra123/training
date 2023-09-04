import static org.junit.Assert.assertThrows;

import org.junit.jupiter.api.Test;

public class TestExceptions {

	@Test
	public void testDivision() {
		// TODO Auto-generated method stub
		assertThrows(ArithmeticException.class, () -> {
			int x = 10 / 2;
		});

	}

	@Test
	public void testParsing() {
		// TODO Auto-generated method stub
		assertThrows(NumberFormatException.class, () -> Integer.parseInt("One"));

	}

}
