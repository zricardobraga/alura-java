public class Conta{
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	//constructor
	public Conta(int agencia, int numero) {
				
		if (agencia <= 0) {
			System.out.println("Número da agência inválido");
		}
		this.agencia = agencia;	
		
		if (numero <= 0) {
			System.out.println("Número da conta inválido");			
		}
		this.numero = numero;
		
		Conta.total++;
		//System.out.println("O total de contas é: " + Conta.total);
		
	}
	
	//método
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	//método
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}else {
			return false;
		}
	}
	//método
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		return false;		
	}
	
	//método get 
	public double getSaldo() {
		return this.saldo;
		
	}
	//método get 
	public int getNumero() {
		return this.numero;
		
	}
	
	//metodo set
	public void setNumero(int numero){
		if (numero <= 0) {
			System.out.println("Número da conta inválido");
			return;
		}
		this.numero = numero;
	}
	//método get 
	public int getAgencia() {
		return this.agencia;
	}
	
	//metodo set
	public void setAgencia(int agencia) {
		
		if (agencia <= 0) {
			System.out.println("Número da agência inválido");
			return;
		}
		this.agencia = agencia;
	}
	
	//metodo set
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	//método get 
	public Cliente getTitular() {
		return titular;
	}
	
	//método get 
	public static int getTotal() {
		return total;
	}
}
	
