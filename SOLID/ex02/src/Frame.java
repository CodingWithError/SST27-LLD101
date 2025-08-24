public class Frame {
    private final byte[] data;

    public Frame(byte[] data) {
        this.data = data;
    }

    public byte[] getData() {
        return data;
    }

    public int getSize() {
        return data.length;
    }
}
