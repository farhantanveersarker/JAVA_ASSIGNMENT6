public abstract class Duck {
    QuackBehaviour quackBehaviour;
    FlyBehavior flyBehaviour;
    SwimBehaviour swimBehaviour;

    public void performQuack() {
        quackBehaviour.quack();
    }

    public void performFly() {
        flyBehaviour.fly();
    }

    public void performSwim() {
        swimBehaviour.swim();
    }

    public void setQuackBehaviour(QuackBehaviour qb) {
        quackBehaviour = qb;
    }

    public void setFlyBehaviour(FlyBehavior fb) {
        flyBehaviour = fb;
    }

    public void setSwimBehaviour(SwimBehaviour sb) {
        swimBehaviour = sb;
    }

    public abstract void display();
}
