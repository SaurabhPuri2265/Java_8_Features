package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
    //the Stream API is used to process collections of objects. A stream is a sequence of objects that supports various
        // methods which can be pipelined to produce the desired result.

        Integer[] a=new Integer[]{2,3,4,5};
        List<Integer> numbers= Arrays.asList(a);

        //MAP operation
        //Using stream to get the squares of numbers
        List<Integer> squares=numbers.stream().map(x -> x*x).collect(Collectors.toList());
        //printing the list
        System.out.println(squares);

        //Filter operation
        List<Integer> filteredList= numbers.stream().filter(x -> x<4).collect(Collectors.toList());
        //Printing the modified list
        System.out.println(filteredList);

        //SImilarly sorted operation is performed

        //Terminal Operations
        //1.collect

        //2.forEach
       numbers.stream().map(x -> x*2).forEach(y -> System.out.println(y));

       //Finding max in a list using stream
        int max=numbers.stream().max(Integer::compareTo).get();
        System.out.println(max);
    }
}
