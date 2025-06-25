package ch12;

import java.util.List;
import java.util.stream.Collectors;

public class StreamTesting {

    public void finalVoid() {
        List<String> strings = List.of("A", "great", "gnarly", "everything",
                "reputation", "Baby I", "toxic", "bad b o clock");

        List<String> result = strings.stream().sorted()
                .limit(5).collect(Collectors.toList());

        System.out.println(result);

        String sent = "  Rrroorkro   ";

        int begin = 0;
        int end = sent.length()-1;
        boolean foundBegin = false;
        boolean foundEnd = false;
        while (begin < end) {
            if(sent.charAt(begin)==' '){
                begin++;
            }
            else{
                foundBegin = true;
            }

            if (sent.charAt(end)==' ') {
                end--;
            }
            else{
                foundEnd = true;
            }

            if(foundEnd && foundBegin){
                System.out.println(sent.substring(begin, end+1));
                System.out.println("Rrroorkro");
                break;
            }

        }

    }

    public static void main(String[] args){
        StreamTesting streamTesting = new StreamTesting();
        streamTesting.finalVoid();
    }
}
