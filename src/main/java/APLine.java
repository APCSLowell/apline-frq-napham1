public class APLine
{
  private int a, b, c;
  public APLine(int x, int y, int z){
    this.a = x;
    this.b = y;
    this.c = z;
  }
  public double getSlope(){
    return (- (this.a/ (double) this.b));
  }
  public boolean isOnLine(int x, int y){
    return (0 == (this.a * x) + (this.b * y) + this.c);
}
