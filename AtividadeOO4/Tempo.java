package AtividadeOO4;

public class Tempo {
	
	private int Horas;
	private int Minutos;
	private int Segundos;
	
	
	public Tempo (int horas, int minutos, int segundos ) {
		Horas = horas;
		Minutos = minutos;
		Segundos = segundos;
	}

// getters & setters
	
	
	
	public int getHoras() {
		return Horas;
	}


	public void setHoras(int horas) {
		Horas = horas;
	}


	public int getMinutos() {
		return Minutos;
	}


	public void setMinutos(int minutos) {
		Minutos = minutos;
	}


	public int getSegundos() {
		return Segundos;
	}


	public void setSegundos(int segundos) {
		Segundos = segundos;
	}

	// Metodos
	
	public int convertMinuto() {
		return this.Horas*60 + this.Minutos; 
	}
	
	public int convertSegundos() {
		
		return this.Horas*3600 + this.Minutos*60 + this.Segundos;
	}
	
	public static int DiffMin_0(Tempo fim, Tempo ini) {
		
		return fim.convertMinuto()- ini.convertMinuto();
	}
	
    public  int DiffMin(Tempo fim) {
		
		return fim.convertMinuto()- this.convertMinuto();
	}
    
    public static int fracSegunds(Tempo fim, Tempo ini) {
    	
    	return fim.convertSegundos()- ini.convertSegundos();
    	
    }
}
