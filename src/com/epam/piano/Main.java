package com.epam.piano;

public class Main {

    public static void main(String[] args) {

        Piano littlePiano = new Piano(3);
        littlePiano.playPiano(new int[] {1,2,3,4,5,0});
        littlePiano.tunePiano(0, "a");
        littlePiano.playPiano(0);
    }
}
