package programmer.zaman.now.classes;

public class StringBuilderApp {
    public static void main(String[] args) {

//Tidak disarankan karena terlalu banyak memakan memory
//        String name = "Robby";
//
//        name = name + " " + "Ilham";
//
//        name = name + "" + "kusuma";
//
//        System.out.println(name);

        //Di memory tetep satu object saja(konsumsinya tetep dikit)
        StringBuilder builder = new StringBuilder();
        builder.append("Robby");
        builder.append(" ");
        builder.append("Ilham");
        builder.append("");
        builder.append("kusuma");

        String name = builder.toString();
        System.out.println(name);

    }
}
