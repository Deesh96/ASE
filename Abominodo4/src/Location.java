
public class Location extends SpacePlace {
  //public int c;
  //public int r;
  
  //Introduce Explaining Variable

  public int Column;
  public int Row;
  public DIRECTION d;
  
  public enum DIRECTION {VERTICAL, HORIZONTAL};
  
  public Location(int r, int c) {
    this.Row = r;
    this.Column= c;
  }

  public Location(int r, int c, DIRECTION d) {    
    this(r,c);
    this.d=d;
  }
  
  public String toString() {
    if(d==null){
      return "(" + (c+1) + "," + (r+1) + ")";
    } else {
      return "(" + (c+1) + "," + (r+1) + "," + d + ")";
    }
  }
}
