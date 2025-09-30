// Every Java file is a CLASS
public class Main {
// main method is the ENTRYWAY to the program
   public static void main(String []args) {
      System.out.println("Welcome to Java!");
      System.out.println("hiiii");

      // 1. DECLARE a new variable
      int score;
      // 2. ASSIGN a value to the variable
      score = 72;
      // INITIALIZE combines declaring + assigning
      String pokemon = "Pikachu";
      double healthPercent = 0.75;
      boolean isAlive = true;

      // Use the plus sign to CONCATENATE (combine) Strings
      String greeting = "Hello " + "World";
      System.out.println(greeting);
      // Quotation marks contain STRING LITERALS


      // OUTPUT: difference btwn .print & .println
      System.out.print("Hi ");
      System.out.println("there!");
      System.out.print("!");
      // .println displays the message THEN goes to next line

      // ESCAPE: use \ (backslash) to include special characters, use \n for line break
      String message = "\n I woke up and said, \"HELLO WORLD\" ";
      System.out.println(message);

      // ARITHMETIC expressions with operators
      System.out.println(4 + 3);
      System.out.println(4 - 1);
      System.out.println(6 * 7);
      System.out.println(5 / 3); // TRUNCATED!
      // Integer division results in TRUNCATION, which is basically throwing away the decimal places
      System.out.println(5.0 / 3); // double
      
      // COMPOUND expressions follow PEMDAS
      double result = 2 + (3 * 2 -6);
      System.out.println(result);

      // REMAINDER % operator
      int remain = 23 % 2; // -> means ODD number
      System.out.println(remain);
      System.out.println(628 % 2); // 0 -> means EVEN

      // Watch out for the plus sign!
      System.out.println(3 + "3"); // int + String
      
      // You can set one variable to another's value
      int zach_age = 16;
      int aaniyah_age = zach_age;
      // both variables above contain the same value

      // Practice copying & re-assigning values
      int x = 15;
      int y = 21;
      int z = 2;
      x = y; // x now stores the same value as y
      y = y * 2;
      z = 27;
      System.out.println(x);
      System.out.println(y);
      System.out.println(z);
      System.out.println("X is " + x);
      System.out.println("Y is " + y);
      System.out.println("Z is " + z);
      
      // type mismatch error
      double num1 = 3; // int would cause an error below!
      double num2 = 3.14;
      num1 = 2 * num2; // can't fit a double in an int!
      System.out.println(num1);

      // INCREMENT: add on to current value
      int points = 0;
      points = points + 1;
      // DECREMENT: decrease an existing value
      points = points - 15;
      System.out.println(points);

      // CASTING (convert data types)
      int originalValue = 5;
      double castDouble = (double) originalValue;
      System.out.println("Cast to double: " + castDouble);
      int castInt = (int) castDouble;
      System.out.println("Cast back to int: " + castInt);

      // Examples of math and casting
      System.out.println(3/4); // 0
      System.out.println(3.0 / 4); // 0.75
      System.out.println ( 3 / 4.0); // 0.75
      System.out.println((double) 3/4);
      // casting preserved the decimal places (no truncation)
      System.out.println( (int) 3.0/4 ); // 0 (truncated!)

      // Casting is helpful when dividing integers
      int apcs = 13;
      int juniors = 40;
      double csPercent = (double) apcs/juniors;
      System.out.println(csPercent); // 0.325

      // ROUNDING by casting
      double positiveNum = 100.69;
      double negativeNum = -42.592;
      int nearestPositive = (int) (positiveNum + 0.5);
      int nearestNegative = (int) (negativeNum - 0.5);
      System.out.println(nearestPositive);
      System.out.println(nearestNegative);
      
      // COMPOUND OPERATORS (shortcuts)
      int runs = 0;
      // Re-assign variable to existing value plus 1
      runs = runs + 1;
      runs += 1; // operator first, then result assigned back
      System.out.println("Runs: " + runs);
      // Even shorter shortcut for adding/subtracting ONE!
      runs++;
      runs--; // same as runs = runs - 1;

      // More examples of shortcuts
      runs = runs * 2; // runs is now 4
      runs *= 3; // runs is now 12
      System.out.println(runs);
      System.out.println("Runs is now " + runs);
      runs *= -10;
      runs /= 10; // dividing current value by 10
      System.out.println(runs);
      runs %= 7; // remainder of runs/7
      System.out.println(runs);

      
   }
}
