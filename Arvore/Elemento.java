
public class Elemento<nodo> {
	private nodo valor;
	private Elemento<nodo> esquerda;
	private Elemento<nodo> direita;
	
	public Elemento(nodo valor){
		this.valor=valor;
		this.esquerda=null;
		this.direita=null;
	}

	public nodo getValor() {
		return valor;
	}

	public void setValor(nodo valor) {
		this.valor = valor;
	}

	public Elemento<nodo> getEsquerda() {
		return esquerda;
	}

	public void setEsquerda(Elemento<nodo> esquerda) {
		this.esquerda = esquerda;
	}

	public Elemento<nodo> getDireita() {
		return direita;
	}

	public void setDireita(Elemento<nodo> direita) {
		this.direita = direita;
	}
	
	
	
	
}
