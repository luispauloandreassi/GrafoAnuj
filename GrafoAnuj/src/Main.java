import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Hashtable<String, ArrayList<String>> hashtable = new Hashtable<String, ArrayList<String>>();

        ArrayList<String> listaContatosLuis = new ArrayList<String>();
        listaContatosLuis.add("Bob");
        listaContatosLuis.add("Alice");
        listaContatosLuis.add("Claire");
        hashtable.put("Luis", listaContatosLuis);

        ArrayList<String> listaContatosAlice = new ArrayList<String>();
        listaContatosAlice.add("Peggy");
        hashtable.put("Alice", listaContatosAlice);

        ArrayList<String> listaContatosBob = new ArrayList<String>();
        listaContatosBob.add("Anuj");
        hashtable.put("Bob", listaContatosBob);

        ArrayList<String> listaContatosClaire = new ArrayList<String>();
        listaContatosClaire.add("Thon");
        listaContatosClaire.add("Jonny");
        hashtable.put("Claire", listaContatosClaire);

        //MOSTRANDO NA TELA
        System.out.println("CHAVE           ".substring(0, 10) + "  |      VALOR");
        System.out.println("________________".substring(0, 10) + "____________________________________________");
        for (Map.Entry<String, ArrayList<String>> entidade : hashtable.entrySet()) {
            String chave = entidade.getKey();
            ArrayList<String> valor = entidade.getValue();

            System.out.println((chave + "         ").substring(0, 11) + " |     " + valor);
        }
        System.out.println("______________________________________________________");
    }

}
