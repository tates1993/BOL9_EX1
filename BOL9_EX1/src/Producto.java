public class Producto{
		private final int PRECIO_MAXIMO=1000000;
		private String nombre;
		private float precio;
		private int unidades;
		

		public Producto(String nombre, float precio, int unidades) {
	
			this.setNombre(nombre);
			this.setPrecio(precio);
			this.setUnidades(unidades);
		}

		public float valorEnStock() 
		{return unidades * precio;}

		public void incrementarStock(int incremento) {
			unidades = unidades + incremento;
		}

		public void disminuirStock(int decremento) {
			unidades = unidades - decremento;
		}
		
		public void incrementarStock() {
			unidades = unidades + 1;
		}

		public void disminuirStock() {
			unidades = unidades - 1;
		}


		public String getNombre() {
			return nombre;
		}

		public float getPrecio() {
			return precio;
		}

		public int getUnidades() {
			return unidades;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public void setUnidades(int unidades) {
			if (unidades>=0)
					this.unidades = unidades;
			else 
					this.unidades=0;
		}

		public void setPrecio(float precio) {
			if (precio > 0 && precio<=PRECIO_MAXIMO)
				this.precio = precio;
			else if(precio<0) {
				this.precio=0;
			}
			
		}
		
	}
