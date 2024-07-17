package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    
    private List<Integer> numeroList;
    
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public OrdenacaoNumeros() {
        this.numeroList = new ArrayList();
    }

    public void adicionarNumero(int numero) {
        this.numeroList.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> numeros = new ArrayList<>(numeroList);
        Collections.sort(numeros);
        return numeros;
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> numeros = new ArrayList<>(numeroList);
        numeros.sort(Collections.reverseOrder());
        return numeros;
    }

    public static void main(String[] args) {
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        numeros.adicionarNumero(22);
        numeros.adicionarNumero(13);
        numeros.adicionarNumero(17);
        numeros.adicionarNumero(51);

        System.out.println(numeros.ordenarAscendente());
        System.out.println(numeros.ordenarDescendente());
    }
    
}
