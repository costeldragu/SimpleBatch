package com.mdc.simplebatch.batch.procesor;

import com.mdc.simplebatch.dao.Account;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.batch.item.ItemProcessor;

public class UserItemProcessor implements ItemProcessor<Account, Account> {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserItemProcessor.class);


    @Override
    public Account process(Account account) throws Exception {
        LOGGER.info("Account processed");
        return account;
    }
}
