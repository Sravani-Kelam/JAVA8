package referencelambda.Stream;

import java.util.Arrays;
import java.util.List;

public class limit {
    public static void main(String args[]){
        List<String> name= Arrays.asList("sri","ajju","siri","aru","sravs","anjana","anvith");
        name.stream()
                .limit(5)
                .sorted()
                .forEach(System.out::println);
    }
}
