package sequences;

public class AsciiSequence extends Exceptions implements Sequence  {

    private String sequence;
    private String name;
    private String alphabet;

    public AsciiSequence(String name, String sequence) {
        super();
        StringBuilder strbui = new StringBuilder("");
        for (int i = 33; i <= 126; i++) {
            strbui.append((char) i);
        }
        alphabet = strbui.toString();
        this.name=  name;
        this.sequence=sequence;

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
