
public class BOL9_EX1 {
	public static void main(String[] args) {
		Producto p = new Producto("Caja de galletas saladas", 2.35F, 200);
		p.incrementarStock(100);
		p.incrementarStock();
		System.out.println(
				"Actualmente el stock del producto -" + p.getNombre() + "- es de " + p.getUnidades() + " unidades");
		System.out.println(
				"El valor del stock del producto -" + p.getNombre() + "- es de " + p.valorEnStock() + " euros");
		p.disminuirStock(50);
		p.disminuirStock();
		System.out.println(
				"Actualmente el stock del producto -" + p.getNombre() + "- es de " + p.getUnidades() + " unidades");
		System.out.println(
				"El valor del stock del producto -" + p.getNombre() + "- es de " + p.valorEnStock() + " euros");
//para ustedes gg hh pp
	}
}