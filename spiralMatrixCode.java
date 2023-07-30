public class spiralMatrixCode {
    public static void main(String[] args) {
        int [][] multiArray ={{1,2,3,4,17},         // This Code is for nXn , nXm , may be for even & odd also.
                              {5,6,7,8,18},
                            {9,10,11,12,19},
                            {13,14,15,16,20}} ;

        int startRow = 0 ;     // Logic already define.
        int startCol = 0 ;
        int endRow = multiArray.length-1 ;
        int endCol = multiArray[0].length-1 ;

        System.out.println("Array Elements In Spiral Format!");
        while (startRow <= endRow && startCol <= endCol){
            // Top values
            for (int j=startCol ; j<=endCol ; j++){
                System.out.print(multiArray[startRow][j]+" ");
            }
            // Right values
            for (int i=startRow+1 ; i<=endRow ; i++){
                System.out.print(multiArray[i][endCol]+" ");
            }
            // Bottom values
            for (int j=endCol-1 ; j>= startCol ; j--){
                if (startRow==endRow){
                    break;
                }
                System.out.print(multiArray[endRow][j]+" ");
            }
            // Left values
            for (int i=endRow-1 ; i>= startRow+1 ; i--){
                if (startCol == endCol){
                    break;
                }
                System.out.print(multiArray[i][startCol]+" ");
            }
            // For Picking out more inner values.
            startCol++ ;
            startRow++ ;
            endRow-- ;
            endCol-- ;
        }
    }
}
