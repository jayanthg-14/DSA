package twoDArray.EasyProblems;

public class BinarySearch2DMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 4, 7, 9},
            {2, 5, 8, 12},
            {3, 6, 10, 15}
        };
        int target = 10;
        Boolean found = false;

        for(int j = 0; j< matrix.length; j++){
            if(found){
                break;
            }
            if(target<=matrix[j][matrix[j].length-1])
            {
                for(int i = matrix[j].length-1; i>=0; i--){
                    if(matrix[j][i] == target){
                        found = true;
                        break;
                    }
                    else if(matrix[j][i] < target){
                        break;   
                    }
                }
            }
        }
        System.out.println(found);
    }
}
