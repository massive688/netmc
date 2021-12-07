package io.github.yezhihao.netmc.codec;

public class Delimiter {
    public final byte[] value;
    public final boolean strip;

    public Delimiter(byte[] value) {
        this(value, true);
    }

    public Delimiter(byte[] value, boolean strip) {
        this.value = value;
        this.strip = strip;
    }

    public byte[] getValue() {
        return value;
    }

    public boolean isStrip() {
        return strip;
    }
}