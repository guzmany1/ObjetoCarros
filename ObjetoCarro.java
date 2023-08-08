
public class ObjetoCarro {

		public static void main(String[] args) {
        
        Carro carro1 = new Carro("Toyota", "Corolla", 2022, 25000.0);
        Carro carro2 = new Carro("Honda", "Civic", 2021, 23000.0);

        System.out.println("Información del carro 1:");
        carro1.mostrarInformacion();

        System.out.println("\nInformación del carro 2:");
        carro2.mostrarInformacion();
    }

}
