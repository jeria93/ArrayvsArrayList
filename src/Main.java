import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Arrays -> size never changes once created
//        Arrays can store primitive values such as String, int, double, bool, char etc. AND objects
//        [0][1][2][3]
        String[] friendsArray = new String[4];
        String[] friendsArray1 = {"John", "Jane", "Nicholas", "Selma"};
        char[] charArray = {'a', 'b', 'c'};
        Pet[] myPets = {
                new Pet("Dexter", "Dog"),
                new Pet("Sara", "Cat"),
                new Pet("Bob", "Dog"),
        };
//        To get the value
        System.out.println(friendsArray1[0]);
//        In a forEach
        for (Pet pet : myPets) {
            System.out.println("my name is " + pet.name + " and im a " + pet.type);
        }
        System.out.println("--------------------------------------");
//        In a for loop
        for (int i = 0; i < myPets.length; i++) {
            System.out.println(myPets[i].name + " is " + myPets[i].type);
        }




//        ArrayList - Grows and shrinks automatically, has no size limit
//        ArrayList - can only store objects
        ArrayList<String> friendsArrayList = new ArrayList<>();
        ArrayList<String> friendsArrayList1 = new ArrayList<>(Arrays.asList("Luke", "Yoda", "Leia"));


    }
}