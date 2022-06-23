package programmer.zaman.now.classes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexApp {
    public static void main(String[] args) {

       String name = "Robby ilhamkusuma Programmer Zaman Now";
        Pattern pattern = Pattern.compile("[a-zA-Z]*[a][a-zA-Z]*");

        Matcher matcher = pattern.matcher(name);

        while (matcher.find()){
            String result = matcher.group();
            System.out.println(result);
            //System.out.println(matcher.group());
        }

    }
}
