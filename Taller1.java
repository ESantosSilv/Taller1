/*
 * Array
 */

package Taller1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 *
 * @author NicolasS
 */
public class Taller1 {
  static BufferedWriter bw = new BufferedWriter (new OutputStreamWriter (System.out));
	static BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
	
	public static void main (String []args) throws IOException
	{
            //Define the type of variables
		int size = 0 ;		
		bw.write("Bienvenido\n"
				+ "Este programa se encargara de multiplicar un arreglo del tamaño\n"
				+ "que el usuario desee con los numeros que ingrese por consola\n"
				+ "\nIngrese el tamaño del arreglo\n");
		bw.flush();
		size = Integer.parseInt(br.readLine());
                //variables
		int [] board = new int [size], result = new int [size];
                //for cycle as a condition
		for (int i = 0; i < size ; i++ )
		{
			bw.write("ingrese el numero de la posicion "+(i+1)+"\n" );
			bw.flush();
			board[i] = Integer.parseInt(br.readLine());
		}
                //for cycle as a condition
		for (int i = 0; i < size ; i++)
		{
                    //for cycle as a condition
			for (int j = 0; j < size ; j++)
			{
                            //if as a condition
				if (i != j)
				{
                                    //Print the last values
					board[i] *= board[j];
                                        //Print array
					bw.write("\n"+i+"   "+j+"\n"+board[i]+"  "+board[j]+"\n");
					bw.flush();
				}
			}
		}
	}
}

