package indi.wuyue.dynamicds.shardingsphere.service;

import indi.wuyue.dynamicds.shardingsphere.bean.Account;

import java.util.List;

public interface AccountService {

    List<Account> listAccounts();

    Account getAccount();

}
