package indi.wuyue.dynamicds.shardingsphere.controller;

import indi.wuyue.dynamicds.shardingsphere.bean.Account;
import indi.wuyue.dynamicds.shardingsphere.service.AccountService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TestController {

    @Resource
    private AccountService accountService;

    @GetMapping(value = "/test")
    public Account test() {
        Account account = accountService.getAccount();
        return account;
    }

    @GetMapping(value = "/test2")
    public List<Account> test2() {
        List<Account> accounts = accountService.listAccounts();
        return accounts;
    }

}
