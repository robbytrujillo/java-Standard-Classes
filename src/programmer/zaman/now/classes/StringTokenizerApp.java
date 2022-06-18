package programmer.zaman.now.classes;

import java.util.StringTokenizer;

public class StringTokenizerApp { //lebih hemat memakan memory
    public static void main(String[] args) {

        String value = "Robby Ilhamkusuma";
        StringTokenizer tokenizer = new StringTokenizer(value, " " );

         while (tokenizer.hasMoreTokens()){
            String result = tokenizer.nextToken();
             System.out.println(result);
         }

    }
}
