package com.epam.piano;

/**
 * Created by Чонторог on 09.11.2015.
 */
public class PianoKey {

    private int keyId;
    private String keyValue;

    public PianoKey(int id, String value){
        this.keyId = id;
        setKeyValue(value);
    }

    public void setKeyValue(String value){
        this.keyValue = value;
    }

    public String pressKey(){
        return keyValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PianoKey pianoKey = (PianoKey) o;

        return hashCode() == pianoKey.hashCode();
    }

    @Override
    public int hashCode() {
        return keyId;
    }

    @Override
    public String toString() {
        return keyValue;
    }
}
