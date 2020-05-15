import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SingleWords implements Iterable<String>{

    BufferedReader bufferedReader;
    Set<String> set = new HashSet<>();

    public void showSingle(){

        try {
            bufferedReader = new BufferedReader(new FileReader("lusiadas.txt"));

            String line = "";
            String result = "";

            while((line = bufferedReader.readLine()) != null){
               result += line + "\n";
            }
            for(String words : result.split(" ")){
                set.add(words);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Override
    public Iterator iterator() {
        return set.iterator();
    }
}
