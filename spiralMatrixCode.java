public class spiralMatrixCode {
    public static void main(String[] args) {
        int [][] multiArray ={{1,2,3,4},
                              {5,6,7,8},
                            {9,10,11,12},
                            {13,14,15,16}} ;

        int startRow = 0 ;
        int startCol = 0 ;
        int endRow = multiArray.length-1 ;
        int endCol = multiArray[0].length-1 ;

        while (startRow <= endRow && startCol <= endCol){
            //Top
            for (int j=startCol ; j<=endCol ; j++){
                System.out.print(multiArray[startRow][j]);
            }
            // Right
            for (int i=startRow+1 ; i<=endRow ; i++){
                System.out.print(multiArray[i][endCol]);
            }
            // Left
        }
    }
}
