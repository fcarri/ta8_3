package project8;

interface table{
	public double carga = 5;
}

public class Electrodomestico {
	
	protected double precioBase_Eu;
	protected Color color;
	protected CEnerg consumoE;
	protected double peso_Kg;
	
	enum Color {blanco, negro, rojo, azul, gris;};
	
	enum CEnerg {A, B, C, D, E, F;};
		
	public Electrodomestico() {
		this.precioBase_Eu = 100.00;
        this.color = Color.blanco;
        this.consumoE = CEnerg.F;
        this.peso_Kg = 5.00;
	}
	
	public Electrodomestico(double precio, double peso) {
		this.precioBase_Eu = precio;   
		this.color = Color.blanco;
        this.consumoE = CEnerg.F;
        this.peso_Kg = peso;
	}
	
	public Electrodomestico(double precio, String color, String consumo, double peso) {
		this.precioBase_Eu = precio;
        this.color = Color.valueOf(color);
        this.consumoE = CEnerg.valueOf(consumo);
        this.peso_Kg = peso;
	}
	

}

