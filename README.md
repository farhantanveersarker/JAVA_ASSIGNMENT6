Strategy Pattern Lab 6: Duck Behavior Simulation
This project demonstrates the use of the Strategy Pattern to model different duck behaviors. Instead of using inheritance, behaviors like flying and quacking are encapsulated into separate classes, allowing dynamic behavior changes at runtime.

Features
Uses the Strategy Pattern for flexible duck behavior.
Supports multiple fly and quack behaviors.
Allows dynamic behavior changes at runtime.
How It Works
Duck: The main class representing different types of ducks.
FlyBehavior: Interface for defining different flying behaviors.
QuackBehavior: Interface for defining different quacking behaviors.
Concrete classes implement various flying and quacking behaviors.
Usage
Clone the repository:
git clone https://github.com/Anjal-Poudel/Strategy-Pattern-lab6.git
Open the project in your Java IDE.
Run the main class to see different duck behaviors.
Example Output:
Quack!
I'm flying with wings!
I can't fly.
Benefits of Strategy Pattern
Promotes code reusability and flexibility.
Avoids code duplication and tight coupling.
Allows easy addition of new behaviors without modifying existing code.
