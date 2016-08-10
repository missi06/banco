	package Banco_ex_7_7;

public class ValorInvalidoException extends RuntimeException{

	/*ValorInvalidoException(String message) {
		super(message);
		}*/
	public ValorInvalidoException(double valor) {
		super("Valor invalido: " + valor);
		}
}
