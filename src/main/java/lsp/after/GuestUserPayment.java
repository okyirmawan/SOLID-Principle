package lsp.after;

public class GuestUserPayment implements NewPayment {
    String name;

    public GuestUserPayment() {
        this.name = "guest";
    }

    @Override
    public void newPayment() {
        System.out.println("Processing " + name + "'s current payment request.");
    }
}
