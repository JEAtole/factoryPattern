package factoryPattern;

import java.util.Scanner;

public class Clinic {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int choice = 0;
        while (choice!=3){

            System.out.println("[1] Dog");
            System.out.println("[2] Cat");
            System.out.println("[3] Exit");
            System.out.print("\nChoose your pet number: ");
            choice = sc.nextInt();

            PetRecord petFile = new PetRecord();
            Pet pet;

            switch (choice) {
                case 1 -> {
                    pet = new Dog();
                    petFile.setPetId("D01");
                    petFile.setPetName("Bantay");
                    petFile.setPet(pet);
                    ((Dog) pet).setBreed("German Shepperd");
                }
                case 2 -> {
                    pet = new Cat();
                    petFile.setPetId("C01");
                    petFile.setPetName("Muning");
                    petFile.setPet(pet);
                    ((Cat) pet).setNoOfLives(9);
                }
            }

            if (choice == 1 || choice ==2){
                System.out.println("\nPet id is " + petFile.getPetId());
                System.out.println("Pet name is " + petFile.getPetName());
                System.out.println("Pet kind: " + petFile.getPet().getClass().getSimpleName());
                System.out.println("Communication sound: "+ petFile.getPet().makeSound());
                System.out.println("Play mode: " + petFile.getPet().play());
                if (choice == 1){
                    System.out.println("Breed: " + ((Dog) petFile.getPet()).getBreed());
                } else {
                    System.out.println("No. of lives: " + ((Cat) petFile.getPet()).getNoOfLives());
                }
                System.out.println("\n------------------------------------\n");
            }


        }

        sc.close();
    }
}
