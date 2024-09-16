package model;

import com.sun.security.ntlm.Client;

public class PremiumCard extends Card{

    private static final Integer WITHDRAW_ANOTHER_BANK_COMMISSION = 0;
    private static final Integer TRANSFER_MONEY_ANOTHER_BANK = 0;
    private static final Integer DEPOSIT_ANOTHER_BANK_COMMISSION = 0;

    private static final Integer DEPOSIT_CASHBACK = 5;
    private static final Integer WITHDRAW_CASHBACK = 3;

    private Double cashback;

    public PremiumCard(String cardNumber, Client owner,
                       Boolean isValid, Double balance, Double cashback) {
        super(cardNumber, owner, isValid, balance);
        this.cashback = cashback;
    }

    public Double getCashback() {
        return cashback;
    }

    public void setCashback(Double cashback) {
        this.cashback = cashback;
    }
}
