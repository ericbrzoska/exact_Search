package io;

import org.junit.Test;

import java.io.FileWriter;

import static org.junit.Assert.*;

public class FastaWriterTest {

    @Test
    public void generellTest(){
        FastaWriter fr= new FastaWriter("header1","String2", "Result","C://Users//ebrzo//IdeaProjects//exact_Search//Data//Bigoof");
    }
}