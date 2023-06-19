# Commandos Game Characters

## Green Beret
![Green Beret](https://static.wikia.nocookie.net/commandos/images/1/1b/Green_beret.jpg/revision/latest?cb=20110608162436)

Abilities:
- Performs close-quarters combat.
- Can pick up enemy uniforms for disguise.
- Expert in hand-to-hand combat.
- Can throw knives at enemies.
- Can use explosives for sabotage.

Attributes:
- Health: High
- Speed: Moderate
- Stealth: Low

## Sniper
![Sniper](https://static.wikia.nocookie.net/commandos/images/3/32/Sniper.jpg/revision/latest?cb=20110608174348)

Abilities:
- Performs long-range sniping.
- Can disguise as a civilian or enemy officer.
- Expert in precision shooting.
- Can set up tripwires and traps.
- Can crawl in prone position for stealthy movement.

Attributes:
- Health: Low
- Speed: Moderate
- Stealth: High

## Spy
![Spy](https://static.wikia.nocookie.net/commandos/images/c/cb/Spy.jpg/revision/latest?cb=20110608174525)

Abilities:
- Excels in infiltration and sabotage.
- Can silently eliminate enemies with a silenced pistol or throwing knife.
- Can climb walls and traverse rooftops.
- Can disguise as enemy soldiers.
- Can sabotage enemy equipment.
- Proficient in lockpicking and hacking.

Attributes:
- Health: Moderate
- Speed: High
- Stealth: Very High

# Explanation of Code

## Code 1: Commando Game Playable Characters

The first code represents a Java implementation based on the playable characters from the Commandos game released in 1999. It demonstrates the Adapter design pattern.

The code defines an interface called `CommandoAbilities`, which declares the methods `performPrimaryAction()` and `performSecondaryAction()`. This interface represents the abilities that commando characters can perform.

The concrete classes `GreenBeretAbilities`, `SniperAbilities`, and `SpyAbilities` implement the `CommandoAbilities` interface and provide the specific implementations for each character's abilities.

The `CommandoCharacter` class represents a commando character. It has a name, weapon, and ability, and provides methods to perform the primary and secondary actions. It internally delegates the actions to the corresponding abilities of the character.

The `CommandoCharacterAdapter` class is the adapter class. It implements the `CommandoAbilities` interface and internally wraps a `CommandoCharacter` instance. It delegates the calls to the `performPrimaryAction()` and `performSecondaryAction()` methods to the wrapped `CommandoCharacter` instance.

In the `main()` method, instances of the commando characters (`greenBeret`, `sniper`, and `spy`) are created and their abilities are adapted using the `CommandoCharacterAdapter` class. The adapted abilities are then used to perform the primary and secondary actions for each character.

## Bridge Pattern

The code defines an interface called `CommandoAbilities` that declares the methods `performPrimaryAction()` and `performSecondaryAction()`. This interface represents the abilities that commando characters can perform.

The concrete classes `GreenBeret`, `Sniper`, and `Spy` extend the `CommandoCharacter` abstract class and provide the specific implementations for each character. Each concrete class encapsulates an instance of `CommandoAbilities` and delegates the actions to the abilities.

The `CommandoCharacter` abstract class represents a commando character. It has a reference to `CommandoAbilities` and provides abstract methods `performPrimaryAction()` and `performSecondaryAction()`.

In the `main()` method, instances of the refined abstractions (`greenBeret`, `sniper`, and `spy`) are created, each associated with a specific set of abilities (`greenBeretAbilities`, `sniperAbilities`, and `spyAbilities`). The `performPrimaryAction()` and `performSecondaryAction()` methods are called on each refined abstraction, which internally delegates the calls to the corresponding abilities.

## Builder Pattern

The third code showcases the Builder design pattern. It allows constructing `CommandoCharacter` objects with a fluent interface by separating the construction logic from the `CommandoCharacter` class itself.

The `CommandoCharacter` class represents the product being constructed. It has a private constructor that takes in the character's name, weapon, and ability. The class also includes a `displayInfo()` method to display the character's information.

Inside `CommandoCharacter`, there is a nested `Builder` class. The `Builder` class contains fields for the character's name, weapon, and ability. It provides setter methods for each field, allowing the client to set the desired values. The `build()` method constructs a new `CommandoCharacter` object using the provided values and returns it.

In the `main()` method, `CommandoCharacter` objects (`greenBeret`, `sniper`, and `spy`) are created using the `Builder` class. The client chains the setter methods to set the character's name, weapon, and ability. Finally, the `build()` method is called to construct the `CommandoCharacter` object. The `displayInfo()` method is then invoked on each object to display the character's information.

---
