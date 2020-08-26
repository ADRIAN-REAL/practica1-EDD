import java.util.Scanner;
public class vector {
    public static void main(String[]args)
    {
        int arr[]=new int [10];
        int sumaPositivos=0,sumaNegativos=0;
        int contPos=0;
        int contNeg=0;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese 10 numeros: ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=teclado.nextInt();
            if (arr[i]>0)
            {
                sumaPositivos=sumaPositivos+arr[i];
                contPos++;
            }
            else
            {
                sumaNegativos=sumaNegativos+arr[i];
                contNeg++;
            }
        }
        System.out.println("el prometio de los numeros positivos es:"+sumaPositivos/contPos);
        System.out.println("el prometio de los numeros positivos es:"+sumaNegativos/contNeg);
        System.out.println("Cantidad de numeros positivos es:"+contPos);
        System.out.println("Cantidad de numeros negativos es:"+contNeg);

    }

}
