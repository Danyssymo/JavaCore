package Alex.les2.les8;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyList<String> myElements = new MyArrayList<>();
        myElements.isEmpty();
        String[] symbols = new String[]{"Hello", "Tornado"};
        myElements.add("Лиссабон");
        myElements.add("Мехико");
        myElements.add("Марокко");
        myElements.add("Минск");
        myElements.add("Москва");
        myElements.add(0, "Автсралия");
        myElements.size();
        myElements.contains("Автсралия");
        myElements.isEmpty();
        check();
        myElements.remove("Лиссабон");
        check();
        myElements.size();
        myElements.addAll(symbols);
        check();
        myElements.get(4);
        myElements.remove(2);
        check();
        myElements.set(1, "Берлин");
        check();
        myElements.indexOf("Пекин");
    }

    private static void check(){
        System.out.println(Arrays.toString(MyArrayList.group));
    }

}