public class Main {
    // Adaptee: CommandoAbilities
    interface CommandoAbilities {
        void performPrimaryAction();
        void performSecondaryAction();
    }

    // Concrete Adaptees: GreenBeretAbilities, SniperAbilities, SpyAbilities
    static class GreenBeretAbilities implements CommandoAbilities {
        @Override
        public void performPrimaryAction() {
            System.out.println("Green Beret performs close-quarters combat.");
        }

        @Override
        public void performSecondaryAction() {
            System.out.println("Green Beret can pick up enemy uniforms for disguise.");
        }
    }

    static class SniperAbilities implements CommandoAbilities {
        @Override
        public void performPrimaryAction() {
            System.out.println("Sniper performs long-range sniping.");
        }

        @Override
        public void performSecondaryAction() {
            System.out.println("Sniper can disguise as a civilian or enemy officer.");
        }
    }

    static class SpyAbilities implements CommandoAbilities {
        @Override
        public void performPrimaryAction() {
            System.out.println("Spy excels in infiltration and sabotage.");
        }

        @Override
        public void performSecondaryAction() {
            System.out.println("Spy can silently eliminate enemies with a silenced pistol or throwing knife.");
        }
    }

    // Adapter: CommandoCharacterAdapter
    static class CommandoCharacterAdapter implements CommandoAbilities {
        private final CommandoCharacter character;

        public CommandoCharacterAdapter(CommandoCharacter character) {
            this.character = character;
        }

        @Override
        public void performPrimaryAction() {
            character.performPrimaryAction();
        }

        @Override
        public void performSecondaryAction() {
            character.performSecondaryAction();
        }
    }

    // CommandoCharacter class
    static class CommandoCharacter {
        private final String name;
        private final String weapon;
        private final String ability;

        public CommandoCharacter(String name, String weapon, String ability) {
            this.name = name;
            this.weapon = weapon;
            this.ability = ability;
        }

        public void performPrimaryAction() {
            System.out.println(name + " performs the primary action: " + weapon + " attack.");
        }

        public void performSecondaryAction() {
            System.out.println(name + " performs the secondary action: " + ability + ".");
        }
    }

    public static void main(String[] args) {
        CommandoCharacter greenBeret = new CommandoCharacter("Green Beret", "Knife", "Silent takedowns");
        CommandoCharacter sniper = new CommandoCharacter("Sniper", "Sniper Rifle", "Long-range precision shots");
        CommandoCharacter spy = new CommandoCharacter("Spy", "Silenced Pistol", "Disguise and stealth");

        CommandoAbilities greenBeretAbilities = new CommandoCharacterAdapter(greenBeret);
        CommandoAbilities sniperAbilities = new CommandoCharacterAdapter(sniper);
        CommandoAbilities spyAbilities = new CommandoCharacterAdapter(spy);

        greenBeretAbilities.performPrimaryAction();
        greenBeretAbilities.performSecondaryAction();

        sniperAbilities.performPrimaryAction();
        sniperAbilities.performSecondaryAction();

        spyAbilities.performPrimaryAction();
        spyAbilities.performSecondaryAction();
    }
}
