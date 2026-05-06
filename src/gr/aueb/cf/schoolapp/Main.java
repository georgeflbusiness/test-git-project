package gr.aueb.cf.schoolapp;

public class Main {

    public static void main(String[] args) {
        String[] test = {"test","test2","τεστ3"};
        System.out.println(test[0]);
        System.out.println("giorgos_floros euxaristw poyl na eiste kalak ai eseiw kai egw omvw oxi moino seisew eyxaeiata");
        printArray(test);

    }

    public static void printArray(String[] arr) {

        for (String token : arr) {
            System.out.println(token);
        }
    }



}
