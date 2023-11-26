/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */


import java.io.IOException;
import java.time.LocalDate;
import model.ControleFinanceiro;
import model.Despesa;
import model.Lancamento;
import model.Receita;
import model.TipoDespesa;
import static model.TipoDespesa.ALIMENTACAO;
import model.TipoReceita;
import static model.TipoReceita.OUTRAS_RECEITAS;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Bruna.Moro
 */
public class ControleFinanceiroTest {
    LocalDate data = LocalDate.now();
    
@Test
    public void testIncluirReceita() throws IOException {
        Receita r1 = new Receita(12.6, data, OUTRAS_RECEITAS);
        Lancamento l1 = r1;
 
        ControleFinanceiro c1 = new ControleFinanceiro("Bruna");
        c1.inlcuirReceita(l1);
        
        assertEquals(12.6, l1.getValor(), 0.00);
    }

    @Test
    public void testIncluirDespesa() throws IOException {
        Despesa d1 = new Despesa(11000.95, data, ALIMENTACAO);
        Lancamento l1 = d1;
 
        ControleFinanceiro c1 = new ControleFinanceiro("Bruna");
        c1.incluirDespesa(l1);
        
        assertEquals(11000.95, l1.getValor(), 0.00);
    }
    
        @Test
    public void testListarDespesa() throws IOException {
        Despesa d1 = new Despesa(11000.95, data, ALIMENTACAO);
        Lancamento l1 = d1;
        
        Despesa d2 = new Despesa(27896.36, data, TipoDespesa.EDUCACAO);
        Lancamento l2 = d2;
 
        ControleFinanceiro c1 = new ControleFinanceiro("Bruna");
        c1.incluirDespesa(l1);
        c1.incluirDespesa(l2);
        
        assertEquals(2, c1.listarDespesas().size());
    }
    @Test
    public void testListarReceitas() throws IOException {
       Receita r1 = new Receita(12.6, data, OUTRAS_RECEITAS);
        Lancamento l1 = r1;
        
        Receita r2 = new Receita(1169.6, data, TipoReceita.FERIAS);
        Lancamento l2 = r2;
 
        ControleFinanceiro c1 = new ControleFinanceiro("Bruna");
        c1.inlcuirReceita(l1);
        c1.inlcuirReceita(l2);
        
        assertEquals(2, c1.listarReceitas().size());
    }
     @Test
    public void testListarLancamentosPorData() throws IOException {
         Receita r2 = new Receita(1169.6, data, TipoReceita.FERIAS);
        Lancamento l1 = r2;
        
        LocalDate data2 = data.minusDays(1);
         Despesa d2 = new Despesa(27896.36, data2, TipoDespesa.EDUCACAO);
        Lancamento l2 = d2;

      ControleFinanceiro c1 = new ControleFinanceiro("Bruna");
        c1.inlcuirReceita(l1);
        c1.incluirDespesa(l2);
  
        assertEquals(l1, c1.listarLancamentosPorData().get(0));  
        assertEquals(l2, c1.listarLancamentosPorData().get(1)); 
       
    }
  
}
