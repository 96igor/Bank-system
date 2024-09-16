package model;

import com.sun.security.ntlm.Client;

import java.util.List;

public class RegularCard extends Card{

    private static final Integer WITHDRAW_ANOTHER_BANK_COMMISSION = 10;
    private static final Integer TRANSFER_MONEY_ANOTHER_BANK = 5;
    private static final Integer DEPOSIT_ANOTHER_BANK_COMMISSION = 5;

    public RegularCard(String cardNumber, Client owner,
                       Boolean isValid, Double balance, List<Transaction> transactions) {
        super(cardNumber, owner, isValid, balance, transactions);
    }
}
