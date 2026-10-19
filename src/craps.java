import java.util.Random;
import java.util.Scanner;
public class craps {
    static void main() {
        Random Generator = new Random();
        Scanner in = new Scanner(System.in);

        int die1 = Generator.nextInt(6)+1;
        int die2 = Generator.nextInt(6)+1;
        int sum = 0;
        int point = 0;
        boolean done = false;
        String roll = "";
        String fin = "";

        do {

            sum = die1 + die2;
            IO.println("Roll 1\t| Roll 2 |\tSum");
            IO.println("========================");
            IO.println("\t" + die1 + "\t|\t" +die2 + "\t|\t" + sum);


            if (sum == 2 || sum == 3 || sum == 12) {
                IO.println("Craps! You Lose!");
            } else if (sum == 7 || sum == 11) {
                IO.println("A natural! You win!");
            } else {
                point = sum;
                IO.println("You are now aiming for point: " + point);

                do {
                    IO.print("Roll again?: ");
                    roll = in.nextLine();

                    if (roll.equalsIgnoreCase("y")) {

                        die1 = Generator.nextInt(6) + 1;
                        die2 = Generator.nextInt(6) + 1;
                        sum = die1 + die2;
                        IO.println("=======|\t" + point +"\t|=======");
                        IO.println();
                        IO.println("Roll 1\t| Roll 2 |\tSum");
                        IO.println("========================");
                        IO.println("\t" + die1 + "\t|\t" +die2 + "\t|\t" + sum);

                        if (sum == point) {
                            IO.println("You made point, you win!");
                            done = true;
                        } else if (sum == 7) {
                            IO.println("You got 7, you lose!");
                            done = true;
                        }
                    } else {
                        IO.println("You lost!");
                        done = true;
                    }
                } while (!done);

            }
            done = false;

            IO.print("Would you like to play again? [Y/N]: ");
            fin = in.nextLine();

            if(fin.equalsIgnoreCase("y")) {
                done = false;
            }else{
                done = true;
            }

            die1 = Generator.nextInt(6)+1;
            die2 = Generator.nextInt(6)+1;
            sum = die1 + die2;

        }while(!done);






    }
}
