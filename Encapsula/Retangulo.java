
public class Retangulo {
	
	private int base;
	private int lado;
	
	public Retangulo(int base, int lado){
		this.base = base;
		this.lado = lado;
	}
	public int getArea(){
		return base*lado;
	}
	
	public int getPerimetro() {
		return ((base*2)+(lado*2));
	}
	
	public int getBase() {
		return base;
	}
	public void setBase(int base){
		this.base = base;
	}
	public int getLado() {
		return lado;
	}
	public void setLado(int lado){
		this.lado = lado;
	}
}
