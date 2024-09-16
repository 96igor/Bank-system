package model;

import com.sun.security.ntlm.Client;

public abstract class Card {

    private String cardNumber;
    private Client owner;

    //TODO: add cvr code, password;

    private Boolean isValid;
    private Double balance;

    public Card(String cardNumber, Client owner, Boolean isValid, Double balance) {
        this.cardNumber = cardNumber;
        this.owner = owner;
        this.isValid = isValid;
        this.balance = balance;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Client getOwner() {
        return owner;
    }

    public void setOwner(Client owner) {
        this.owner = owner;
    }

    public Boolean getValid() {
        return isValid;
    }

    public void setValid(Boolean valid) {
        isValid = valid;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
