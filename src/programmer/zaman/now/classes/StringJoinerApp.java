package programmer.zaman.now.classes;

import java.util.StringJoiner;

public class StringJoinerApp {
    public static void main(String[] args) {

        StringJoiner joiner = new StringJoiner(", ", "[", "]");

        joiner.add("Robby");
        joiner.add("Ilham");
        joiner.add("kusuma");

        String value = joiner.toString();
        System.out.println(value);
    }
}
