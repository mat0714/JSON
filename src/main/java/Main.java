import java.io.*;

public class Main {

    public static void main(String[] args) {


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
