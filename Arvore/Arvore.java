
public class Arvore<nodo extends Comparable> {
	private Elemento<nodo> raiz;
	
	public Arvore(){
		this.raiz=null;
	}
	
	public void adicionar(nodo valor){
		Elemento<nodo> novoElemento = new Elemento<nodo>(valor);
		if(raiz == null) {
			raiz=novoElemento;
		} else {
			Elemento<nodo> atual = this.raiz;
			while(true) {
				if(novoElemento.getValor().compareTo(atual.getValor()) == -1) {
					if(atual.getEsquerda() != null) {
						atual = atual.getEsquerda();}
					else {
						atual.setEsquerda(novoElemento);
						break;
					}}
					else {
						if (atual.getDireita()!=null) {
							atual = atual.getDireita();
							}else {
								atual.setDireita(novoElemento);
								break;
							}
					}
			}
		}
		
	}

	public Elemento<nodo> getRaiz() {
		return raiz;
	}
	
	public void emOrdem(Elemento<nodo>atual) {
		if(atual != null) {
			emOrdem(atual.getEsquerda());
			System.out.println(atual.getValor());
			emOrdem(atual.getDireita());
		}
	}
	
	public void preOrdem(Elemento<nodo>atual) {
		if(atual != null) {
			System.out.println(atual.getValor());
			preOrdem(atual.getEsquerda());
			preOrdem(atual.getDireita());
		}
	}
	
	public void posOrdem(Elemento<nodo>atual) {
		if(atual != null) {
			posOrdem(atual.getEsquerda());
			posOrdem(atual.getDireita());
			System.out.println(atual.getValor());
		}
	}
}
