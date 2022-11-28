class First40
{
	public static void main(String ar[])
	{
		int[][] num=new int[4][4];
		int[][] num1=new int[4][];
		int i,j,c=1;
		for(i=0;i<num.length;i++)
		{
			for(j=0;j<num[i].length;j++)
			{ 
				num[i][j]=c;
				c=c+1;
			}
		}
		for(i=0;i<num.length;i++)
		{
			for(j=0;j<num[i].length;j++)
			{ 
				System.out.print(num[i][j]+" ");
			}
			System.out.println(" ");
		}
		for(i=0;i<=3;i++)
		{
			num1[i]=new int[i+1];
		}
		int a=1;
		for(i=0;i<num.length;i++)
		{
			for(j=0;j<a+i;j++)
			{ 
				num1[i][j]=num[i][j];
			}
		
		}a=1;
		for(i=0;i<num.length;i++)
		{
			for(j=0;j<a+i;j++)
			{ 
				System.out.print(num1[i][j]+" ");
					}
			System.out.println(" ");
			
		}
	}
}