import java.util.Scanner;

class Magic8Ball {

    public static void main (String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int x = (int) (Math.random()*3) + 1;
        
        System.out.println("Ask a yes or no question!  Reveal your fate!");
        sc.nextLine();
        
        if (x == 1) System.out.println("It is certain.");
        else if (x == 2) System.out.println("It is decidedly so.");
        else if (x == 3) System.out.println("Without a doubt.");
        else if (x == 4) System.out.println("Yes – definitely.");
        else if (x == 5) System.out.println("You may rely on it.");
        else if (x == 6) System.out.println("As I see it, yes.");
        else if (x == 7) System.out.println("Most likely.");
        else if (x == 8) System.out.println("Probably.");
        else if (x == 9) System.out.println("Yes.");
        else if (x == 10) System.out.println("Signs point to yes.");
        else if (x == 11) System.out.println("Better not tell you now.");
        else if (x == 12) System.out.println("This is impossible to know.");
        else if (x == 13) System.out.println("Cannot predict now.");
        else if (x == 14) System.out.println("Ask again later.");
        else if (x == 15) System.out.println("Don't count on it.");
        else if (x == 16) System.out.println("My reply is no.");
        else if (x == 17) System.out.println("My sources say no.");
        else if (x == 18) System.out.println("Definitely not.");
        else if (x == 19) System.out.println("Very doubtful.");
        else if (x == 20) System.out.println("Probably not.");
    }
}