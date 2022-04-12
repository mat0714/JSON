import java.io.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Git: Hello");
        System.out.println("Git: Hello2");
        System.out.println("Git: Hello3");
        System.out.println("Git: Hello4");

        String line = null;
        FileReader fileReader;
        BufferedReader bufferedReader;
        try {
            fileReader = new FileReader("OnePerson.json");
            bufferedReader = new BufferedReader(fileReader);
            System.out.println(bufferedReader.readLine());
            System.out.println(bufferedReader.readLine());
            System.out.println(bufferedReader.readLine());
            System.out.println(bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
