import java.io.PrintWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.BufferedReader;
import java.util.StringTokenizer;
//import java.math.BigInteger;

class MUL {
	InputScanner i_scan;
	OutputWriter o_write;
	Boolean Is_Debug = false;
	long start_time = 0;
	long end_time = 0;
	long x,y,prod;
	
	public static void main(String[] args) {
		MUL program = new MUL(args);
		program.start();
		program.end();
	}

	private MUL(String[] args) {
		if(Is_Debug){
			start_time = System.currentTimeMillis();
		}
		i_scan = new InputScanner(System.in);
		o_write = new OutputWriter(System.out);
}

	public void start() {
		int total = i_scan.nextInt();
		for( int n = 0; n < total; n++){
			//x  y => x*y = result
			x = i_scan.nextLong();
			
			y = i_scan.nextLong();
			
			
			o_write.printLine(x * y);
			
		}
	}

	public void end() {
		if(Is_Debug){
			end_time = System.currentTimeMillis();
			o_write.print("Time elapsed(millis) :"+ (end_time-start_time));
		}
		o_write.close();
	}
}
class InputScanner {
	StringTokenizer tokenizer;
	private BufferedReader br;

	public InputScanner(InputStream stream) {
		br = new BufferedReader(new InputStreamReader(stream));
	}

	public String next() {
		while( tokenizer == null || !tokenizer.hasMoreTokens()) {
			try{
			tokenizer = new StringTokenizer(br.readLine());
			}
			catch(Exception e){ // for catching the numberformatexception IOException is changed to Exception
				throw new RuntimeException(e);
				//return  "Exception";
			}
		}
		return tokenizer.nextToken();
	}

	public int nextInt() {
		int n;
		try{
			n = Integer.parseInt(next());
		}
		catch (NumberFormatException e) {
                throw new RuntimeException(e);
            }
		return n;
	}

	public long nextLong() {
		long n;
		try{
			n = Long.parseLong(next());
		}
		catch (NumberFormatException e) {
                throw new RuntimeException(e);
            }
		return n;
	}
/*
	public BigInteger nextBigInteger() {
		BigInteger bi;
		try{
			bi = new BigInteger(nextLong());
		}
		catch (NumberFormatException e) {
                throw new RuntimeException(e);
            }
		return bi;
	}
	*/
}

class OutputWriter {
	private PrintWriter pw;

	public OutputWriter(OutputStream stream) {
		pw = new PrintWriter(stream);
	}

	public void print(Object... objects) {
		for (int i = 0; i < objects.length; i++) {
			if (i != 0)
				pw.print(' ');
			pw.print(objects[i]);
		}
	}

	public void printLine(Object... objects) {
		print(objects);
		pw.println();
	}

	public void close() {
            pw.close();
    }
}
