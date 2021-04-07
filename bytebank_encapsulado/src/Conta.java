public class Conta{
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	//constructor
	public Conta(int agencia, int numero) {
				
		if (agencia <= 0) {
			System.out.println("N�mero da ag�ncia inv�lido");
		}
		this.agencia = agencia;	
		
		if (numero <= 0) {
			System.out.println("N�mero da conta inv�lido");			
		}
		this.numero = numero;
		
		Conta.total++;
		//System.out.println("O total de contas �: " + Conta.total);
		
	}
	
	//m�todo
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	//m�todo
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}else {
			return false;
		}
	}
	//m�todo
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		return false;		
	}
	
	//m�todo get 
	public double getSaldo() {
		return this.saldo;
		
	}
	//m�todo get 
	public int getNumero() {
		return this.numero;
		
	}
	
	//metodo set
	public void setNumero(int numero){
		if (numero <= 0) {
			System.out.println("N�mero da conta inv�lido");
			return;
		}
		this.numero = numero;
	}
	//m�todo get 
	public int getAgencia() {
		return this.agencia;
	}
	
	//metodo set
	public void setAgencia(int agencia) {
		
		if (agencia <= 0) {
			System.out.println("N�mero da ag�ncia inv�lido");
			return;
		}
		this.agencia = agencia;
	}
	
	//metodo set
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	//m�todo get 
	public Cliente getTitular() {
		return titular;
	}
	
	//m�todo get 
	public static int getTotal() {
		return total;
	}
}
	
