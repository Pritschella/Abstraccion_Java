package Animal;

public class Perro extends Animal{ //Herencia de la clase superior Animal
	
	
		//"Polimorfear" o sobreescribit el método heredado
	
		@Override
		public void hacerSonido() {
			System.out.println("El perrito ladra y hace guau");	
		}//método hacerSonido heredado de Animal		
	
			
			
	public static void main(String[] args) {
		
		//Aquí NO hay polimorfismo, ya que instancio un animal genérico, y utilizo su método hacerSonido
		Animal Generico = new Animal(); //Genera un animal genérico (abstracto)
		Generico.hacerSonido(); /* Antes de la ejecución */
		
		//Generar la instancia de mi perrito
		//SÍ hay polimorfismo, porque es el equivalente a decir "instancio un animal que es un perrito"
		//Referenciar primero la clase general, y luego la instancia particular, permite el polimorfismo
		
		Animal Chilaquil = new Perro();
		Chilaquil.hacerSonido(); /*A esto se le llama Polimorfismo en tiempo de ejecución porque hasta que se ejecuta, se sobreescribe, no antes */
		
		/*
		Persona Felipe = new Dentista();
		Persona Edna = new Paciente();
		Persona Pepe =  new AyudanteDentista();
		*/

	}//main

}//class
