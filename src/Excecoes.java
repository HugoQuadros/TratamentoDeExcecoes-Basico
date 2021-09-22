import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Excecoes {

    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();
        //List<String> lista = null;

        try{
            lista.add("Pato");
            lista.add("Cachorro");
            lista.add("Gato");
            System.out.println("Animal: " + lista.get(3));

        } catch(NullPointerException e){
            System.err.println("Elemento nulo");
        } catch(IndexOutOfBoundsException e){
            System.err.println("IndexOutOfBoundsException: " + e.getMessage());
        }

    }

}
