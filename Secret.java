import java.util.Scanner;

class Secret {

    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Speak the password to open this Sith Holocron.");
        
        String password = sc.next();
        if (password.equals("senate"))
            System.out.println("Correct!  The holocron says: I, Palpatine am the Sith Lord!");
        else System.out.println("Nice try, foolish Jedi.  You will never know the secrets of the dark side of the force.");
        
        
     
    }
}