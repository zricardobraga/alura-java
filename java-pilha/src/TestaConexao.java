
public class TestaConexao {

	public static void main(String[] args) {
		
		// try-catch em uma forma mais enxuta
		try (Conexao conexao = new Conexao()){
			conexao.leDados();
			
		} catch (IllegalStateException ex) {
			System.out.println("Deu erro na conex�o");
			ex.printStackTrace();
		}
		
		/*		
		Conexao con = null;
		
		try{
			con = new Conexao();
			con.leDados();	
		}catch (IllegalStateException ex) {
			System.out.println("Deu erro na conex�o");
			
		}finally {
			con.close();
		}
		
		*/

	}

}
