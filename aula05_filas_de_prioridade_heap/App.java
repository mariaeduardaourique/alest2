package aula05_filas_de_prioridade_heap;

public class App {
    public static void main(String[] args) {
        HeapMax heap = new HeapMax();
        heap.inserir(50);
        System.out.println(heap);
        heap.inserir(30);
        System.out.println(heap);
        heap.inserir(19);
        System.out.println(heap);
        heap.inserir(40);
        System.out.println(heap);
    }
}
