import java.util.HashMap;
import java.util.Map;

public class Main {



  enum Season {
WINTER,
    SPRING,
    SUMMER,
    FALL,



  }
  public static Season getSeason(String month) {
    return switch (month.toLowerCase()) {
      case "dec", "jan", "feb" -> Season.WINTER;
      case "mar", "apr", "may" -> Season.SPRING;
      case "jun", "jul", "aug" -> Season.SUMMER;
      default -> Season.FALL;
    }
  }

  public static void main(String[] args) {

    System.out.println("Hello world!");


  }public  static void MapLine(){
    Map<String,String>Line=new HashMap<>();
  }
}
