package model;

import com.sun.security.ntlm.Client;

public abstract class Card {

    private String cardNumber;
    private Client owner;

    //TODO: add cvr code, password;

    private Boolean isValid;
    private Double balance;


}
