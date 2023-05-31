package AtividadeOO4;

public class Ligacao {

	private String numOrigem;
	private String numDestino;
	private String localOrigem;
	private String localDestino;
	private double ValorTotal;
	private Tempo inicio;
	private Tempo fim;
	
	
	public Ligacao (String numOrigem, String numDestino, String localOrigem, String localDestino, Tempo inicio) {
      this.numOrigem = numOrigem;
      this.numDestino = numDestino;
      this.localOrigem = localOrigem;
      this.localDestino = localDestino;
      this.inicio = inicio;
		
	}


	public String getNumOrigem() {
		return numOrigem;
	}


	public void setNumOrigem(String numOrigem) {
		this.numOrigem = numOrigem;
	}


	public String getNumDestino() {
		return numDestino;
	}


	public void setNumDestino(String numDestino) {
		this.numDestino = numDestino;
	}


	public String getLocalOrigem() {
		return localOrigem;
	}


	public void setLocalOrigem(String localOrigem) {
		this.localOrigem = localOrigem;
	}


	public String getLocalDestino() {
		return localDestino;
	}


	public void setLocalDestino(String localDestino) {
		this.localDestino = localDestino;
	}


	public double getValorTotal() {
		return ValorTotal;
	}


	public void setValorTotal(double valorTotal) {
		ValorTotal = valorTotal;
	}


	public Tempo getInicio() {
		return inicio;
	}


	public void setInicio(Tempo inicio) {
		this.inicio = inicio;
	}


	public Tempo getFim() {
		return fim;
	}


	public void setFim(Tempo fim) {
		this.fim = fim;
	}
	
	
	// metodos
	
	
	public double calcValorTotal() {
		if (this.fim != null) {
		 int duracaoMin= this.inicio.DiffMin(this.fim);
		  return duracaoMin*1.0;
		}
		else {
			 System.out.println("A ligação não foi encerrada !");
				return 0;	
			}
		
	}
	
    public double calcValorTotal2() {
		if (this.fim != null) {
		  int duracaoMin= Tempo.DiffMin_0(this.fim, this.inicio);
		  return duracaoMin*1.0;
		}
		else {
		 System.out.println("A ligação não foi encerrada !");
			return 0;	
		}
	}
    
    public double calcValorTotal3() {
    	
		if (this.fim != null) {
		  int duracaoseg = Tempo.fracSegunds(this.fim, this.inicio);
		  int duracaoMin = duracaoseg/60;
		  if(duracaoseg%60==0)
		  return duracaoMin*1.0;
		  else 
		 return (duracaoMin+1)*1.0;	  
		}
		else {
		 System.out.println("A ligação não foi encerrada !");
			return 0;	
		}
    }

    public boolean Verfnumb(String S) {
    
    	if (S.equals(this.numOrigem)||S.equals(this.numDestino)) {
    		if (S.equals(this.numOrigem))
    			System.out.println("Ele é o numero de origem");
    	    if(S.equals(this.numDestino))
    			System.out.println("Ele é o numedo de destino");
    		return true;
    	}else {
    		return false;
    	}
           
    }
}
