// Project from https://www.codecademy.com/projects/practice/java-prime-directive

class PrimeDirective {
  
  // Check for number prime or not
    static boolean isPrime(int n)
    {

        // Check if number is less than or equal to 1
        if (n <= 1)
          return false;

        // Check if number is 2
        else if (n == 2)
          return true;

        // Check if n is a multiple of 2
        else if (n % 2 == 0)
          return false;

        // If not, then just check the odds
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
          if (n % i == 0)
            return false;
        }
        return true;
    }
    
  public static void main(String[] args) {

    PrimeDirective pd = new PrimeDirective();
    int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};
    for (int number: numbers){
      System.out.print(number + " is prime: " + isPrime(number));
    }
  }  

}