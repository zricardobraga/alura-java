
public abstract class Funcionario {
	private String nome;
	private String cpf;
	private double salario;
	// não pode instanciar objetos dessa classe, porque é abstrata
	
	
	// métodos:
	public abstract double getBonificacao(); 
	// adstract deixa o método sem corpo, pois não há implementação
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
	
	
	

}
