package com.tts;
import java.util.*;


public class Main {

    public static void main(String[] args) {
        // write your code here
//part 2 you are a car dealer. create a hash map of vehicles. the model is key, make is value. ask customers what car model they are looking for. Use the hashmap to determine if you have that vehicle and what make it

//    Creates a HashMap with a String as key and Integer as the value it points to
        HashMap<String, String> vehicles = new HashMap<>();

////.put adds items to the hash map
        vehicles.put("Toyota", "Camry");
        vehicles.put("Tesla", "Model 3");
        vehicles.put("Tesla", "Model X");
        vehicles.put("Ford", "Mustang");
        vehicles.put("Honda", "Accord");
        vehicles.put("Ford", "Model A");
        vehicles.put("Jeep", "Wrangler");
        vehicles.put("Dodge", "Charger");
        vehicles.put("BMW", "M5");
        vehicles.put("Subaru", "Outback");
        vehicles.put("Nissan", "Altima");
        vehicles.put("Toyota", "Tundra");
//// ask customer what kind of car, he/she/they/them are looking for?
        Scanner input = new Scanner(System.in);

        System.out.println("Howdy do. Welcome to All Star Car. We help you find what you are looking for. What kind of car are you looking for?");
        String response1 = input.nextLine();//"I don't know. I am shopping for my first car."
        System.out.println("Totally understand that there are lots of car types to choose from. Are you looking for weekend car, city car or luxury car?");//
        String response2 = input.nextLine();//"weekend car"
        // if answer is weekend car
        if (response2.equals("weekend car")) {
            System.out.println("I recommend something like a Subaru or Jeep");
            String response3 = input.nextLine();//"I think I am more of a Subaru" or whichever user wants
            if (response3.equals("Subaru")) {
                String Subaru = vehicles.get("Subaru");
                System.out.println("Let me see what kind of Subaru model we have. We have a Subaru " + Subaru + ".");
            }
        }
        // if answer is luxury car car
        else if (response2.equals("luxury car")) {
            System.out.println("I recommend something like a Tesla, BMW or Toyota");
            String response4 = input.nextLine();
            if (response4.equals("Tesla")) {
                String Tesla = vehicles.get("Tesla");
                System.out.println("Let me see what kind of Tesla model we have. We have a Tesla " + Tesla + ".");
            }
        } else {
            System.out.println("I recommend something like a Honda, or Nissan");
            String response5 = input.nextLine();
            if (response5.equals("Honda")) {
                String Honda = vehicles.get("Honda");
                System.out.println("Let me see what kind of Honda model we have. We have a Subaru " + Honda + ".");

            }
        }
        System.out.println("Would you like to take the car for a test drive?");
        String response6 = input.nextLine();
    }

}