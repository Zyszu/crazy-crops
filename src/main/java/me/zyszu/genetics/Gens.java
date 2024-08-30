package me.zyszu.genetics;

public class Gens {
    public static enum GEN_TYPE {
        A, B, C, D, E, F, G, H
    }

    public static GEN_TYPE intToGEN_TYPE(int n) {
        return GEN_TYPE.values()[n];
    }

    public static String GEN_TYPEToString(GEN_TYPE g) {
        return switch (g) {
            case A -> "A";
            case B -> "B";
            case C -> "C";
            case D -> "D";
            case E -> "E";
            case F -> "F";
            case G -> "G";
            case H -> "H";
        };
    }
}
