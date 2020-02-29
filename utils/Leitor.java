package utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Leitor {
    BufferedReader br;

    public Leitor() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    /// Lê um número inteiro
    public int lerInt() throws NumberFormatException, IOException {
        return Integer.parseInt(br.readLine());
    }

    /// Lê um número double
    public double lerDouble() throws NumberFormatException, IOException {
        return Double.parseDouble(br.readLine());
    }

    /// Lê uma string
    public String lerString() throws NumberFormatException, IOException {
        return br.readLine();
    }

    /// Lê um caracter
    public char lerChar() throws IOException {
        return br.readLine().charAt(0);
    }

    /// Lê um número short
    public short lerShort() throws NumberFormatException, IOException {
        return Short.parseShort(br.readLine());
    }

    /// Lê um número long
    public long lerLong() throws NumberFormatException, IOException {
        return Long.parseLong(br.readLine());
    }

    /// Lê um número float
    public float lerFloat() throws NumberFormatException, IOException {
        return Float.parseFloat(br.readLine());
    }

    /// Lê um booleano
    public boolean lerBoolean() throws IOException {
        return Boolean.parseBoolean(br.readLine());
    }
}