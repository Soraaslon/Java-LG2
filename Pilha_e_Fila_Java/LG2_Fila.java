import java.util.LinkedList;
import java.util.List;

public class Fila{
  private List<String> cardapio = new LinkedList<String>();
  
  public void inserir (String comida){
    cardapio.add(comida);
  }
  
  public String remover(){
    return cardapio.remove(0);
  }
  
  public boolean vazia(){
    return cardapio.isEmpty();}
  
  @Override
  public String toString(){
    return cardapio.toString();
  }
}