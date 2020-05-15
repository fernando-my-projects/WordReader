import java.io.*;

public class ShowFileContent {

    FileReader fileReader;
    BufferedReader bufferedReader;

    public void read() {
        try {
            fileReader = new FileReader("lusiadas.txt");
            bufferedReader = new BufferedReader(fileReader);

            String line = "";
            String result = "";

            while ((line = bufferedReader.readLine()) != null) {
                //read each line at a time
                result += line + "\n";
            }
            System.out.println(result);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
