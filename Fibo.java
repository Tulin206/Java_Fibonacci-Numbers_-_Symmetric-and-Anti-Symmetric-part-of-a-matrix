import java.math.BigInteger;

public class Fibo {

  // iterative computation of fibonacci sequence
  // public static long iterative(int n){
  //   assert n >= 0 : "Input must be greater or equal to zero.";
  //   long f1 = 0;
  //   long f2 = 1;
  //   long f3 = 0;
  //   if (n <= 0) {
  //     return 0;
  //   } else if (n == 1){
  //     return 1;
  //   } else{
  //     for(int i = 2; i <= n; i++){
  //       f3 = f2 + f1;
  //       f1 = f2;
  //       f2 = f3;
  //     }
  //   }
     
  //   return f3;
  // }
    

  // Recursive computation of fibonacci sequence
  // public static long recursive(int n) {
  //   long rec = 0;
  //   if (n <= 0) {
  //     return 0;
  //   } else if (n == 1) {
  //     return 1;
  //   } else {
  //     rec = recursive(n - 2) + recursive(n - 1);
  //     return rec;
  //   }
  // }

  // Print the array of fibonacci numbers in the range of long numbers
  public static long[] fiboNumbers(int n) {
    assert n >= 0 : "Input must be greater or equal to zero.";
    long[] fib = new long [n + 1];
    if (n==0) {
      fib [0] = 0;
    }
    if (n >= 1){
      fib [0] = 0;
      fib [1] = 1;
      for(int i = 2; i <= n; i++){
        fib [i] = fib [i-1] + fib [i-2];
        if (fib [i] < 0){
          fib [i] = -1;
          break;
        }
      }
    }
    // for(int i = 0; i <= n; i++) {
    //   fib[i] = iterative(i);
    // }
    return fib;
  }

  // Print the array of fibonacci numbers in the range of BigInteger numbers
  public static BigInteger[] bigFiboNumbers(int n) {
    assert n >= 0 : "Input must be greater or equal to zero.";
    BigInteger[] fib = new BigInteger[n + 1];
    if (n == 0) {
      fib [0] = BigInteger.ZERO;
    }
    // if (n ==1) {
    //   fib [0] = BigInteger.ZERO;
    //   fib [1] = BigInteger.ONE;
    // }
    if (n >= 1) {
      fib [0] = BigInteger.ZERO;
      fib [1] = BigInteger.ONE;
      for(int i = 2; i <= n; i++){
        fib[i]=fib[i - 2].add(fib[i - 1]);
      }
    }
    return fib;
  }

  public static void main(String[] args) {
    //read the numbers from command-line arguments
    for (int i = 0; i < args.length; ++i) {
      int n = Integer.parseInt(args[i]);

      //print the array of long numbers
      long[] fibo = fiboNumbers(n);
      for (int k = 0; k < fibo.length; k++) {
        //avoid interger overflow
        if (fibo[k] == -1){
            System.out.println("Overflow occured");
            break;
        }else{
            System.out.println("Values for long numbers on index "+ k + ": " + fibo[k]);
        }
          
      }

      //print the array of BigInteger numbers
      BigInteger[] bigFibo = bigFiboNumbers(n);
      for (int j = 0; j < bigFibo.length; j++) {
          System.out.println("Values for BigInteger numbers on index "+ j + ": " + bigFibo[j].toString());
      }
    }
  }
}

