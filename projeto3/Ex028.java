public class Ex028 {

    public static void main (String[] args) {

        Usuario user1 = new Usuario("Joao", "joao@gmail.com");
        Usuario user2 = new Usuario();
        user2.setNome("Jose");
        user2.setEmail("jose@gmail.com");

        System.out.printf("User 1 | Nome: %s | Email: %s%n", user1.getNome(), user1.getEmail());
        System.out.printf("User 2 | Nome: %s | Email: %s%n", user2.getNome(), user2.getEmail());
    }
}