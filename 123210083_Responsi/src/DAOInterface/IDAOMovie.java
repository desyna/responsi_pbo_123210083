/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOInterface;

import java.util.List;
import model.Movie;

/**
 *
 * @author Lab Informatika
 */
public interface IDAOMovie {
    
    public List<Movie>getAll();
    public boolean insert(Movie b);
    public void update();
    public void delete();
    public List<Movie>getAllByName(String nama);
}
