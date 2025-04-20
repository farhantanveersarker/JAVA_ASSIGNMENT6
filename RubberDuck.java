public class RubberDuck extends Duck{
    public RubberDuck(){
        quackBehaviour = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("I am a Rubber Duck");
    }

    public void swim(){
        System.out.println("I am a Float!");
    }

    public void quack(){
        System.out.println("Squeak Squeak!");
    }

}
