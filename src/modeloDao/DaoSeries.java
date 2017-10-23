package modeloDao;

import modeloConection.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloBeans.BeansSeries;


public class DaoSeries {
    
    BeansSeries mod = new BeansSeries();
    ConexaoBD conex = new ConexaoBD();
    
    public void Salvar (BeansSeries mod){
        
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into \"Series\" (nome_serie, genero_serie, sinopse_serie, classificacao_serie)values (?, ?, ?, ?)");
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
    
    //Pesquisa no banco de dados
     public BeansSeries buscaSeries(BeansSeries mod){
        conex.conexao();
        conex.executaSql("select *from \"Series\" where  nome_serie like'%"+mod.getPesquisar()+"%'");
        try {
            conex.rs.first();
            mod.setClassificacao(conex.rs.getString("classificacao_serie"));
            mod.setGenero(conex.rs.getString("genero_serie"));
            mod.setSinopse(conex.rs.getString("sinopse_serie"));
            mod.setNome(conex.rs.getString("nome_serie"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao buscar series!\nErro:"+ex);
        }
     
        conex.desconecta();
         return mod;
        }
}

