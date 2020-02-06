package Exs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Leitor {
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
}