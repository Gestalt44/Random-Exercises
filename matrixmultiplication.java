import java.util.Scanner;

class matrixmul
{
public static void main(String[] s)
{
final int M1,N1,M2,N2;
int i,j,k;
int sum=0;
Scanner num_in=new Scanner(System.in);
System.out.println("Enter the number of rows for the 1st matrix:");
M1=num_in.nextInt();
System.out.println("Enter the number of columns for the 1st matrix:");
N1=num_in.nextInt();
System.out.println("Enter the number of rows of 2nd matrix:");
M2=num_in.nextInt();
System.out.println("Enter the number of columns for 2nd matrix:");
N2=num_in.nextInt();
int [][]matrix1=new int[M1][N1];
int [][]matrix2=new int[M2][N2];
int [][]result=new int[M1][N2];
for(i=0;i<M1;i++)
{
for(j=0;j<N1;j++)
{
System.out.println("Enter elements for 1st matrix");
matrix1[i][j]=num_in.nextInt();
}
}
for(i=0;i<M2;i++)
{
for(j=0;j<N2;j++)
{
System.out.println("Enter elements for 2nd matrix");
matrix2[i][j]=num_in.nextInt();
}
}
for(i=0;i<M1;i++)
  {
    for(j=0;j<N2;j++)
      { sum=0;
        for(k=0;k<M2;k++)
            {
               sum=sum+matrix1[i][k]*matrix2[k][j];
            }
        result[i][j]=sum;
      }
  }

for(i=0;i<M1;i++)
{
for(j=0;j<N2;j++)
{
System.out.print(result[i][j]+" ");
}
System.out.println();
}
}
} 