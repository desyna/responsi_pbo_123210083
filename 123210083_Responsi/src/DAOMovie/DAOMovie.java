/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOMovie;

import DAOInterface.IDAOMovie;
import java.sql.Connection;
import helper.Connector;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Movie;
import java.sql.PreparedStatement;

/**
 *
 * @author Lab Informatika
 */
public class DAOMovie implements IDAOMovie {
    public DAOMovie(){
        con = Connector.getConnection();
    }
    @Override
    public List<Movie> getAll() {
        List<Movie>lstMovie = null;
        try {
            lstMovie = new ArrayList<Movie>();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(strRead);
            while (rs.next()) {
                
                Movie mov = new Movie();
                mov.setJudul(rs.getString("judul"));
                mov.setAlur(rs.getInt("alur"));
                mov.setPenokohan(rs.getInt("penokohan"));
                mov.setAkting(rs.getInt("akting"));
                mov.setNilai(rs.getInt("nilai"));
                lstMovie.add(mov);
            }
        } catch (SQLException e) {
            System.out.println("Error");
        }
        return lstMovie;
    }

    @Override
    public boolean insert(Movie b) {
        boolean result = true;
        PreparedStatement statement = null;
        try {
            statement = con.prepareStatement(strInsert);
            statement.setString(1,b.getJudul());
            statement.setInt(2,b.getAlur());
            statement.setString(3,b.getPenokohan());
            statement.setString(4,b.getAkting());
            statement.setString(5,b.getNilai());
            statement.execute();
        } catch (SQLException e) {
            System.out.println("error");
            result = false;
        }
        finally {
            try { 
                result = false;
            }
        }
        return result;
    }

    @Override
    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Movie> getAllByName(String nama) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    Connection con;
    //Query
    String strRead = "SELECT * FROM movie;";
    String strInsert = "INSERT INTO movie (judul,alur,penokohan,akting,nilai) VALUE (?,?,?,?,?)";
}
