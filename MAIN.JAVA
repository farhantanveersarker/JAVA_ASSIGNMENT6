// Name: MD FARHAN TANVEER SARKER
// PRN: 23070126157
// Batch: AIML(B3)

public class Main {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        System.out.println("---------------------------------------------");
        mallardDuck.display();
        mallardDuck.performQuack();
        System.out.println("---------------------------------------------");
        Duck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.performQuack();
        System.out.println("---------------------------------------------");
        Duck readheadDuck = new RedheadDuck();
        readheadDuck.display();
        readheadDuck.performQuack();
    }
}
