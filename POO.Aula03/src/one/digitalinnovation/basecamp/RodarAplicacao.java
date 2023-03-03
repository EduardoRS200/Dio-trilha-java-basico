package one.digitalinnovation.basecamp;

public class RodarAplicacao {

	public static void main(String[] args) {
		
		Carro carro1 = new Carro();
		
		carro1.setCor("Preto");
		carro1.setModelo("Golf");
		carro1.setCapacidadeTanque(80);
		
		System.out.println(carro1.getCor());
		System.out.println(carro1.getModelo());
		System.out.println(carro1.getCapacidadeTanque());
		System.out.println(carro1.totalValorTanque(5.50));
		
		Carro carro2 = new Carro ("branco", "Ferrari",90);
		
		
		System.out.println(carro2.getCor());
		System.out.println(carro2.getModelo());
		System.out.println(carro2.getCapacidadeTanque());
		System.out.println(carro2.totalValorTanque(5.50));
		
		
		
	}

}
