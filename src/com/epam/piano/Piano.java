package com.epam.piano;

/**
 * Created by Чонторог on 08.11.2015.
 */
public class Piano {
    private PianoKey[] pianoKeys;

    public Piano(int keysCount){
        this.pianoKeys = new PianoKey[keysCount];
        for (int i = 0; i < keysCount; i++) {
            this.pianoKeys[i] = new PianoKey(i, "Key" + i);
        }
    }

    public void playPiano(int[] keyOrder){
        for (int i = 0; i < keyOrder.length; i++) {
            playPiano(keyOrder[i]);
        }
    }

    public void playPiano(int keyId) {
        String value = "Key is not presented in piano";
        if (keyId < pianoKeys.length) {
            value = pianoKeys[keyId].pressKey();
        }
        System.out.println(value);
    }

    public void tunePiano(int keyId, String value){

        if (keyId < pianoKeys.length) {
            pianoKeys[keyId].setKeyValue(value);
        }
        else {
            System.out.println("Key is not presented in piano");
        }

    }

}
