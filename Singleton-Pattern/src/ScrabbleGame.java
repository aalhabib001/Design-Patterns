import java.util.LinkedList;

public class ScrabbleGame {
    public static void main(String[] args) {
        ScrabbleWord user1 = ScrabbleWord.getInstance();
        ScrabbleWord user2 = ScrabbleWord.getInstance();
        ScrabbleWord user3 = ScrabbleWord.getInstance();

        System.out.println("User 1 ID: " + System.identityHashCode(user1));
        System.out.println("List: " + user1.getLetterList());
        LinkedList<String> user1Letters = user1.getLetters(7);
        System.out.println(user1Letters);
        System.out.println("List: " + user1.getLetterList());

        System.out.println("User 2 ID: " + System.identityHashCode(user2));
        System.out.println("List: " + user2.getLetterList());
        LinkedList<String> user2Letters = user2.getLetters(7);
        System.out.println(user2Letters);
        System.out.println("List: " + user2.getLetterList());

        System.out.println("User 3 ID: " + System.identityHashCode(user3));
        System.out.println("List: " + user3.getLetterList());
        LinkedList<String> user3Letters = user3.getLetters(7);
        System.out.println(user3Letters);
        System.out.println("List: " + user3.getLetterList());
    }
}
