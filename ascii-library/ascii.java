import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ascii {

    static void main() {

        String[] result = sortBooks(new String[] {"The Catcher in the Rye", "To Kill a Mockingbird", "1984", "Moby Dick", "1984"});
        System.out.println( Arrays.toString(result));
    }



    public static String[] sortBooks(String[] books){


        //library will be the books and their values
        Map<String, Integer> library = new HashMap<>();

        for(String book : books){
            library.put(book, calculateComplexity(book));
        }


        Map<String, Integer> bookList = library.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));


        String[] result = new String[bookList.size()];
        int i =0;
        for(String s : bookList.keySet()){
            result[i++]= s;
        }

        return result;
    }
    public static int calculateComplexity(String title){


        char[] letters = title.toCharArray();

        int total = 0;
        for(char c : letters){

            total+= (int) c;

        }


        return total;
    }
}
