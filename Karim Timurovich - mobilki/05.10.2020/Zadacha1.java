class Zadacha1
{
public static void main( String[] args ) 
{
int b,k,t;
for (b = 0; b <= (100/10); b++)
{
for (k = 0; k <= ((100 - b * 10) / 5); k++)
{
t = (100 - b * 10 - k * 5) * 2;
if ((b + k + t) == 100 && (b * 10 + k * 5 + t*0.5) == 100)
{
System.out.println( "Bikov: " + b );
System.out.println( "Korov: " + k );
System.out.println( "Korov: " + t );

    };
    };
}	
}
}