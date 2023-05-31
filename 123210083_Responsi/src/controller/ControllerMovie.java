/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAOInterface.IDAOMovie;
import DAOMovie.DAOMovie;
import java.util.List;
import model.Movie;
import model.TabelModelMovie;
import view.FormMovie;

/**
 *
 * @author Lab Informatika
 */
public class ControllerMovie {
    
    public ControllerMovie(FormMovie frmMovie) {
        this.frmMovie = frmMovie;
        iMovie = new DAOMovie();
    }
    
    public void isiTabel() {
        lstMovie = iMovie.getAll();
        TabelModelMovie tabelMov = new TabelModelMovie(lstMovie);
        frmMovie.getTabelData().setModel(tabelMov);
    }
    
    public void insert(){
        Movie b = new Movie();
        b.setJudul(frmMovie.getTxtJudul().getText());
        b.setAlur(Integer.parseInt(frmMovie.getTxtAlur().getText()));
        b.setPenokohan(Integer.parseInt(frmMovie.getTxtPenokohan().getText()));
        b.setAkting(Integer.parseInt(frmMovie.getTxtAkting().getText()));
        
        boolean rs = iMovie.insert(b);
        
    }
    
    FormMovie frmMovie;
    IDAOMovie iMovie;
    List<Movie>lstMovie;
}
