
public class Arvore_Teste {
	public static void main(String[] args) {
		Arvore<Integer> arvore = new Arvore<Integer>();
		arvore.adicionar(12);
		arvore.adicionar(7);
		arvore.adicionar(3);
		arvore.adicionar(7);
		arvore.adicionar(1);
		arvore.adicionar(72);
		
		System.out.println("\n\n Em Ordem:");
		arvore.emOrdem(arvore.getRaiz());
		
		System.out.println("\n\n Pós Ordem:");
		arvore.posOrdem(arvore.getRaiz());
		
		System.out.println("\n\n Pré Ordem:");
		arvore.preOrdem(arvore.getRaiz());
	}
}
