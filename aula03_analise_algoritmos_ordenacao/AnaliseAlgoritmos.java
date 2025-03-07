package aula03_analise_algoritmos_ordenacao;

import utils.ArrayUtils;

public class AnaliseAlgoritmos {
    public static void main(String[] args) {
        for (int n = 100; n <= 50_000; n+=1_000) {
            int[] a = new int[n];
            ArrayUtils.preencherArrayComValoresInteirosAleatorios(a, 100_000, false);

            int[] aBubble = new int[n];
            ArrayUtils.clonarArray(a, aBubble);
            BubbleSort bs = new BubbleSort();
            bs.ordenar(aBubble);
            System.out.println(n + "," + bs.getOperacoes());

            // int[] aInsertion = new int[n];
            // ArrayUtils.clonarArray(a, aInsertion);
            // InsertionSort is = new InsertionSort();
            // is.ordenar(aInsertion);
            // System.out.println(n + "," + is.getOperacoes());

            // int[] aMerge = new int[n];
            // ArrayUtils.clonarArray(a, aMerge);
            // MergeSort ms = new MergeSort();
            // ms.ordenar(aMerge);
            // System.out.println(n + "," + ms.getOperacoes());

            // int[] aQuick = new int[n];
            // ArrayUtils.clonarArray(a, aQuick);
            // QuickSort qs = new QuickSort();
            // qs.ordenar(aQuick);
            // System.out.println(n + "," + qs.getOperacoes());
        }
    }
}

      