package sequences;

public interface Sequence {
    public String getSequence();
    public String getName();
    public char charAt(int a);
    /**
     * gibt Stelle des Zeichens im Alphabet aus
     * @param c
     * @return
     */
    public int indexOf(char c);
    public int alphabetSize();
    public String getAlphabetString();
}
