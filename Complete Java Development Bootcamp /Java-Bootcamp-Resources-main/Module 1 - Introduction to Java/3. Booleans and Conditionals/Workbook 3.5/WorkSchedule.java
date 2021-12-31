public class WorkSchedule {
    public static void main(String[] args) {
        int day = 6;  
        boolean holiday = false;
         
        // if it's a holiday, print: "woohoo, no work!");
        if (holiday) {
            System.out.println("woohoo, i still work!");
        } else if (day >= 6) {
            // if it's the weekend, print: "it's the weekend, no work!"
            System.out.println("it's the weekend, i still work!");
        } else {
            // otherwise, print: "Wake up at 7:00 :( ";
            System.out.println("i still work!");
        }
        }

    }
