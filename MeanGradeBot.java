import java.util.Scanner;

class MeanGradeBot {

    public static void main (String[] args) {
        //1. declare variables
        Scanner sc = new Scanner(System.in);
        //... other variables go here
        double max, score = 0;
        double p = 0;
        //2. get user input
        System.out.println("I am GradeBot!  Enter your grades, reveal your destiny!");
        System.out.println("What was the maximum score on the test?");
        max = sc.nextDouble();
        System.out.println("What was your score?");
        score = sc.nextDouble();
       
        
        //3. calculate and display answer
        if (score > max || score < 0 || max == 0) {
             System.out.println("Wow, you're really too stupid to even input the numbers right, or you're such a loser that you're wasting your time trying to troll a bot!");
        } else {
        p = 100 * (score / max);
             
            if (p >= 86) {
            System.out.println("You have gotten an A!  Congratulations, you will never get back all those hours you spent studying for a futile test!");
        } else if (p >= 73) {
            System.out.println("You have gotten a B!  You tried so hard, but it still wasn't quite good enough!");
        } else if (p >= 67) {
            System.out.println("You have gotten a C+! How mediocre, you must be a very boring person!");
        }else if (p >= 60) {
            System.out.println("You have gotten a C!  How mediocre, you must be a very boring person!");
        }else if (p >= 50) {
            System.out.println("You have gotten a C-! Wow, you were super close to failing! You did super poorly, and probably just got lucky!");
        } else if (p >= 0) {
            System.out.println("Wow! an F! This might be the saddest thing I've seen all year!  You suck!");
        } 
}
}
}