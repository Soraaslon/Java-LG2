import java.util.LinkedList;
import java.util.Queue;

public class Fila_Teste {
  
  public static void main(String[] args) {
    Fila fila = new Fila();
    
    fila.inserir("Arroz");
    
    System.out.println(fila);
    
    fila.inserir("Batata");
    fila.inserir("Bife");
    
    System.out.println(fila);
    
    fila.remover();
    
    System.out.println(fila);
    
    fila.remover();
    System.out.println(fila.vazia());
    
    System.out.println(fila.remover());
    
    System.out.println(fila.vazia());
    System.out.println(fila);
    
    Queue<String> filaJava = new LinkedList<String>();
    filaJava.add("Primeiro");
    System.out.println(filaJava.poll());
    System.out.println(filaJava);
  }
}