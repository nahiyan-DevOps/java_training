// Commando class (superclass)
class Commando {
    private final String category;
    private final int speed;
    private final int stealth;
    private final int health;
    private final int combat;
    private final int demolition;
    private final int marksman;
    private final int assault;
    private final int pistol;

    public Commando(String category, int speed, int stealth, int health, int combat, int demolition, int marksman,
                    int assault, int pistol) {
        this.category = category;
        this.speed = speed;
        this.stealth = stealth;
        this.health = health;
        this.combat = combat;
        this.demolition = demolition;
        this.marksman = marksman;
        this.assault = assault;
        this.pistol = pistol;
    }

    public void displayStats() {
        System.out.println("Category: " + category);
        System.out.println("Speed: " + speed);
        System.out.println("Stealth: " + stealth);
        System.out.println("Health: " + health);
        System.out.println("Combat: " + combat);
        System.out.println("Demolition: " + demolition);
        System.out.println("Marksman: " + marksman);
        System.out.println("Assault: " + assault);
        System.out.println("Pistol: " + pistol);
    }
}

// Sniper class (subclass)
class Sniper extends Commando {
    public Sniper() {
        super("Sniper", 70, 80, 30, 10, 20, 100, 30, 80);
    }
}

// Sapper class (subclass)
class Sapper extends Commando {
    public Sapper() {
        super("Sapper", 60, 50, 80, 70, 100, 10, 70, 70);
    }
}

// Spy class (subclass)
class Spy extends Commando {
    public Spy() {
        super("Spy", 100, 100, 20, 10, 50, 50, 50, 100);
    }
}

// Gunner class (subclass)
class Gunner extends Commando {
    public Gunner() {
        super("Gunner", 20, 30, 100, 80, 40, 10, 100, 100);
    }
}

// GreenBeret class (subclass)
class GreenBeret extends Commando {
    public GreenBeret() {
        super("Green Beret", 90, 100, 100, 100, 60, 10, 80, 70);
    }
}

public class Main {
    public static void main(String[] args) {
        Commando sniper = new Sniper();
        Commando sapper = new Sapper();
        Commando spy = new Spy();
        Commando gunner = new Gunner();
        Commando greenBeret = new GreenBeret();

        // Display stats for each character
        sniper.displayStats();
        System.out.println("--------------------");
        sapper.displayStats();
        System.out.println("--------------------");
        spy.displayStats();
        System.out.println("--------------------");
        gunner.displayStats();
        System.out.println("--------------------");
        greenBeret.displayStats();
    }
}
