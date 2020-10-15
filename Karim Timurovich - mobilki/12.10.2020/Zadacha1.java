class Zadacha1
{
public static void main( String[] args ) 
{
int n = 2, k = 3, m = 9;
double a = Math.pow(n, k);
while (a != 0.0){
if (a % 10 == m){
System.out.println("Yes");
return;
}
a /= 10;
}
System.out.println("No");
}
}