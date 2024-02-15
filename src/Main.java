
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        User user1 = User.getIstanza();
User user2 = User.getIstanza();


        user1.setEta(23);
        user1.setNome("Mila");

        System.out.println(User.getIstanza());
        user2.setEta(17);
        user2.setNome("Carmelo");
        System.out.println(User.getIstanza());



    }
}