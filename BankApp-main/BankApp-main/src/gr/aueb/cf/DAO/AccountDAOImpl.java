package gr.aueb.cf.DAO;

import gr.aueb.cf.model.Account;



public class AccountDAOImpl extends AbstractDAO<Account> implements IAccountDAO {

    public AccountDAOImpl() {
        this.setPersistentClass(Account.class);
    }
}