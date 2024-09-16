package model;

import javax.xml.crypto.Data;

public class Transaction {

    private String id;
    private String operationType; //TODO: add enum;
    private Double amount;
    private Client clientFrom;
    private Client clientTo;
    private String cardNumberFrom;
    private String cardNumberTo;
    private Data timestamp;

    public Transaction(String id, String operationType, Double amount, Client clientFrom, Client clientTo, String cardNumberFrom, String cardNumberTo, Data timestamp) {
        this.id = id;
        this.operationType = operationType;
        this.amount = amount;
        this.clientFrom = clientFrom;
        this.clientTo = clientTo;
        this.cardNumberFrom = cardNumberFrom;
        this.cardNumberTo = cardNumberTo;
        this.timestamp = timestamp;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Client getClientFrom() {
        return clientFrom;
    }

    public void setClientFrom(Client clientFrom) {
        this.clientFrom = clientFrom;
    }

    public Client getClientTo() {
        return clientTo;
    }

    public void setClientTo(Client clientTo) {
        this.clientTo = clientTo;
    }

    public String getCardNumberFrom() {
        return cardNumberFrom;
    }

    public void setCardNumberFrom(String cardNumberFrom) {
        this.cardNumberFrom = cardNumberFrom;
    }

    public String getCardNumberTo() {
        return cardNumberTo;
    }

    public void setCardNumberTo(String cardNumberTo) {
        this.cardNumberTo = cardNumberTo;
    }

    public Data getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Data timestamp) {
        this.timestamp = timestamp;
    }
}
