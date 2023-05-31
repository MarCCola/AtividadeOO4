package AtividadeOO4;

public class Principal {
	public static void main(String [] args) {
		
		Tempo inilig = new Tempo(21, 20, 5);
		
		Ligacao Lig1 = new Ligacao("1111", "2222", "AAAA", "BBB", inilig);
		
		System.out.println("Num origem: " + Lig1.getNumOrigem());
		System.out.println("Num destino: " + Lig1.getNumDestino());
		System.out.println("local origem: " + Lig1.getLocalOrigem());
		System.out.println("local destino: " + Lig1.getLocalDestino());
		System.out.println("Inicio : " + Lig1.getInicio().getHoras()+ ":" + 
		                                 Lig1.getInicio().getMinutos() + ":"+
		                                 Lig1.getInicio().getSegundos());
		
		Tempo fimlig = new Tempo (22, 23, 6);
		Lig1.setFim(fimlig);
		
		System.out.println("fim : " + Lig1.getFim().getHoras()+ ":" + 
                                      Lig1.getFim().getMinutos() + ":"+
                                      Lig1.getFim().getSegundos());
		
		System.out.println("Valor total : " + Lig1.calcValorTotal());
		System.out.println("Valor total : " + Lig1.calcValorTotal2());
		System.out.println("Valor total : " + Lig1.calcValorTotal3());
		
		System.out.println("O numero: 1111 está na ligação : " + Lig1.Verfnumb("1111") );
		
	}

}
