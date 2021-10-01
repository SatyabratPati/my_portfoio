package myCaptain;

public class MatrixAddMul {
    public static void add(int[][]m, int[][]n){
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(m[i][j] + n[i][j] + " ");
            }
        }
    }

    public static void mul(int[][]m,int[][]n){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++)
            {
                int t=0;
                for(int k=0;k<3;k++) {
                    t+=m[i][k]*n[k][j];
                }
                System.out.print(t + " ");
            }
        }
    }


    public static void main(String[] args){
        int[][] a={{1,3,4},{2,4,3},{3,4,5}};
        int[][] b={{1,3,4},{2,4,3},{1,2,4}};
        System.out.println("The addition of matrices is: ");
        add(a,b);
        System.out.println("The multiplication of matrices is: ");
        mul(a,b);
    }
}
