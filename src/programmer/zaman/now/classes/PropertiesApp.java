package programmer.zaman.now.classes;

import java.io.*;
import java.util.Properties;

public class PropertiesApp {
    public static void main(String[] args) {

        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("application.properties"));

            String host = properties.getProperty("database.host");
            String port = properties.getProperty("database.port");
            String username = properties.getProperty("database.username");
            String password = properties.getProperty("database.password");

            System.out.println(host);
            System.out.println(port);
            System.out.println(username);
            System.out.println(password);

        }catch (FileNotFoundException exception){
            System.out.println("File tidak ketemu");
        }catch (IOException exception){
            System.out.println("Gagal load data dari File");
        }

        try {
            Properties properties = new Properties();
            properties.put("name.first", "Robby");
            properties.put("name.midle", "Ilhamkusuma");
            properties.put("name.last", "Jaya");

            properties.store(new FileOutputStream("name.properties"), "Konfigurasi Nama");
        }catch (FileNotFoundException exception){
            System.out.println("Membuat file Properties");
        }catch (IOException exception){
            exception.printStackTrace();
            System.out.println("Error menyimpan properties");
        }
    }
}
