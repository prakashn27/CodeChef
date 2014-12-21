import java.io.PrintWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.BufferedReader;
import java.util.StringTokenizer;

class ABSYS { 
	InputScanner i_scan;
	OutputWriter o_write;
	Boolean Is_Debug = false;
	long start_time = 0;
	long end_time = 0;
	String x,y,sum;
	int numx,numy,numsum;
	
	public static void main(String[] args) {
		ABSYS program = new ABSYS(args);
		program.start();
		program.end();
	}

	private ABSYS(String[] args) {
		if(Is_Debug){
			start_time = System.currentTimeMillis();
		}
		i_scan = new InputScanner(System.in);
		o_write = new OutputWriter(System.out);
}

	public void start() {
		int total = i_scan.nextInt();
		for( int n = 0; n < total; n++){
			//x + y = z
			x = i_scan.next();
			i_scan.next(); //neglect the + sign
			y = i_scan.next();
			i_scan.next(); //neglect the = sign
			sum = i_scan.next();
			
			//o_write.printLine(x +"  "+ y+"  " + sum);
			if(x.contains("machula")) {
				numy = Integer.parseInt(y);
				numsum = Integer.parseInt(sum);
				numx = numsum - numy;
				o_write.printLine(numx + " + " + numy + " = " + numsum);
			}
			else if(y.contains("machula")) {
				numx = Integer.parseInt(x);
				numsum = Integer.parseInt(sum);
				numy = numsum - numx;
				o_write.printLine(numx + " + " + numy + " = " + numsum);
			}
			else  {
				numx = Integer.parseInt(x);
				numy = Integer.parseInt(y);
				numsum = numx + numy;
				o_write.printLine(numx + " + " + numy + " = " + numsum);
			}
			/*else {
				o_write.printLine(x + " + " + y + " = " + sum);
			}
			*/
			
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
