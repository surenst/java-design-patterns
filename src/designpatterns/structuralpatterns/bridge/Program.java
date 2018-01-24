package designpatterns.structuralpatterns.bridge;

public abstract class Program {
    protected Developer developer;

    protected Program(Developer developer) {
        this.developer = developer;
    }

    protected abstract void developProgram();
}
