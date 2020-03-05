import java.util.Scanner;
public class Frequency{
  private int[] list;

  public Frequency(int[] array){
    list = array;
  }

  public getFrequency(){
    for(i=0;i<list.length;i++){
      if(list[i]<11)
    }
  }
  public String drawChart(){
    System.out.println("1-10: ");
    System.out.println("11-20: ");
    System.out.println("21-30: ");
    System.out.println("31-40: ");
    System.out.println("41-50: ");
    System.out.println("51-60:");
    System.out.println("61-70: ");
    System.out.println("71-80: ");
    System.out.println("81-90: ");
    System.out.println("91-100: ");
  }

  public static void main(String[]args){
    Scanner scan=new Scanner(System.in);

    System.out.println("How many values will you input");
    int size = scan.nextInt();

    int[]data = new int[size];

    System.out.println("Enter values one at a time, follow each by hitting enter.");
    int val = 0;
    for (int i=0;i<data.length;i++){
      val = scan.nextInt();
      data[i]=val;
    }

    Frequency chart = new Frequency(data);

    chart.drawChart();
  }
}
