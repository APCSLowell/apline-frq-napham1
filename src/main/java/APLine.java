public class APLine
{
  private int a, b, c;
  public APLine(int x, int y, int z){
    a = x;
    b = y;
    c = z;
  }
  public double getSlope(){
    return - (a/b);
  }
  public boolean isOnLine(int x, int y){
    return (0 == (a*x) + (b*y) + c);
}
