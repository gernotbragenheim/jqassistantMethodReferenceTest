import java.util.Optional;

public class MyTestClassA {
    public static void main(String[] args) {
        // Constraint does notice constructor invoke ✔
        Optional<MyTestClassB> maybeMyTestClassB = Optional.of(new MyTestClassB());

        // Constraint does notice method invoke ✔
        maybeMyTestClassB.ifPresent(myTestClassB -> myTestClassB.doSomeAction());

        // Constraint does not notice method invoke ❌
        maybeMyTestClassB.ifPresent(MyTestClassB::doSomeAction);
    }
}
