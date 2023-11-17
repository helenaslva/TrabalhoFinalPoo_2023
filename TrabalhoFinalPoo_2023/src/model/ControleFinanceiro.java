/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author helenas
 */
public class ControleFinanceiro {

    public ControleFinanceiro(String titular) {
        this.titular = titular;
    }

    private String titular;
    private double saldo;
    private ArrayList<Lancamento> lancamentos = new ArrayList();

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void inlcuirReceita(Lancamento receita) throws FileNotFoundException, IOException {
        if (receita instanceof Receita) {
            this.lancamentos.add(receita);
            if (receita.getData().isBefore(LocalDate.now())) {
                this.setSaldo(this.getSaldo() + receita.getValor());
            }
            atualizarArquivoCSV();
        } else {
            throw new IllegalArgumentException("O lançamento não é uma receita");
        }
    }

    public void incluirDespesa(Lancamento despesa) throws IOException {
        if (despesa instanceof Despesa) {

            this.lancamentos.add(despesa);
            if (despesa.getData().isBefore(LocalDate.now())) {
                this.setSaldo(this.getSaldo() - despesa.getValor());
            }
            atualizarArquivoCSV();
        } else {
            throw new IllegalArgumentException("O lançamento não é uma despesa");
        }
    }

    public ArrayList<Lancamento> listarReceitas() {
        ArrayList<Lancamento> receitas = new ArrayList();
        for (Lancamento l : lancamentos) {
            if (l instanceof Receita) {
                receitas.add(l);
            }
        }
        return receitas;
    }

    public ArrayList<Lancamento> listarDespesas() {
        ArrayList<Lancamento> despesas = new ArrayList();
        for (Lancamento l : lancamentos) {
            if (l instanceof Despesa) {
                despesas.add(l);
            }
        }
        return despesas;
    }

    public ArrayList<Lancamento> listarLancamentosPorData() {
        ArrayList<Lancamento> lancamentosOrdenados = new ArrayList(lancamentos);
        Collections.sort(lancamentosOrdenados, new OrdenacaoPorData());
        return lancamentosOrdenados;

    }

    public void atualizarArquivoCSV() throws FileNotFoundException, IOException {
        try (PrintWriter write = new PrintWriter(new FileWriter("C:\\Users\\helenas\\Downloads\\teste.csv"), true)) {
            String linha = "";
            for (Lancamento l : lancamentos) {
                linha += l.getTipoLancamento() + "," + l.getData() + "," + l.getValor() + "," + l.getTipo() + "\n";
            }
            write.println(linha);

        }

    }

}
