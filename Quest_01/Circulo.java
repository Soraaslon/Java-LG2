
public class Circulo {
	private double raio;
	
	public Circulo(double raio) {
		this.raio = raio;}
	
	public double Perimetro(){
	return ((2*Math.PI)*raio);}
	
	public double Area() {
		return (Math.PI*(Math.pow(raio, 2)));}

	public double getRaio() {
		return raio;}
	
	public void setRaio(double raio){
		this.raio = raio;}
	
}