package adapter;

public class Main {
    public static void main(String[] args) {
        SDCard card = new SDCard();
        USBPort adapter = new Adapter(card);
        adapter.insert();
    }
}
