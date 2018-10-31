import org.junit.Test;

import com.qa.account.accountapp.Account;
import com.qa.account.accountapp.AccountService;

import junit.framework.Assert;
import junit.framework.TestCase;

public class accountTest {

	@Test
	public void accountCountTest() {
		AccountService serv = new AccountService();
		
		Account a1 = new Account("Ben", "Taylor", "234535346");
		Account a2 = new Account("Ben", "Other", "83745");
		Account a3 = new Account("Gareth", "Clifford", "4564547");
		
		serv.addAccount(a1);
		serv.addAccount(a2);
		serv.addAccount(a3);
		
		Assert.assertEquals(2, serv.countAccounts("Ben"));
		Assert.assertEquals(1, serv.countAccounts("Gareth"));
		Assert.assertEquals(0, serv.countAccounts("Tom"));
	}
}
