package indi.wuyue.dynamicds.shardingsphere.service.impl;

import indi.wuyue.dynamicds.shardingsphere.bean.Account;
import indi.wuyue.dynamicds.shardingsphere.dao.AccountMapper;
import indi.wuyue.dynamicds.shardingsphere.service.AccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Resource
    private AccountMapper accountMapper;

    @Override
    public List<Account> listAccounts() {
        return accountMapper.selectAccounts();
    }

    @Override
    public Account getAccount() {
        return accountMapper.selectOne();
    }

}
