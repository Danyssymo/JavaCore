package academy.alexander.les4;

import java.util.Random;

public class Cat {
    Random random = new Random();

    String name = getRandomWords();

    int age = random.nextInt(28) + 1;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cat() {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    private static String getRandomWords() {
        Random random = new Random();
        int wordLength = 5; // длина слова
        StringBuffer randomWord = new StringBuffer(); // создаем буфер для слова
        for (int i = 0; i < wordLength; i++) {
            int randomInt = random.nextInt(26) + 97; // генерируем случайный int больший или равный 97
            randomWord.append((char) randomInt); // преобразуем int в символ и добавляем в буфер
        }
        String result = randomWord.toString(); // выводим полученное слово
        return result;
    }

    @Override
    public boolean equals(Object o) {
        // 1
        if (this == o) {
            return true;
        }

        // 2
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        // 3
        Cat cat = (Cat) o;
        return age == cat.age &&
                name.equals(cat.name);
    }
}