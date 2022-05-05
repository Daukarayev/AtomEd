package kz.jusan.solid.bank.app;

import java.util.List;

public interface AccountDAO {
    public List<Account> getClientAccounts(String clientID);
    public void createNewAccount(Account account);
    public void updateAccount(Account account);
    public List<Account> getClientAccountsByType(String clientID, AccountType accountType);
    public AccountWithdraw getClientWithDrawAccount(String clientID, String accountID);
    public Account getClientAccount(String clientID, String accountID);

}
