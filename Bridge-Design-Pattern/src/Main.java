// Implementor interface
interface CommandoAbilities {
    void performPrimaryAction();
    void performSecondaryAction();
}

// Concrete Implementor 1: Green Beret
class GreenBeretAbilities implements CommandoAbilities {
    @Override
    public void performPrimaryAction() {
        System.out.println("Green Beret performs close-quarters combat.");
    }

    @Override
    public void performSecondaryAction() {
        System.out.println("Green Beret can pick up enemy uniforms for disguise.");
    }
}

// Concrete Implementor 2: Sniper
class SniperAbilities implements CommandoAbilities {
    @Override
    public void performPrimaryAction() {
        System.out.println("Sniper performs long-range sniping.");
    }

    @Override
    public void performSecondaryAction() {
        System.out.println("Sniper can disguise as a civilian or enemy officer.");
    }
}

// Concrete Implementor 3: Spy
class SpyAbilities implements CommandoAbilities {
    @Override
    public void performPrimaryAction() {
        System.out.println("Spy excels in infiltration and sabotage.");
    }

    @Override
    public void performSecondaryAction() {
        System.out.println("Spy can silently eliminate enemies with a silenced pistol or throwing knife.");
    }
}

// Abstraction
abstract class CommandoCharacter {
    protected CommandoAbilities abilities;

    public CommandoCharacter(CommandoAbilities abilities) {
        this.abilities = abilities;
    }

    public abstract void performPrimaryAction();
    public abstract void performSecondaryAction();
}

// Refined Abstraction 1: Green Beret
class GreenBeret extends CommandoCharacter {
    public GreenBeret(CommandoAbilities abilities) {
        super(abilities);
    }

    @Override
    public void performPrimaryAction() {
        System.out.println("Green Beret orders: ");
        abilities.performPrimaryAction();
    }

    @Override
    public void performSecondaryAction() {
        System.out.println("Green Beret orders: ");
        abilities.performSecondaryAction();
    }
}

// Refined Abstraction 2: Sniper
class Sniper extends CommandoCharacter {
    public Sniper(CommandoAbilities abilities) {
        super(abilities);
    }

    @Override
    public void performPrimaryAction() {
        System.out.println("Sniper orders: ");
        abilities.performPrimaryAction();
    }

    @Override
    public void performSecondaryAction() {
        System.out.println("Sniper orders: ");
        abilities.performSecondaryAction();
    }
}

// Refined Abstraction 3: Spy
class Spy extends CommandoCharacter {
    public Spy(CommandoAbilities abilities) {
        super(abilities);
    }

    @Override
    public void performPrimaryAction() {
        System.out.println("Spy orders: ");
        abilities.performPrimaryAction();
    }

    @Override
    public void performSecondaryAction() {
        System.out.println("Spy orders: ");
        abilities.performSecondaryAction();
    }
}

// Client code
public class Main {
    public static void main(String[] args) {
        CommandoAbilities greenBeretAbilities = new GreenBeretAbilities();
        CommandoCharacter greenBeret = new GreenBeret(greenBeretAbilities);
        greenBeret.performPrimaryAction();
        greenBeret.performSecondaryAction();

        CommandoAbilities sniperAbilities = new SniperAbilities();
        CommandoCharacter sniper = new Sniper(sniperAbilities);
        sniper.performPrimaryAction();
        sniper.performSecondaryAction();

        CommandoAbilities spyAbilities = new SpyAbilities();
        CommandoCharacter spy = new Spy(spyAbilities);
        spy.performPrimaryAction();
        spy.performSecondaryAction();
    }
}
