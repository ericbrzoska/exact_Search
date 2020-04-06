package sequences;

public class AminoacidSequence extends Exceptions implements Sequence{
    private String sequence;
    private String name;
    private String alphabet;
    public AminoacidSequence(String name, String seq) {
    super();
    this.sequence=seq.toUpperCase();
    this.name=name;
    alphabet="ARNDCQEGHILKMFPSTWYV";
    }

    @Override
    public String getSequence() {
        return sequence;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public char charAt(int a) {
        return sequence.charAt(a);
    }

    @Override
    public int indexOf(char c) {
        return alphabet.indexOf(Character.toString(c));
    }

    @Override
    public int alphabetSize() {
        return alphabet.length();
    }

    @Override
    public String getAlphabetString() {
        return alphabet;
    }
}
