package Model.DAO;

import java.util.List;

import Model.Entity.Loja;
import Model.util.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;


	public class LojaDAO {
//CRUD

		public Loja save(Loja loja) {

			try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = null;  
 
		PreparedStatement stmt = connection.prepareStatement("INSERT INTO Loja VALUES(?, ?)");  
		stmt.setString(1, loja.getNome());
		stmt.setBoolean(2, loja.getSelo_qualidade()); 
 
		stmt.executeUpdate();   

 
		connection.close();  
 
			} 	catch(Exception e){
	System.out.println(e);
			}  
 

	return loja;
}
//		public void save (Loja loja) {
//			
//			String sql = "INSERT INTO Loja (nome, selo_qualidade) VALUES(?, ?)";
//			
//			Connection conn = null;
//			PreparedStatement pstm = null;
//			
//			try {
//				conn = Conexao.createConnectionToMySQL();
//				pstm = (PreparedStatement) conn.prepareStatement(sql);
//				pstm.setString(1, loja.getNome());
//				pstm.setBoolean(2, loja.getSelo_qualidade()); 
//				
//				pstm.execute();
//				
//			}catch(Exception e) {
//			e.printStackTrace();
//		}finally {
//			try {
//				if (pstm!= null) {
//					pstm.close();
//				}
//				
//				if (conn!= null) {
//					conn.close();
//				}
//			}
//			catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
//		}
		public Loja update(int id, String nome, boolean selo_qualidade) {
			var loja = new Loja(nome);

// UPDATE

return loja;
}

		public void delete(int id) {
			//DELETE
}

		public Loja getById(int id) {

			//SELECT com WHERE

			return null;
}

		public List<Loja> getAll() {

			var lojas = new ArrayList<Loja>();

			//SELECT

return lojas;
}


}