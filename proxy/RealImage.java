package proxy;

class RealImage implements Image {
    String filename;
    public RealImage(String filename) {
        this.filename = filename;
        loadFromDisk(filename);
    }
    private void loadFromDisk(String filename) {
        System.out.println("loading " + filename + "...");
    }
    public void display() {
        System.out.println("file loaded");
    }
}
