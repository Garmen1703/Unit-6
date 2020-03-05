public class Array2DExplorer{


  public static void main(String[] args) {
        int array [][] = {  {4,1,8,5},
                            {0,2,3,4},
                            {6,6,2,2} };
        MyArray2DExplorer exp = new MyArray2DExplorer();

        System.out.println("Test evenRow: \n Row w/ odd, Expecting: false \n Actual: " + exp.evenRow(array,0));
        System.out.println("Test evenRow: \n Row w/o odd, Expecting: true \n Actual: " + exp.evenRow(array,2));

        System.out.println();

        System.out.println("Test oddColSum: \n Col w/ odd Sum, Expecting: true \n Actual: " + exp.oddColSum(array,1));
        System.out.println("Test oddColSum: \n Col w/ even, Expecting: false \n Actual: " + exp.oddColSum(array,0));

        System.out.println();


        System.out.print("Test minRow: \n Expecting: {0 2 3 4} \n Actual: {");
        int [] row = exp.minRowPractice(array);
        for(int i = 0; i < row.length; i++){
            System.out.print(row[i] + " ");
        }
        System.out.print("]");

        System.out.println();

        System.out.print("Test minRowAssignment: \n Expecting: 2 \n Actual: ");
        System.out.println(exp.minRowAssignment(array, 2));

        System.out.println();

        System.out.print("Test colMax: \n Expecting: {6 6 8 5} \n Actual: {");
        int [] colMaxs = exp.colMaxs(array);
        for(int i = 0; i < colMaxs.length; i++){
            System.out.print(colMaxs[i] + " ");
        }
        System.out.print("}");

        System.out.println();
        System.out.println();

        System.out.print("Test allRowSum: \n Expecting: {18 9 16} \n Actual: {");
        int [] sum = exp.allRowSums(array);
        for(int i = 0; i < sum.length; i++){
            System.out.print(sum[i] + " ");
        }
        System.out.print("}");

        System.out.println();
        System.out.println();

        System.out.print("Test averageCol: \n Expecting: {3.333333 3.0 4.333333 3.6666667} \n Actual: {");
        double [] avg = exp.averageCol(array);
        for(int i = 0; i < avg.length; i++){
            System.out.print(avg[i] + " ");
        }
        System.out.print("}");


        System.out.println();
        System.out.println();

        System.out.print("Test smallEven: \n Expecting: 0 \n Actual: ");
        System.out.println(exp.smallEven(array));

        System.out.println();
        System.out.println();

        System.out.print("Test biggestRow: \n Expecting: 0 \n Actual: ");
        System.out.println(exp.biggestRow(array));

        System.out.println();
    }


  public int minRow(int[][]nums, int row){
    for(i=0;i<nums[row].length;i++){
      min = nums[row][0];
      if(nums[row][i]<min){
        min = nums[row][i];
      }
      return min;
    }
  }

  public int[] colMaxs(int[][] matrix){
    int[]colMax = new int[matrix[0].length];
    for(int i = 0; i<matrix[0].length; i++){
      int max = matrix[0][i];
      for(int r = 0; r < matrix.length;row++){
        if(matrix[r][i]>=max){
          max = matrix[r][i];
        }
      }
      colMax[i] = max;
    }
    return colMax;
  }

  public int[] allRowSums(int[][] data){
    int[] results = new int[data.length];
    int sum = 0;
    for(int i = 0; i<data.length;i++){
      for(int r = 0; r<data[i].length);i++){
        sum += data[i][r];
        results[i]=sum;
      }
    }
    return results;
  }

  public double[] averageCol(int[][] nums){
    double[] average = new double[nums[0].length]
    for(int i = 0 ; i< nums.length; i++){
      int
    }
  }
}
