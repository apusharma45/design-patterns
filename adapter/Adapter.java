package adapter;

public class Adapter implements USBPort {
    SDCard card;
    public Adapter(SDCard card) {
        this.card = card;
    }
    public void insert() {
        card.plugin();
    }
}
