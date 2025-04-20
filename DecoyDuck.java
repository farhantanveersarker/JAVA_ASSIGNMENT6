class DecoyDuck extends Duck {
    public DecoyDuck() {
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new MuteQuack();
    }

    public void display() {
        System.out.println("I'm a Decoy duck");
    }
}
