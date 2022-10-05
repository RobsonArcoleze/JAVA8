/**
 * Classe representa nada, somente didatico
 * @author Robson
 *
 */
public class TesteConexao {

	public static void main(String[] args) {
		
		
		try (Conexao conexao = new Conexao() ) {
			conexao.leDados();
			/**
			 * @conexao Não significa nada
			 */
		} catch(IllegalStateException ex) {
			System.out.println("Deu erro na conexao");
		}
		/**
		 * @conexão 
		 */
		
		//-----------------------------
		
//		Conexao con = null;
//		try {
//			con = new Conexao();
//			con.leDados();
//		} catch(IllegalStateException ex) {
//			System.out.println("Deu erro na conexao");
//		} finally {
//			System.out.println("finally");
//			if(con != null) {
//				con.close();
//			}
//		}
		

	}

}
