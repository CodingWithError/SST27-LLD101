public class Player {
    protected Frame lastFrame;

    public void play(byte[] fileBytes) {
        Frame frame = decode(fileBytes);
        lastFrame = frame;
        display(frame);
        cache(frame);
    }

    protected Frame decode(byte[] fileBytes) {
        return new Frame(fileBytes);
    }

    protected void display(Frame frame) {
        System.out.println("\u25B6 Playing " + frame.getSize() + " bytes");
    }

    protected void cache(Frame frame) {
        System.out.println("Cached last frame? " + (frame != null));
    }

    public Frame getLastFrame() {
        return lastFrame;
    }
}