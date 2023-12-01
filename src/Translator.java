import java.util.HashMap;

public class Translator {

    HashMap<Integer, String>numericAlpha = new HashMap<>();

    public Translator (String[] writtenNumbers, Integer[] numbers){

        for (int i = 0; i < writtenNumbers.length; i++){
         numericAlpha.put(numbers[i],writtenNumbers[i]);
        }
    }

    public String translate (Integer number) {
        return
    }
}
