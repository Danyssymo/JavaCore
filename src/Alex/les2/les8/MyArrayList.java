package Alex.les2.les8;

public class MyArrayList<T> implements MyList<T> {
    public static int capacity = 0;
    public static String[] group = new String[capacity];

    @Override
    public int size() {
        int counter = 0;
        for (String t : group) {
            counter++;
        }
        System.out.println(counter);
        return counter;
    }

    @Override
    public boolean isEmpty() {
        boolean x = false;
        if (group.length == 0) {
            System.out.println("Пусто");
            x = true;
        } else {
            System.out.println("Не пусто");
        }
        return x;
    }

    @Override
    public boolean contains(Object value) {
        boolean x = false;
        for (String s : group) {
            if (s.equals(value)) {
                x = true;
                break;
            }
        }
        if (x) {
            System.out.println("Элемент " + value + " есть");
        } else {
            System.out.println("Элемента " + value + " нету");
        }
        return x;
    }

    @Override
    public boolean add(T value) {
        String[] newArray = new String[group.length + 1];
        boolean b = false;
        for (int i = 0; i < newArray.length; i++) {
            if (i == newArray.length - 1) {
                newArray[i] = (String) value;
                b = true;
            } else {
                newArray[i] = group[i];
            }
        }
        group = newArray;
        return b;
    }

    @Override
    public boolean add(int index, T value) {
        String[] newArray = new String[group.length + 1];
        boolean b = false;
        int t = 0;
        for (int i = 0; i < newArray.length; i++) {
            if (i == index) {
                newArray[i] = (String) value;
                b = true;
                t = 1;
            } else if (t == 0) {
                newArray[i] = group[i];
            } else if (t == 1) {
                newArray[i] = group[i - 1];
            }
        }
        group = newArray;
        return b;
    }

    @Override
    public boolean remove(Object value) {
        int x = 0;
        boolean b = false;
        String[] newArray = new String[group.length - 1];
        for (int i = 0; i <= newArray.length; i++) {
            if (group[i].equals(value)) {
                x = 1;
            } else {
                if (x == 1) {
                    newArray[i - 1] = group[i];
                    b = true;
                } else {
                    newArray[i] = group[i];
                }
            }
        }
        group = newArray;
        return b;
    }

    @Override
    public boolean addAll(T value[]) {
        String[] newArray = new String[group.length + value.length];
        int c = 0;
        boolean b = false;
        for (int i = 0; i < newArray.length; i++) {
            if (i < group.length) {
                newArray[i] = group[i];
            } else {
                newArray[i] = (String) value[c];
                c++;
                b = true;
            }
        }
        group = newArray;
        return b;
    }

    @Override
    public T get(int index) {
        T value = null;
        for (int i = 0; i < group.length; i++) {
            if (i == index) {
                value = (T) group[i];
            }
        }
        System.out.println(value);
        return value;
    }

    @Override
    public T remove(int index) {
        String[] newArray = new String[group.length - 1];
        int x = 0;
        T value = null;
        for (int i = 0; i < group.length; i++) {
            if (i == index) {
                x = 1;
                value = (T) group[i];
            } else {
                if (x == 0) {
                    newArray[i] = group[i];
                } else {
                    newArray[i - 1] = group[i];
                }
            }
        }
        group = newArray;
        System.out.println(value);
        return value;
    }

    @Override
    public T set(int index, T value) {
        for (int i = 0; i < group.length; i++) {
            if (i == index) {
                group[i] = (String) value;
            }
        }
        return value;
    }

    @Override
    public int indexOf(Object value) {
        int x = 0;
        for (int i = 0; i < group.length; i++) {
            if (group[i].equals(value)) {
                x = i;
                break;
            } else x = -1;
        }
        System.out.println(x);
        return x;
    }
}