public class PerfectCube {

    public static boolean perfectCube (long n) {
      long cube = Math.round(Math.cbrt(n));
      return (cube * cube * cube == n);
    }
  }
