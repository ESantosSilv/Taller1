/*
 * Pairs and inpairs
 */

package taller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 *
 * @author NicolasS
 */
public class Taller {

    static BufferedWriter bw = new BufferedWriter (new OutputStreamWriter ( System.out ) );
	static BufferedReader br = new BufferedReader (new InputStreamReader ( System.in ) );
	
	public static void main(String[] args) throws IOException {
		
		//read the size of the array
		int size = 0;
		bw.write("Ingrese la cantidad de numeros a digitalizar\n");
		bw.flush();
		size = Integer.parseInt(br.readLine()); // read numbers
		int [] board = new int [size]; // create an array
		//The user fills the array
		for (int i = 0 ; i < size ; i++)
		{	
                    //Ask for a random numbers
			bw.write("ingrese el numero de la posicion " + (i+1) +"\n");
			bw.flush();
			board[i] =Integer.parseInt(br.readLine());
		}
		//Ask for a random number
		bw.write("Ingrese cual desea que sea la diferencia\n");
		bw.flush();
		int diferent = Integer.parseInt(br.readLine());
                //Give counter a value
		int counter = 0;
                //for cycle as a condition
		for (int i = 0; i < size ; i++)
		{
                    //for cycle as a condition
			for (int j = 0; j < size ; j++)
			{
                            //if as a condition
				if (board[i] - diferent == board[j] ||board[i] + diferent == board[j])
				{
					counter += 1;
					bw.write("\n("+board [i]+","+board[j]+")\n"
							+ counter);
					bw.flush();
				}
                                //print array
				bw.write("\n>>>>("+board [i]+","+board[j]+")\n"
						+ "i="+i+"j="+j);
				bw.flush();
			}
		}
                //last values
		bw.write(counter);
		bw.flush();
	}
}
