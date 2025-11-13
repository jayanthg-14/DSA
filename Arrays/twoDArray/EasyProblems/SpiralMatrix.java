package twoDArray.EasyProblems;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];  
        
        int num=1;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                matrix[i][j]=num;
                num+=1;
            }
        }

        int m = matrix.length;
        int n = matrix[0].length;
        int total = m*n;
        int[] res = new int[total]; 

        int top =0;
        int bottom = m-1;      
        int left =0;
        int right = n-1;
        int ct=0;

        while(ct<m*n){
            //top
            for(int j=left;j<=right && ct<m*n;j++){
                res[ct] = matrix[top][j];
                ct++;
            }
            top++;
            //right            
            for(int i=top;i<=bottom && ct<m*n;i++){
                res[ct] = matrix[i][right];
                ct++;
            }
            right--;

            //bottom
            for(int j=right;j>=left && ct<m*n ;j--){
                res[ct] = matrix[bottom][j];
                ct++;
            }

            bottom--;
            //left
            for(int i=bottom;i>=top && ct<m*n ;i--){
                res[ct] = matrix[i][left];
                ct++;
            }
            left++;
        }
        
        for(int a: res){
            System.out.println(a);
        }
    }
}

