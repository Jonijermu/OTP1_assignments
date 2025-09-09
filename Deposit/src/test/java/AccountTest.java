import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    private Account account;

    @BeforeEach
    public void setUp() {
        account = new Account();
    }

    @Test
    public void addMoneyTest() {
        account.deposit(100);
        assertEquals(100, account.getBalance(), 0.0001);

        account.deposit(50);
        assertEquals(150, account.getBalance(), 0.0001);
    }

    @Test
    public void withdrawMoneyTest() {
        account.deposit(200);

        double withdrawn = account.withdraw(50);
        assertEquals(50, withdrawn, 0.0001);
        assertEquals(150, account.getBalance(), 0.0001);

        // Withdraw more than balance
        withdrawn = account.withdraw(300);
        assertEquals(0, withdrawn, 0.0001);
        assertEquals(150, account.getBalance(), 0.0001);

        // Withdraw exact balance
        withdrawn = account.withdraw(150);
        assertEquals(150, withdrawn, 0.0001);
        assertEquals(0, account.getBalance(), 0.0001);
    }

    @Test
    public void checkBalanceTest() {
        assertEquals(0, account.getBalance(), 0.0001);

        account.deposit(75.5);
        assertEquals(75.5, account.getBalance(), 0.0001);

        account.withdraw(25.5);
        assertEquals(50, account.getBalance(), 0.0001);
    }
}


