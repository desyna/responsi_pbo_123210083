/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Lab Informatika
 */
public class TabelModelMovie extends AbstractTableModel{

    public TabelModelMovie(List<Movie>lstMovie) {
        this.lstMovie = lstMovie;
    }
    
    @Override
    public int getRowCount() {
        return this.lstMovie.size();
    }
    
    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public String getColumnName(int column) {
        switch(column) {
            case 0: 
                return "Judul";
            case 1: 
                return "Alur";
            case 2: 
                return "Penokohan";
            case 3: 
                return "Akting";
            case 4: 
                return "Nilai";
            default:
                return null;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex) {
            case 0: 
                return lstMovie.get(rowIndex).getJudul();
            case 1: 
                return lstMovie.get(rowIndex).getAlur();
            case 2: 
                return lstMovie.get(rowIndex).getPenokohan();
            case 3: 
                return lstMovie.get(rowIndex).getAkting();
            case 4: 
                return lstMovie.get(rowIndex).getNilai();
            default:
                return null;
        }
    }
    
    List<Movie>lstMovie = null;

}
