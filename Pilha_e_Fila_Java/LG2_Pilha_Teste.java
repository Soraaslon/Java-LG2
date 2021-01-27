import java.util.Stack;

public class Pilha_Teste {
  public static void main(String[] args) {
    Pilha pilha = new Pilha();
    
    pilha.inserir("Arroz");
    
    System.out.println(pilha);
    
    pilha.inserir("Batata");
    pilha.inserir("Bife");
    
    System.out.println(pilha);
    
    pilha.remover();
    
    System.out.println(pilha);
    
    pilha.remover();
    System.out.println(pilha.vazia());
    
    System.out.println(pilha.remover());
    
    System.out.println(pilha.vazia());
    System.out.println(pilha);
    
    Stack<String> pilhaJava = new Stack<String>();
    pilhaJava.push("Primeiro");
    System.out.println(pilhaJava.peek());
    System.out.println(pilhaJava.pop());
    System.out.println(pilhaJava);
  }
}