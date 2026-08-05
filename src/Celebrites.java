import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.*;

public class Celebrites {

    protected static List [][] personnes;
    protected static List [] invites;
    protected static List [] celebrites;

    public static void initpersonnes(){
        personnes = new List[][] {
                {Arrays.asList("1. Albert"),Arrays.asList(2, 5, 6)},
                {Arrays.asList("2. Bénédicte"),Arrays.asList(3, 5, 6)},
                {Arrays.asList("3. Christophe"),Arrays.asList(2, 4, 5, 6)},
                {Arrays.asList("4. Delphine"),Arrays.asList(1, 2, 5, 6, 8)},
                {Arrays.asList("5. Edouard"),Arrays.asList(6)},
                {Arrays.asList("6. Françoise"),Arrays.asList(5)},
                {Arrays.asList("7. Gaston"),Arrays.asList(2, 3, 5, 6, 8)},
                {Arrays.asList("8. Heloise"),Arrays.asList(2, 4, 5, 6, 7)},
        };
    }


    public static void main(String[] args) {
    }
}
