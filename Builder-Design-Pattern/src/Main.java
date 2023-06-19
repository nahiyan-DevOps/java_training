// Product: CommandoCharacter
class CommandoCharacter {
    private final String name;
    private final String weapon;
    private final String ability;

    private CommandoCharacter(String name, String weapon, String ability) {
        this.name = name;
        this.weapon = weapon;
        this.ability = ability;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Weapon: " + weapon);
        System.out.println("Ability: " + ability);
        System.out.println();
    }

    // Builder class
    public static class Builder {
        private String name;
        private String weapon;
        private String ability;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setWeapon(String weapon) {
            this.weapon = weapon;
            return this;
        }

        public Builder setAbility(String ability) {
            this.ability = ability;
            return this;
        }

        public CommandoCharacter build() {
            if (name == null || weapon == null || ability == null) {
                throw new IllegalStateException("Name, weapon, and ability must be set.");
            }
            return new CommandoCharacter(name, weapon, ability);
        }
    }
}

// Client code
public class Main {
    public static void main(String[] args) {
        CommandoCharacter greenBeret = new CommandoCharacter.Builder()
                .setName("Green Beret")
                .setWeapon("Knife")
                .setAbility("Silent takedowns")
                .build();

        CommandoCharacter sniper = new CommandoCharacter.Builder()
                .setName("Sniper")
                .setWeapon("Sniper Rifle")
                .setAbility("Long-range precision shots")
                .build();

        CommandoCharacter spy = new CommandoCharacter.Builder()
                .setName("Spy")
                .setWeapon("Silenced Pistol")
                .setAbility("Disguise and stealth")
                .build();

        greenBeret.displayInfo();
        sniper.displayInfo();
        spy.displayInfo();
    }
}
