package com.robhewison.namegen;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Created the Array for Boy First Names
        String[] boyFirstNames = new String[]{"Rob", "Andrew", "James", "John", "Michael", "William", "David", "Richard", "Joseph", "Thomas", "Charles", "Christopher", "Daniel", "Matthew", "Anthony", "Donald", "Mark", "Paul", "Steven", "Kenneth",
                "Joshua", "George", "Kevin", "Brian", "Edward", "Ronald", "Timothy", "Jason", "Jeffrey", "Ryan", "Jacob", "Gary", "Nicholas", "Eric", "Stephen", "Jonathan", "Larry", "Justin", "Scott", "Brandon", "Frank",
                "Benjamin", "Gregory", "Samuel", "Raymond", "Patrick", "Alexander", "Jack", "Dennis", "Jerry", "Tyler", "Aaron", "Jose", "Henry", "Douglas", "Adam", "Peter", "Nathan", "Zachary", "Walter", "Kyle", "Harold",
                "Carl", "Jeremy", "Keith", "Roger", "Gerald", "Ethan", "Arthur", "Terry", "Travis", "Huey", "Briggs", "Bruno", "Hector", "Mario", "Atticus", "Cruz", "Garrett", "Cesar", "Zayn", "Odin", "Muhammad", "Conor", "Joaquin",
                "Caiden", "Dakota", "Major", "Keegan", "Sergio", "Marshall", "Johnny", "Kade", "Edgar", "Marco", "Tyson", "Nasir", "Kanye", "Adonis", "Rory", "Andy", "Malik", "Ari", "Gage", "Trevor", "Pedro", "Winston", "Matthias"};

        //Created the Array for Girl First Names
        String[] girlFirstNames = new String[]{"Tennison", "Emma", "Olivia", "Ava", "Isabella", "Sophia", "Charlotte", "Mia", "Amelia", "Harper", "Evelyn", "Abigail", "Emily", "Elizabeth", "Mila", "Ella", "Avery", "Sofia", "Camila", "Aria", "Scarlett",
                "Victoria", "Madison", "Luna", "Grace", "Chloe", "Penelope", "Layla", "Riley", "Zoey", "Nora", "Lily", "Eleanor", "Hannah", "Lillian", "Addison", "Aubrey", "Ellie", "Stella", "Natalie", "Zoe", "Leah", "Hazel",
                "Violet", "Aurora", "Savannah", "Audrey", "Brooklyn", "Bella", "Claire", "Skylar", "Lucy", "Paisley", "Everly", "Anna", "Caroline", "Nova", "Genesis", "Emilia", "Kennedy", "Samantha", "Maya", "Willow", "Kinsley", "Tessa", "Dakota",
                "Selena", "Lia", "Camille", "Malia", "Samara", "Raegan", "Ruth", "Olive", "Alexa", "Ivy", "Isla", "Autumn", "Eva", "Alice", "Ariana", "Jessica", "Logan", "Annie", "Sage", "Nina", "Arielle", "Raelyn", "Rylie", "Lexi", "Maci", "Margot",
                "Joy", "Cassidy", "Veronica", "Angel", "Heaven", "Kira", "Haley", "Alison", "Helen", "Kelsey", "Mikayla", "Blair", "Kyla", "Eve", "Kayleigh", "Sierra", "Chelsea", "Kara", "Holly", "Leslie", "Remy", "Macy", "Sasha", "Liberty"};

        //Created the Array for Last Names
        String[] lastNames = new String[]{"Hewison", "Smith", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson", "Moore", "Taylor", "Anderson", "Thomas", "Jackson", "White", "Harris", "Martin", "Thompson", "Garcia", "Martinez", "Robinson", "Clark",
                "Rodriguez", "Lewis", "Lee", "Walker", "Hall", "Allen", "Young", "Hernandez", "King", "Wright", "Lopez", "Hill", "Scott", "Green", "Adams", "Baker", "Gonzalez", "Nelson", "Carter", "Mitchell", "Perez", "Roberts",
                "Turner", "Phillips", "Campbell", "Parker", "Evans", "Edwards", "Collins", "Stewart", "Sanchez", "Morris", "Rogers", "Reed", "Cook", "Morgan", "Bell", "Murphy", "Bailey", "Rivera", "Cooper", "Richardson", "Cox",
                "Howard", "Ward", "Torres", "Peterson", "Gray", "Ramirez", "James", "Watson", "Brooks", "Kelly", "Sanders", "Price", "Bennett", "Wood", "Barnes", "Ross", "Henderson", "Coleman", "Jenkins", "Perry", "Powell", "Long", "Garrison"};

        // Create name length variables so random number generation scales for total array names
        int boyNameLength = boyFirstNames.length;
        int girlNameLength = girlFirstNames.length;
        int lastNameLength = lastNames.length;
        //User selected number if they want boy or girl
        int boyOrGirlSelect;
        //variable for how many names get generated
        int nameCount;
        //Initialize Scanner to get user input
        Scanner reader = new Scanner(System.in);

        // Random Number Generator Setup
        Random rand = new Random();
        // Add 1 to the result to get a number from the required range
        // (i.e., [1 - 100])

        //Asking user whether they want a boy or girl
        System.out.println("Type 1 for boy name 2 for girl name (both if none selected):");

        //Obtaining user input for boy/girl
        boyOrGirlSelect = reader.nextInt();

        //Asking how many names you'd like to generate
        System.out.println("How many names would you like to generate?");

        //Obtaining user input for how many names to generate
        nameCount = reader.nextInt();
        reader.close();

        //Creating ability to generate multiple names
        for (int i = 0; i < nameCount; i++) {
            int n = rand.nextInt(boyNameLength);
            int n2 = rand.nextInt(girlNameLength);
            int n3 = rand.nextInt(lastNameLength);

            // Random generation if they don't choose boy or girl
            int oneOrTwo = rand.nextInt(2);
            oneOrTwo += 1;

            String boyFullName = boyFirstNames[n] + " " + lastNames[n3];
            String girlFullName = girlFirstNames[n2] + " " + lastNames[n3];

            //Decision tree
            if (boyOrGirlSelect == 1) {
                System.out.println(boyFullName);
            }
            else if (boyOrGirlSelect == 2) {
                System.out.println(girlFullName);
            }
            else {
                if (oneOrTwo == 1) {
                    System.out.println(boyFullName);
                }
                else if (oneOrTwo == 2) {
                    System.out.println(girlFullName);
                }
                else {
                    System.out.println("error");
                }
            }
        }

        // Check if there are any duplicates in the girlFirstNames Array
        for (int i = 0; i < girlNameLength; i++) {
            for (int j = i + 1; j < girlNameLength; j++) {
                if (girlFirstNames[i].equals(girlFirstNames[j])) {
                    System.out.println(girlFirstNames[i]);
                    System.out.println(i);
                    System.out.println(girlFirstNames[j]);
                    System.out.println(j);
                }
            }

        }
    }
}
