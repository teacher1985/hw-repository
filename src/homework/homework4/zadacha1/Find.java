package homework.homework4.zadacha1;

public class Find {
    private char t;

    public Find(char s) {
        this.t = s;
        char[] str = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', 'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm'};
        if (t == 'q') System.out.println('m');
        for (int i = 1; i < str.length; i++) {
            if (str[i] == t) {
                System.out.println(str[i - 1]);
            }
        }
    }
}
