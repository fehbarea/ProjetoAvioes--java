//Felipe Alves Barea RA: 2454343
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Leitura{

	public String entDados(String rotulo){

		System.out.println(rotulo);
		String resp = "";
		
		InputStreamReader tec = new InputStreamReader(System.in);
		BufferedReader buff = new BufferedReader(tec);

		try{
			
			resp = buff.readLine();
		}

		catch(IOException ioe){

			System.out.println("erro");
			
		}
		return resp;
	}

}
