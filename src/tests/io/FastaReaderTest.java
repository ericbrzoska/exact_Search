package io;

import org.junit.Test;

import static org.junit.Assert.*;

public class FastaReaderTest {

    @Test
    public void getHeader() {
    FastaReader test= new FastaReader("C://Users//ebrzo//IdeaProjects//exact_Search//Data//Bigoof.txt");
    System.out.println(test.getSequence());
    System.out.println(test.getHeader());
    }

    @Test
    public void getSequence() {
    }
}