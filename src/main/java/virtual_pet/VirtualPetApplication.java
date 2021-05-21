package virtual_pet;


import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {
        //Interact with a VirtualPet object in this method

        Scanner input = new Scanner(System.in);
        String userName;
        String userChoice;
        int min = 1;
        int max = 3;
        int gameOverMessageNumber = (int) (Math.random() * max + min);
        int menuItemMessageNumber;
        boolean keepPlaying = true;

        VirtualPet myVirtualPet = new VirtualPet("Sweet Pea", "Russian Dwarf Hamster", 28, 28, 28, 28);

        System.out.println("Welcome to Virtual Pet! Please enter your first name");
        userName = input.nextLine();
        System.out.println("Hi " + userName + ". Here is some information about your virtual pet:");

        System.out.println("   A; ;A");
        System.out.println("  ={ t.}= )~");

        System.out.println("Your virtual pet is a " + myVirtualPet.getPetBreed());
        System.out.println("Name: " + myVirtualPet.getPetName());
        System.out.println();


        while (keepPlaying) {
            System.out.println(myVirtualPet);
            System.out.println("What do you want to do for your pet?");
            System.out.println("Press 1 to fill " + myVirtualPet.getPetName() + "'s food dispenser and water bottle");
            System.out.println("Press 2 to put " + myVirtualPet.getPetName() + " on the treadmill");
            System.out.println("Press 3 to take " + myVirtualPet.getPetName() + " off the treadmill");
            System.out.println("Press 4 to do nothing.");

            userChoice = input.nextLine();

            if (userChoice.equals("1")) {
                System.out.println("You filled " + myVirtualPet.getPetName() + " food dispenser and water bottle");
                myVirtualPet.getTick();
                menuItemMessageNumber = myVirtualPet.getTick();

                if (menuItemMessageNumber == 1) {
                    System.out.println("It's been 1 day since your hamster last ate. Your hamster ate food and drank water and is very happy.");

                } else if (menuItemMessageNumber == 2) {
                    System.out.println("It's been 2 days since your hamster last ate. Your hamster is too angry at you to eat. Perhaps a run on the treadmill will cheer it up.");

                } else if (menuItemMessageNumber == 3) {
                    System.out.println("It's been 3 days since your hamster last ate. Your hamster was so hungry it gobbled the food down and gulped the water bottle dry. Afterwards it fell into an exhausted heap.");

                } else if (menuItemMessageNumber == 4) {
                    System.out.println("it's been 4 days since you filled the food and water. Your hamster ran away. Game Over");
                    System.exit(0);
                }

            } else if (userChoice.equals("2")) {
                System.out.println("You put " + myVirtualPet.getPetName() + " on the treadmill");
                myVirtualPet.getTick();
                menuItemMessageNumber = myVirtualPet.getTick();
                if (menuItemMessageNumber == 1) {
                    System.out.println("Your hamster has been on the treadmill for 1 hour and is very happy.");
                } else if (menuItemMessageNumber == 2) {
                    System.out.println("Your hamster has been on the treadmill for 2 hours and is starting to get a little tired. It's going for the burn!");
                } else if (menuItemMessageNumber == 3) {
                    System.out.println("Your hamster has been on the treadmill for 3 hours and is really tired. Maybe you should take them off");
                } else if (menuItemMessageNumber == 4) {
                    System.out.println("Your hamster has been on the treadmill for over 4 hours. They fainted and have to be taken to the Pet Hospital. Game Over.");
                    System.exit(0);
                }
            } else if (userChoice.equals("3")) {
                System.out.println("You took " + myVirtualPet.getPetName() + " off the treadmill");
                myVirtualPet.getTick();
                menuItemMessageNumber = myVirtualPet.getTick();
                if (menuItemMessageNumber == 1) {
                    System.out.println("Your hamster was only on the treadmill for 1 hour and wants back on the treadmill!!");
                } else if (menuItemMessageNumber == 2) {
                    System.out.println("Your hamster was on the treadmill for 2 hours and is happy to be taken off so that they can eat, drink and be merry");
                } else if (menuItemMessageNumber == 3) {
                    System.out.println("It's been 3 hours since your hamster was taken off the treadmill.  They are getting bored");
                } else if (menuItemMessageNumber == 4) {
                    System.out.println("It's been 4 days since you took the hamster off the treadmill. They got so bored they ran away. Game Over");
                    System.exit(0);
                }
            } else if (userChoice.equals("4")) {
                keepPlaying = false;
            } else {
            System.out.println("Oh no " + userName + "! Sweet Pea ran away. Game over.");
            System.exit(0);
        }
            myVirtualPet.tick();
        }
        if (gameOverMessageNumber == 1) {
            System.out.println("Oh no " + userName + "! " + myVirtualPet.getPetName() + " ran away because the hamster cage has not been cleaned in over 6 months. Game over.");
            System.exit(0);
        } else if (gameOverMessageNumber == 2) {
            System.out.println("Oh no " + userName + "! The water bottle holder broke " + myVirtualPet.getPetName() + "'s hamster cage got soaked. Game over.");
            System.exit(0);
        } else {
            System.out.println("Oh no " + userName + "! The treadmill broke and injured" + myVirtualPet.getPetName() + "! " + myVirtualPet.getPetName() + " was taken to the Pet Hospital. Game over.");
            System.exit(0);
        }

        input.close();
    }

}



