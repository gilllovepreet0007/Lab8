import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NumEven {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new FileReader("numbers.txt"));
		String line=br.readLine();
		String evennum[]=line.split(",");
		for(int i=0;i<evennum.length;i++) {
			int num=Integer.parseInt(evennum[i]);
			
			if(num%2==0)
			{
				System.out.println(num);
			}
		}

	}

}
