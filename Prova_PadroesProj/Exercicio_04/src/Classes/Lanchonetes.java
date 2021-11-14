package Classes;

public abstract class Lanchonetes {
	
	protected abstract Sanduiche fazer_sanduiche();

    public Sanduiche novo_sanduiche(){
        Sanduiche new_sanduiche = this.fazer_sanduiche();
        System.out.println("Um pedido de :" + new_sanduiche.getSanduiche());
        return new_sanduiche;
    }

}
