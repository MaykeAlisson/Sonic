package modeloDao;

import modeloConection.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloBeans.BeansFilmes;


public class DaoFilmes {
    
    BeansFilmes mod = new BeansFilmes();
    ConexaoBD conex = new ConexaoBD();    
  
      public void Salvar (BeansFilmes mod){
        
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into \"Filmes\" (nome_filme, genero_filme, sinopse_filme, classificacao_filme)values (?, ?, ?, ?)");
            pst.setString(1,mod.getNome());
            pst.setString(2,mod.getGenero());
            pst.setString(3,mod.getSinopse());
            pst.setString(4,mod.getClassificacao());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Salvo");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao inserir dados!\nErro:"+ex);
        }
        conex.desconecta();
    }
    
    public void Excluir (BeansFilmes mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from \"Filmes\" where nome_filme=?");
            pst.setString(1, mod.getNome());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados excluidos com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao excluir dados!\nErro:"+ex);
        }
        
        conex.desconecta();
    }
    
    //Pesquisa no banco de dados
    
    public BeansFilmes buscaFilmes(BeansFilmes mod){
        conex.conexao();
        conex.executaSql("select *from \"Filmes\" where  nome_filme like'%"+mod.getPesquisa()+"%'");
        try {
            conex.rs.first();
            mod.setClassificacao(conex.rs.getString("classificacao_filme"));
            mod.setGenero(conex.rs.getString("genero_filme"));
            mod.setSinopse(conex.rs.getString("sinopse_filme"));
            mod.setNome(conex.rs.getString("nome_filme"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao buscar filmes!\nErro:"+ex);
        }
        conex.desconecta();
        return mod;
    }
    
}
