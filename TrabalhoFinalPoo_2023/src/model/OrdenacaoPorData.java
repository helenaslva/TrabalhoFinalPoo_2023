/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Comparator;

/**
 *
 * @author helenas
 */
public class OrdenacaoPorData implements Comparator<Lancamento> {

    @Override
    public int compare(Lancamento l1, Lancamento l2) {
      return l1.getData().compareTo(l2.getData());
    }
    
}
