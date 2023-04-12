package DuckBehaviour;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I believe I cannot fly");
    }
}
