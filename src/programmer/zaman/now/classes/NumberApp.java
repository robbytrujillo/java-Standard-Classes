package programmer.zaman.now.classes;

public class NumberApp {
    public static void main(String[] args) {

        Integer intValue = 10;

        Long longValue = intValue.longValue();
        Double doubleValue = intValue.doubleValue();
        Short shortValue = intValue.shortValue();

        //number-class
        String contoh = "10000"; //Jika tidak bisa dikonversi maka error, karena berupa angka
        String contoh2 = "100.100";

        Integer contohInt = Integer.valueOf(contoh); //object
        System.out.println(contohInt);

        Double contohDouble = Double.valueOf(contoh2); //object
        System.out.println(contohDouble);
    }

}
