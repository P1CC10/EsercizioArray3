import java.util.HashSet;

public class Main {
    public static void main(String[]args){
        int[]array={1,3,12,24,3,1};

        for(int element:rimuoviDuplicati(array));
        System.out.println("elementi"+rimuoviDuplicati(array));
    }
    public static HashSet<Integer>rimuoviDuplicati(int[]array){
        HashSet<Integer> duplicati= new HashSet<Integer>();
        duplicati.add(1);
        duplicati.add(3);
        duplicati.add(12);
        duplicati.add(24);
        duplicati.add(3);
        duplicati.add(1);

      return duplicati;
    }
}

