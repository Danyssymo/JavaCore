package academy.alexander.test;

public class Test {

    public int check() {
        int x = (int) (Math.random() * 10);
    return x;
    }

    public int check2(){
        int y = (check()+1);
        return y;
    }
}
