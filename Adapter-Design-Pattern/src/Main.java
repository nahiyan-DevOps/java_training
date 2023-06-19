// Target interface
interface Commando {
    void executeCommand();
}

// Green Beret class (Adaptee)
class GreenBeret {
    public void performAttack() {
        System.out.println("Green Beret: Performing close-quarters attack");
    }
}

// Adapter for Green Beret
class GreenBeretAdapter implements Commando {
    private GreenBeret greenBeret;

    public GreenBeretAdapter(GreenBeret greenBeret) {
        this.greenBeret = greenBeret;
    }

    @Override
    public void executeCommand() {
        greenBeret.performAttack();
    }
}

// Sniper class (Adaptee)
class Sniper {
    public void performSnipe() {
        System.out.println("Sniper: Performing sniper shot");
    }
}

// Adapter for Sniper
class SniperAdapter implements Commando {
    private Sniper sniper;

    public SniperAdapter(Sniper sniper) {
        this.sniper = sniper;
    }

    @Override
    public void executeCommand() {
        sniper.performSnipe();
    }
}

// Spy class (Adaptee)
class Spy {
    public void performInfiltration() {
        System.out.println("Spy: Infiltrating enemy territory");
    }
}

// Adapter for Spy
class SpyAdapter implements Commando {
    private Spy spy;

    public SpyAdapter(Spy spy) {
        this.spy = spy;
    }

    @Override
    public void executeCommand() {
        spy.performInfiltration();
    }
}

// Client code
public class Main {
    public static void main(String[] args) {
        GreenBeret greenBeret = new GreenBeret();
        Commando greenBeretAdapter = new GreenBeretAdapter(greenBeret);
        greenBeretAdapter.executeCommand();

        Sniper sniper = new Sniper();
        Commando sniperAdapter = new SniperAdapter(sniper);
        sniperAdapter.executeCommand();

        Spy spy = new Spy();
        Commando spyAdapter = new SpyAdapter(spy);
        spyAdapter.executeCommand();
    }
}
