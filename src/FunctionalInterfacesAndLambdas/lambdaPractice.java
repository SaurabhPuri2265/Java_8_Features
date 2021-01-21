package FunctionalInterfacesAndLambdas;

public class lambdaPractice {
    public static void main(String[] args) {

       lambdaInterface helloVar =  () -> System.out.println("Hello there");

       //Printing
        helloVar.walking();

       //Calaulate sum of 2 numbers
       Calculate sum = (arg1,arg2) -> (arg1 + arg2);
        System.out.println(sum.compute(5,6));

        //Non Zero Divide
        Calculate divide = (a,b) -> {
            if(a==0)
                return 0;

            return a/b;
        };

        System.out.println(divide.compute(40,8));

        //Reverse a String
        StringWorker reverser = (s)->{
            String rev="";
            for(char c:s.toCharArray())
                rev=c+rev;

            return rev;
        };

        System.out.println(reverser.reverser("Hello World"));

    }

    public int nonZeroDivide(int a,int b)
    {
        if(a==0)
            return 0;
        return a/b;
    }

    public static void walker(walkable walkableEntity){
        walkableEntity.walk();
    }
}

interface Calculate{
    public int compute(int arg1,int agr2);
}
interface StringWorker{
    public String reverser(String str);
}