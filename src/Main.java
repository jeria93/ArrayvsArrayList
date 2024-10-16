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
        System.out.println("--------------------------------------");
        System.out.println(friendsArray.length);
        System.out.println(myPets.length);


        System.out.println("--------------------------------------");

//        ArrayList - Grows and shrinks automatically, has no size limit
//        ArrayList - can only store objects
        ArrayList<String> friendsArrayList = new ArrayList<>();
        ArrayList<String> friendsArrayList1 = new ArrayList<>(Arrays.asList("Luke", "Yoda", "Leia"));
        System.out.println(friendsArrayList1.get(0));
        System.out.println(friendsArrayList1.get(1));

        System.out.println(friendsArrayList1.size());
        System.out.println("--------------------------------------");

//        Set element
        friendsArray1[0] = "nicholas";
        System.out.println(friendsArray1[0]);
        System.out.println("--------------------------------------");
        friendsArrayList1.forEach(System.out::println);

        Pet dog = new Pet("Buster", "Dog");
        Pet cat = new Pet("Cat", "Cat");
        ArrayList<Pet> pets = new ArrayList<>();
        pets.add(dog);
        pets.add(cat);

        for (Pet pet : pets) {
            System.out.println(pet.name + " is " + pet.type);
        }
        System.out.println("--------------------------------------");
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Nicholas", "Selma", "Jennifer", "Wilda"));
        names.forEach(System.out::println);
    }
}