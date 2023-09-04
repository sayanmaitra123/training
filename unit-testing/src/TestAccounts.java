import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestAccounts {
	private Accounts acnt;

	@BeforeEach
	public void init() {
		// TODO Auto-generated method stub
		acnt = new Accounts(1000);
	}

	@Test
	public void testValidDeposit() {
		// TODO Auto-generated method stub
		assertEquals(2000, acnt.deposit(1000));

	}

	@Test
	public void testNegativeDeposit() {
		assertThrows(NumberFormatException.class, () -> acnt.deposit(-100));
	}

	@Test
	public void testValidWithdraw() throws BalanceException {
		// TODO Auto-generated method stub
		assertEquals(500, acnt.withdraw(500));

	}

	@Test
	public void testNegativeWithdraw() {
		// TODO Auto-generated method stub
		assertThrows(NumberFormatException.class, () -> acnt.withdraw(-100));

	}

	@Test
	public void testInvalidWithdraw() {
		// TODO Auto-generated method stub
		assertThrows(BalanceException.class, () -> acnt.withdraw(2000));

	}

}
