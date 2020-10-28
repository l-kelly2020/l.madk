import java.util.Scanner;
 
public class Zadacha1 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Vvedite naturalnoe chislo: ");
		int n = in.nextInt(); // Получение n.
		in.close();
		int p = 1, flag = 1, res = 0;
		for(int i=0;i<10;i++)
		{
			int a=n;
			while(a>0)
			{
				if(i==0 && a%10==0)p*=10;
				if(i>0 && a%10==i && flag==1)
				{
					res+=a%10*p;
					flag=0; 
					a/=10;
				}
					if( i>0 && a%10==i )
					{
						res*=10;
						res+=a%10;
					}
						a/=10;
			}
		}
						n=res;
						System.out.println(res);
	}
}