package triangle;

public class Main {
    public static void main(String[] args){
        Area ar = new Area();
      double calculatedArea = ar.areaCalculate();
      if(calculatedArea!=0) {
          System.out.println("Calculated area = " + calculatedArea);
      }
    }
}
