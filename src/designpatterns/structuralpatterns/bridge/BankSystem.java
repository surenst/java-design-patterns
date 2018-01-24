package designpatterns.structuralpatterns.bridge;

public class BankSystem extends Program {
    protected BankSystem(Developer developer) {
        super(developer);
    }

    @Override
    protected void developProgram() {
        System.out.println("Bank system development in progress...");
        developer.writeCode();
    }
}
