import java.util.Scanner;
import matrixops.matrix;

class matrixmul
{
public static void main(String[] s)
{
int i,j,k;
int sum=0;
matrix matrix1=new matrix();
matrix1.input();
matrix matrix2=new matrix();
matrix2.input();
int ROW1=matrix1.getRow();
int COL1=matrix1.getCol();
int ROW2=matrix2.getRow();
int COL2=matrix2.getCol();
matrix result=new matrix(ROW1,COL2);

for(i=0;i<ROW1;i++)
  {
    for(j=0;j<COL2;j++)
      { sum=0;
        for(k=0;k<ROW2;k++)
            {
               sum=sum+matrix1.getElement(i,k)*matrix2.getElement(k,j);
            }
        result.setElement(sum,i,j);
      }
  }
result.output();
}
} 