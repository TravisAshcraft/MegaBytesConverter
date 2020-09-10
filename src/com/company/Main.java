package com.company;

public class Main {

    public static void main(String[] args) {
	printMegaBytesAndKiloBytes(2500);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        int megaBytes;
        int KB = 1024;

        megaBytes = kiloBytes / KB;
        int kiloByte = kiloBytes % KB;

        if (kiloBytes < 0 ){
            System.out.println("Invalid Value");
        }
        else{
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + kiloByte + " KB");
        }
    }
}
