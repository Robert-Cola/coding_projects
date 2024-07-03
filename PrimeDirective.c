#include <stdlib.h>
#include <stdio.h>
#include <math.h>
#include <stdbool.h>

bool isPrime(int number);
int main(int argc, const char *argv[])
{
  for (int i = 2; i < 13; i++)
  {
    printf("%d is prime: %d\n", i, isPrime(i));
  }
  return 0;
}

bool isPrime(int number)
{
  // anything less than or equal to one is non-prime
  if (number <= 1)
  {
    return false;
  }
  // 2 is a special case prime
  else if (number == 2)
  {
    return true;
  }
  // all even number greater than 2 are composite
  else if (number % 2 == 0)
  {
    return false;
  }

  // check all the odd values from 3 to root(number)
  for (int i = 3; i <= sqrt(number); i += 2)
  {
    if (number % i == 0)
    {
      return false;
    }
  }
  return true;
}