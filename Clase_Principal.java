//Pedro Antonio Nava Hernández Programación Avanzada
package Codigodos;

 class Clase_Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Serie Fibonacci");

int x=0;
while (x!=10) {
	System.out.println(fibonacci(x));
	x++;
}
	}
public static int fibonacci(int N) {
	if(N==0 || N==1) {
	return 1;	
	}
	else {
	return fibonacci(N-1)+fibonacci(N-2);	
	}
}
}
