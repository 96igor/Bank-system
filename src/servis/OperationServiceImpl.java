package servis;

import bank.Storage;
import model.Card;
import model.Transaction;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public class OperationServiceImpl implements OperationService {


    @Override
    public void deposit(String cardNumber, Double amount) {
        Optional<Card> clientCardOptional = getCardByNumber(cardNumber);
        Card clientCard;
        if (clientCardOptional.isPresent()){
            clientCard = clientCardOptional.get();
            clientCard.increaseAmount(amount);
            Transaction transaction = new Transaction("001", "deposit", amount, null, clientCard.getOwner(),null, cardNumber,LocalDateTime.now());
            clientCard.addTransaction(transaction);
        }
    }

    @Override
    public void withdraw(String cardNumber, Double amount) {
        Optional<Card> clientCardOptional = getCardByNumber(cardNumber);
        Card clientCard;
        if (clientCardOptional.isPresent()){
            clientCard = clientCardOptional.get();
            clientCard.decreaseAmount(amount);
            Transaction transaction = new Transaction("001", "deposit", amount, null, clientCard.getOwner(),null, cardNumber,LocalDateTime.now());
            clientCard.addTransaction(transaction);
        }
    }

    @Override
    public void transfer(String cardNumberFrome, String cardNumberTo, Double amount) {

    }

    private Optional<Card> getCardByNumber(String number){
        List<Card> cards = Storage.getCards();

        return Optional.of(cards.stream()
                .filter(card -> card.getCardNumber().equals(number))
                .toList().get(0));
    }
}
