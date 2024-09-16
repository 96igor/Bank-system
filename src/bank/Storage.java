package bank;

import model.Card;

import java.util.ArrayList;
import java.util.List;

public class Storage {
    private static List<Card> cards = new ArrayList<>();

    public static List<Card> getCards() {
        return cards;
    }
}
