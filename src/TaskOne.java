public class TaskOne {
    public static void main(String[] args) {
    }

    public static float TaskThree(float a, float b, float c, float d) {
        return (a * (b + (c / d)));
    }

    public static boolean TaskFour(float a, float b){
        if (a + b >= 10 && a + b <= 20){
            return true;
        }
        else {
            return false;
        }
    }

    public static String TaskFive(float a){
        if (a >= 0){
            return "The number is positive.";
        }
        else {
            return "The number is negative.";
        }
    }

    public static Object TaskSix(float a){
        if (TaskFive(a) == "The number is negative.") {
            return true;
        }
        return null;
    }

    public static void TaskSeven(String a){
        System.out.println("Привет, " + a + "!");
    }

    public static void TaskEight(int a){
        String an = "This year isn't Leap.";
        if (a % 4 == 0) {
            an = "This year is Leap.";
            if (a % 100 == 0 && a % 400 != 0) {
                an = "This year isn't Leap.";
            }
        }
        System.out.println(an);
    }
}
