package model;

import com.sun.security.ntlm.Client;

public class GoldCard extends Card{

    private static final Integer WITHDRAW_ANOTHER_BANK_COMMISSION = 5;
    private static final Integer TRANSFER_MONEY_ANOTHER_BANK = 0;
    private static final Integer DEPOSIT_ANOTHER_BANK_COMMISSION = 0;

    public GoldCard(String cardNumber, Client owner,
                    Boolean isValid, Double balance) {
        super(cardNumber, owner, isValid, balance);
    }
}
