package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {
		
		OutputStream fos = new FileOutputStream("lorem2.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		bw.newLine();
		bw.write("tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,");
		bw.newLine();
		bw.write("quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo");
		bw.newLine();
		bw.write("consequat. Duis aute irure dolor in reprehenderit in voluptate velit");
		bw.newLine();
		bw.write("esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat");
		bw.newLine();
		bw.write("cupidatat non proident, sunt in culpa qui officia deserunt mollit anim");
		bw.newLine();
		bw.write("id est laborum.");
		
		bw.close();

	}

}
