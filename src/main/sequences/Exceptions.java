package sequences;

public abstract class Exceptions {  //todo in sequenceklassen nicht anwendbar, muss verschoben werden

    public Exceptions(){

    }
    public void wrong_alphabet(){
        System.out.println("The chosen sequence type does not match to the Fastadocument");
        //Todo Programmneustart mit main-Aufruf
    }
}
