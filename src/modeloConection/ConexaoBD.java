package modeloConection;

import java.sql.*;
import javax.swing.JOptionPane;

    /*Conexão com BANCO DE DADOS*/
public class ConexaoBD {
    
    public Statement stm;
    public ResultSet rs;
    private final String driver = "org.postgresql.Driver";
    private final String caminho = "jdbc:postgresql://localhost:5432/projetofilme";
    private final String usuario = "postgres";
    private final String senha = "llevon10";
    public Connection con;
    
    public void conexao(){
        
        try {
            System.setProperty("jdbc.Drivers", driver);
            con=DriverManager.getConnection(caminho, usuario, senha);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao conectar banco de dados:\n"+ex.getMessage());
        }
    }
    
    public void executaSql(String sql){
        try {
            stm = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Erro ExecutaSql\n"+ex.getMessage());
        }
    }
    
    public void desconecta(){
        try {
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao fechar conexão com BD\n"+ex.getMessage());
        }
    }
    
    
}
