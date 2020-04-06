package sequences;

import java.util.Optional;

public class NucleotideSequence extends Exceptions implements Sequence {    //accepts RNA and DNA

    private String name;
    private String sequence;
    private String alphabet;
    public NucleotideSequence(String name, String sequence){
        super();
        this.name=name;
        this.sequence=sequence.toUpperCase();
        alphabet="ATUGC";
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
    public int indexOf(char c) {    //TODO Fehler muss in den Algorithmen abgefangen werden. hier dank verplichteten return nicht möglich (-1 wenn Alphabetfremdes Zeichen)
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
