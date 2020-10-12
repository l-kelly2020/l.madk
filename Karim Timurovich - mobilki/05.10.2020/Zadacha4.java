class Zadacha4
{
public static void main(String[]args)
{
double e = 2.71;
double a = 0;
double buf = 0;
for(int i = 1; buf <= e ;i++)
{
	a = ((Math.pow(-1, i)) / (Math.pow(2, i)));
	buf = Math.abs(a);
System.out.println("a["+i+"]= "+ a);
if (buf == 0.0)
{
	System.out.println("First MIN number: "+i+" with "+buf);
	break;
}

}
}
}