package indi.wuyue.dynamicds.shardingsphere.dao;

import indi.wuyue.dynamicds.shardingsphere.bean.Account;

import java.util.List;

public interface AccountMapper {

    List<Account> selectAccounts();

    Account selectOne();

}
