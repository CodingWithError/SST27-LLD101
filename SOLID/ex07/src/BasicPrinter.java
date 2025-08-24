public class BasicPrinter implements Machine {
    public void print(String text) {
        System.out.println("Print: " + text);
    }

    public void scan(String dstPath) {
        System.out.println("Scan operation not supported by BasicPrinter");
    }

    public void fax(String number) {
        System.out.println("Fax operation not supported by BasicPrinter");
    }
}
