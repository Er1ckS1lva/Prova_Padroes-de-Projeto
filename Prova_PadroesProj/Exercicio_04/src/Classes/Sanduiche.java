package Classes;

public abstract class Sanduiche {

	protected String sanduiche;
	
	protected Pao pao;
	protected Queijo queijo;
	protected Salada salada;
	protected Presunto presunto;
	
	public String getSanduiche() {
		return sanduiche;
	}
	public void setSanduiche(String sanduiche) {
		this.sanduiche = sanduiche;
	}
	
	public abstract void montar();
	
	public String toString(){
        StringBuffer sanduiche_pronto = new StringBuffer();
        sanduiche_pronto.append(this.sanduiche);
        
        if(this.pao != null){
        	sanduiche_pronto.append(this.pao);
        	sanduiche_pronto.append("\n");            
        }
        
        if(this.queijo != null){
        	sanduiche_pronto.append(this.queijo);
        	sanduiche_pronto.append("\n");            
        }
        
        if(this.salada != null){
        	sanduiche_pronto.append(this.salada);
        	sanduiche_pronto.append("\n");            
        }
        
        if(this.presunto != null){
        	sanduiche_pronto.append(this.presunto);
        	sanduiche_pronto.append("\n");            
        }
        return sanduiche_pronto.toString();
	}
}
