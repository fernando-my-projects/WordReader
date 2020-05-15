import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class SeparateWords implements Iterable<String>{

    BufferedReader bufferedReader;
    Map<String, Integer> histogramMap = new TreeMap<>();

    public SeparateWords(){

        try {
            bufferedReader = new BufferedReader(new FileReader("lusiadas.txt"));

            String line = "";
            String result = "";

            while((line = bufferedReader.readLine()) != null){
                result += line + "\n";
            }
            for (String words : result.split(" ")){
                histogramMap.put(words, histogramMap.containsKey(words) ? histogramMap.get(words)+1 : 1);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // o iterador tem que ser realizado por cada uma das posições
    @Override
    public Iterator iterator() {
        return histogramMap.keySet().iterator();
    }

    public int size(){
        return histogramMap.size();
    }

    public int get(String word){
        return histogramMap.get(word);
    }



}

