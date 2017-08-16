package models.pagavel;

public interface IPagavel {

	/**
	 * Método para buscar o valor do objeto
	 * @return
	 */
	public double getValor();

	/**
	 * Método para pagar o objeto
	 */
	public void pagar();

	/**
	 * Método para verificar se o objeto está pago
	 * @return
	 */
	public boolean quitado();

}
