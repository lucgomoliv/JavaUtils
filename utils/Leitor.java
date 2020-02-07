package utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Leitor {
    BufferedReader br;

    public Leitor() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    public int lerInt() throws NumberFormatException, IOException {
        return Integer.parseInt(br.readLine());
    }

    public double lerDouble() throws NumberFormatException, IOException {
        return Double.parseDouble(br.readLine());
    }

    public String lerString() throws NumberFormatException, IOException {
        return br.readLine();
    }

    public char lerChar() throws IOException {
        return br.readLine().charAt(0);
    }

    public short lerShort() throws NumberFormatException, IOException {
        return Short.parseShort(br.readLine());
    }

    public long lerLong() throws NumberFormatException, IOException {
        return Long.parseLong(br.readLine());
    }

    public float lerFloat() throws NumberFormatException, IOException {
        return Float.parseFloat(br.readLine());
    }

    public boolean lerBoolean() throws IOException {
        return Boolean.parseBoolean(br.readLine());
    }
}