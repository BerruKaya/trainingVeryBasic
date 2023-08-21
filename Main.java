import java.util.Scanner;

public class Main {
    public static void main(String[ ] args){

        Scanner scan= new Scanner(System.in);
        System.out.println("welcome to the training app");

        String moves = "burpee,situp,pushup,squat";
        System.out.println(moves);

        System.out.println("make yourself a training program that involves moves");

        System.out.println("number of burpee you'd like to do ");
        int burpee= scan.nextInt();

        System.out.println("number of pushup you'd like to do ");
        int pushup = scan.nextInt();

        System.out.println("number of situp you'd like to do ");
        int situp = scan.nextInt();

        System.out.println("number of squat you'd like to do ");
        int squat=scan.nextInt();
        scan.nextLine();

        Training train= new Training(12,78,36,42);

        System.out.println("start your training");

        while(!train.isOver()){
            System.out.println();
            System.out.println("type of move");
            String move= scan.next();
            System.out.println("how much");
            int number= scan.nextInt();
            scan.nextLine();

            train.move(move,number);
        }
        System.out.println("you finished the training, congrats!");

    }
}
