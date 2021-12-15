

object Fibonacci4 {
  def fib(n:Int): Int ={
    if(n==0 || n==1 || n==2 || n==3)
       if(n==0 || n==1) 0
       else 1
    else
      fib(n-1) + fib(n-2)+fib(n-3)+fib(n-4)
    
  }
      def main(args: Array[String]) {
        
        val n = 10;
        for(i <- 1 to n)
          print(fib(i)+" ");
    }
}