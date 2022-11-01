import java.util.Arrays;

public class Tasks {
    public static void main(String[] args)
    {
        int[] array = {1, 0, 1, 0, 0, 1, 1, 0, 1, 0};

        System.out.println(Arrays.toString(TaskOne(array)));
        //TaskOne

        int[] array_two = new int[8];
        int magnifier = 0;
        for(int i = 0; i < 8; i++){
            array_two[i] = magnifier;
            magnifier += 3;
        }

        System.out.println(Arrays.toString(array_two));
        //TaskTwo

        int[] array_three = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        System.out.println(Arrays.toString(TaskThree(array_three)));
        //TaskThree

        int[][] array_four = new int[5][5];
        for(int i = 0; i < 5; i++){
            array_four[i][i] = 1;
            array_four[i][array_four.length - 1 - i] = 1;
        }

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print(array_four[i][j] + " ");
            }
            System.out.println();
        }
        //TaskFour

        int[] array_five = array_three;
        int min = array_five[0];
        int max = array_five[0];
        for(int i = 0; i < array_five.length; i++){
            if (array_five[i] < min){
                min = array_five[i];
            }

            else if (array_five[i] > max){
                max = array_five[i];
            }
        }

        System.out.println(min + " " + max); //Третий массив обновлён, минимум равен двум
        //TaskFive

        int[] array_six = {1, 1, 1, 2, 1};
        System.out.println(checkBalance(array_six));
        //TaskSix

        int[] array_seven = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(TaskSeven(array_seven, 2)));
        System.out.println(Arrays.toString(TaskSeven(array_seven, -3)));
        //TaskSeven


    }

    public static int[] TaskOne(int[] array) {
        for(int i = 0; i < array.length; i++) {
            if (array[i] == 0 || array[i] == 1) {
                if (array[i] == 0){
                    array[i]++;
                }

                else{
                    array[i]--;
                } //Здесь бы идеально подошёл тернарный оператор, но эта сука меня через "not a statement" опрокидывает.
            }
        }
        return array;
    }

    public static int[] TaskThree(int[] array){
        for(int i = 0; i < array.length; i++){
            if (array[i] < 6) array[i]*=2;
        }

        return array;
    }

    public static boolean checkBalance(int[] array){
        boolean mark = false;
        int arr_count = 0;
        for(int i = 0; i < array.length; i++){
            arr_count += array[i];
        }

        int left_count = 0;
        for(int i = 0; i < array.length; i++){
            left_count += array[i];
            if(left_count == arr_count - left_count){
                mark = true;
                return mark;
            }
        }
        return mark;
    }

    public static int[] TaskSeven(int[] array, int n){
        if (n >= 0){
            for(int i = 0; i < n; i++){
                int last_el = array[array.length - 1];
                for (int j = 0; j < array.length - 1; j++){
                    array[array.length - j - 1] = array[array.length - j - 2];
                }
                array[0] = last_el;
            }
        }
        else{
            for(int i = 0; i < -n; i++){
                int first_el = array[0];
                for (int j = 0; j < array.length - 1; j++){
                    array[j] = array[j + 1];
                }
                array[array.length - 1] = first_el;
            }
        }
        return array;
    }
}