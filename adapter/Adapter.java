package adapter;

public class Adapter {
    SDCard card;
    public void insert() {
        card = new SDCard();
        card.plugin();
    }
}
