package twoDArray.EasyProblems;

public class BoundaryMatrix {
    public static void main(String[] args) 
        {
            int[][] matrix = new int[5][5];  
            int num = 1 ;

            for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix[i].length;j++){
                    matrix[i][j]=num;
                    num+=1;
                }
            }

            int m = matrix.length;
            int n = matrix[0].length;
            int top =0;
            int bottom = m-1;
            int left =0;
            int right = n-1;

            //top 
            for(int i = left; i<right; i++){
                System.out.print(matrix[top][i]+ " ");
            }

            //right
            for(int i = top; i<bottom; i++){
                System.out.print(matrix[i][right] + " ");
            }

            //bottom
            for(int i = right; i>left; i--){
                System.out.print(matrix[bottom][i] + " ");
            }

            //left
            for(int i =bottom ; i>top; i--){
                System.out.print(matrix[i][left] + " ");
            }

        }
}
