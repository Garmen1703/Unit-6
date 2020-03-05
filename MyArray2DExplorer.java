public class MyArray2DExplorer {

  public boolean evenRow(int [][] mat, int row){
    for(int i = 0;i < mat[row].length;i++){
      if(mat[row][i]%2!=0){
        return false;
      }
    }
    return true;
  }

  //returns true if the sum of the numbers the given col is odd.
  public boolean oddColSum(int[][] nums,int col){
    int numRows = nums.length;
    int sum=0;
    for(int i=0; i<nums.length;i++){
      sum += nums[i][col];
    }
    if(sum%2!=1){
      return false;
    }
    return true;
  }


  public int[] minList(int [][] mat){ // Accidentely did the wrong thing for minRow
    int len = mat.length;
    int[] mins = new int[len];
    for(int i = 0;i<mat.length;i++){
      for(int r=0;r<mat[i].length;i++){
        int min = mat[i][0];
        if(mat[i][r]<min){
          min = mat[i][r];
        }
        mins[i]=min;
      }
    }
    return mins;
  }


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


        System.out.print("Test minList: \n Expecting: {0 2 3 4} \n Actual: {");
        int[] row = exp.minList(array);
        for(int i = 0; i < row.length; i++){
            System.out.print(row[i] + " ");
        }
        System.out.print("]");

    }

}
