package FunctionalInterfacesAndLambdas;

public class App {
    public static void main(String[] args) {

        Human human=new Human();
        Robot robot=new Robot();

        //walker(human);
        //walker(robot);

        //Using walker function for anonymous classes implemnting walkable interface

        //Closest implementation of functional programming upto java7
        walker(new walkable(){
            public void walk(){
                System.out.println("Custome object walking");
            }
        });

        //After java7 lambdas were introduced to make the code much smaller and modular
        //() represents parameters,-> is the calling symbol
        walkable obj=() -> System.out.println("lambda object walking");

        walker(obj);


    }

    public static void walker(walkable walkableEntity){
        walkableEntity.walk();
    }
}
