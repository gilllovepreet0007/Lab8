// QUE 8.1
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Rev {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
		
		BufferedReader br=new BufferedReader(new FileReader("BufferWriterEg.txt"));
		StringBuffer sb=new StringBuffer();
		String line=br.readLine();
		while(line!=null)
		{
			sb.append(line);      //appending each line of file in a buffer
			line=br.readLine();
		}
		
		String revtext=sb.reverse().toString();
		
		BufferedWriter bw=new BufferedWriter(new FileWriter("BufferWriterEg.txt"));
		bw.write(revtext);
		bw.flush();
		bw.close();
		
		br.close();
	}

}
