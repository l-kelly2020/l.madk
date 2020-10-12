class Zadacha3
{
public static void main( String[] args ) 
{
	int a = 1;
	int b = 10;
	int h = 1;
	double fx;
	
	
	for (int i = a; i <= b; i += h){
		double x=i;
		fx = (Math.sin(x) - Math.cos(x));
		System.out.println(i + "\t" + fx );
	}
	
};
};
