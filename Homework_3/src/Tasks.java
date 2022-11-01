import java.util.Scanner;
import java.util.Random;

public class Tasks {
    public static void main(String[] args){
        TaskOne();
        TaskTwo();
    }

    public static int TaskOne(){
        System.out.println("Let's Play!");

        Random random = new Random();
        int answer = random.nextInt(10);

        System.out.println("The number is hidden. You have three attempts.");
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        boolean mark = false;

        while (count < 3){
            System.out.print("Your Number : ");
            int panel = scanner.nextInt();
            if (answer > panel){
                System.out.println("My number is bigger than yours. Try again.");
                count++;
            }
            else if (answer < panel){
                System.out.println("My number is smaller than yours. Try again.");
                count++;
            }
            else if (answer == panel){
                mark = true;
                break;
            }
            }
        if (mark){
            System.out.println("You won, buddy!");
        }
        else{
            System.out.println("Oh, you cannot :)");
        }

        System.out.println("Wanna try again? 1 - Yes, 0 - No : ");
        int replay = scanner.nextInt();
        if(replay == 1){
            TaskOne();
        }
        else if(replay == 0) {
            return 0;
        }
        throw new RuntimeException("А нефиг! Вводи ноль");
    }

    public static int TaskTwo(){
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
                "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        System.out.println("Let's play another game. Can you guess the word?");

        Random random = new Random();

        String answer_word = words[random.nextInt(words.length)];
        String answer_panel = "###############";

        boolean mark = false;

        Scanner scanner = new Scanner(System.in);
        System.out.println("So, begin. Here's the panel : " + answer_panel);
        while (!mark){
            System.out.println("Enter your word : ");
            String player_word = scanner.nextLine();
            if(player_word.equals(answer_word)){
                System.out.println("That's correct, buddy!");
                mark = true;
            }
            else{
                String min_word = (player_word.length() < answer_word.length()) ? player_word : answer_word;
                for(int i = 0; i < min_word.length(); i++){
                    if(player_word.charAt(i) == answer_word.charAt(i)){
                        answer_panel = answer_panel.substring(0, i) + player_word.charAt(i) + answer_panel.substring(i + 1);
                    }
                }
                System.out.println("Not yet, try harder. Your answer panel : " + answer_panel);
            }
        }
        return 0;
    }
}