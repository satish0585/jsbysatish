public class SwapDemo{
int x = Integer.MAX;
int y = Integer.MAX -1;

x = x ^ y;
y = x ^ y;
x = x ^ y;
System.out.println("After Swap x = " + x + "  And y = " + y);




}
