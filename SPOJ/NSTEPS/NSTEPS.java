import java.io.PrintWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.BufferedReader;
import java.util.StringTokenizer;

class NSTEPS {
	InputScanner i_scan;
	OutputWriter o_write;
	Boolean is_debug = false;

	public static void main(String[] args) {
		NSTEPS program = new NSTEPS(args);
		program.start();
		program.stop();
	}

	private void stop() {
		o_write.close();
	}

	private void start() {
		int total = i_scan.nextInt();
		//o_write.printLine("total="+total);
		for (int z = 0; z < total; z++) {
			int x = i_scan.nextInt();
			int y = i_scan.nextInt();
			//o_write.printLine("x ="+x+";y="+y);
			if (x % 2 == 0) { // even
				if (y == x)
					o_write.printLine(x * 2);
				else if (y == x - 2)
					o_write.printLine(x * 2 - 2);
				else
					o_write.printLine("No Number");
			} else { // odd
				if (y == x)
					o_write.printLine(x * 2 - 1);
				else if (y == x - 2)
					o_write.printLine(x * 2 - 3);
				else
					o_write.printLine("No Number");
			}
		}

	}

	private NSTEPS(String[] args) {
		// code for handling the args can be written here
		i_scan = new InputScanner(System.in);

		o_write = new OutputWriter(System.out);
	}

}

class InputScanner {
	private final BufferedReader br;
	// can be used to seperate tokens instead of String.split("\\s+")
	StringTokenizer tokenizer;

	public InputScanner(InputStream stream) {
		br = new BufferedReader(new InputStreamReader(stream));
	}

	// for calling the next token in the string
	public String next() {
		if (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				tokenizer = new StringTokenizer(br.readLine());
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken();
	}

	// next methodis called and the input is parsed
	public int nextInt() {
		int n = Integer.parseInt(next());
		return n;
	}

}

class OutputWriter {
	private final PrintWriter pw;

	// seperate constructor can be used for file formating also
	public OutputWriter(OutputStream stream) {
		pw = new PrintWriter(stream);
	}

	// can be used for any objects and it iterates through it for printing
	public void print(Object... objects) {
		for (int i = 0; i < objects.length; i++) {
			if (i != 0)
				pw.print(' ');
			pw.print(objects[i]);
		}
	}

	// adds a new line after calling the print method
	public void printLine(Object... objects) {
		print(objects);
		pw.println();
	}

	// closing the PrintWriter
	public void close() {
		pw.close();
	}
}
