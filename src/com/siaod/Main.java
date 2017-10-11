package com.siaod;

import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    private void inOut(Scanner in, PrintStream out) {
        while (in.hasNext()) {
            out.println(in.next());
        }
    }
    public static void main(String[] args) throws IOException {
       Scanner in = new Scanner(System.in);
       PrintStream out = System.out;
    }
}
