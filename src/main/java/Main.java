import model.User;
import view.Menu;


public class Main {
    public static void main(String[] args) {

        User userTeste = new User("Aroldo", "12345");
        System.out.println(userTeste.getName());
        System.out.println("Hello world!");
    }
}