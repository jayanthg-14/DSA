package twoDArray.EasyProblems;

public class SnakeMatrix {
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

            int top = 0;
            int bottom = m-1;      
            int left =0;
            int right = n-1;

            while(top<=bottom){
                if(top%2 == 0){
                    for(int i =left; i<=right; i++){
                        System.out.print(matrix[top][i]+" ");
                    }
                }
                else{
                    for(int j =right; j>=left; j--){
                        System.out.print(matrix[top][j]+" ");
                    }
                }
                top++;
                System.out.println();
            }
        }

}
