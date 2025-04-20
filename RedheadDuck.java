public class RedheadDuck extends Duck{
    public RedheadDuck(){
        quackBehaviour = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am a Redhead Duck");
    }

    @Override
    public void performFly() {
        super.performFly();
    }

    @Override
    public void performSwim() {
        super.performSwim();
    }
}
