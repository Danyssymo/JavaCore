package academy.alexander.les55;

import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
      getMatrix();
    }
    public static String getRandomDouble() {
        Double db = (Math.random() + 1);
        return String.format("%.5f", db).replace(',', '.');
    }
    public static String getRandomWord() {
        char[] alphabet = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz".toCharArray();
        char[] slovo = new char[7];
        for (int i = 0; i < 7; i++) {
            int x = (int) (Math.random() * 52);
            slovo[i] = (alphabet[x]);
        }
        return new String(slovo);
    }
    public static void getMatrix() {
        System.out.println("Первоначальная матрица: ");
        String[][] matrix = new String[10][10];
        String[] right = new String[10];
        String[] left = new String[10];
        buildDiag(matrix, right, left);
        System.out.println("Правильная диагональ");
        System.out.println(Arrays.toString(right));
        System.out.println("Обратная диагональ");
        System.out.println(Arrays.toString(left));
        System.out.print("Сравнение: ");
        System.out.println(right.equals(left));

        String[] all = new String[20];
        int x = 0;
        for (int i = 0; i < 20; i++) {
            if (i < 10) {
                all[i] = right[i];
            } else {
                all[i] = left[x];
                x++;
            }
        }

        System.out.println("Общий массив: ");
        System.out.println(Arrays.toString(all));
        System.out.print("Округленные элементы: ");
        StringBuilder next = new StringBuilder();
        for (String s: all){
            if (s.matches("^[a-zA-Z]*$")){
                next.append(s.substring(1,4)).append(", ");
            } else {
                System.out.print(Math.round(Float.parseFloat(s ))+ " ");
            }
        }

        System.out.println();
        System.out.println("Элементы String 2-4: ");
        System.out.println(next);
    }

    private static void buildDiag(String[][] matrix, String[] right, String[] left) {
        int count = 1;
        int a = 9;
        int b = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (count %3 == 0){
                    matrix[i][j] = getRandomDouble();
                    System.out.print(" "+ matrix[i][j]+ " ");
                } else {
                    matrix[i][j] = getRandomWord();
                    System.out.print(" " + matrix[i][j] + " ");
                }
                count++;
                if (i==j){
                    right[j] = matrix[i][j];
                }
                if (i == b && j == a){
                    left[i] = matrix[i][j];
                    a--;
                    b++;
                }
            }
            System.out.println();
        }
    }


}