/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;
import java.sql.Connection;
import com.mysql.cj.jdbc.MysqlDataSource;

/**
 *
 * @author Lab Informatika
 */
public class Connector {
    static Connection con;
    public static Connection getConnection(){
        if(con==null) {
            MysqlDataSource data = new MysqlDataSource();
            data.setDatabaseName("movie_db");
            data.setUser("root");
            data.setPassword("");
            try {
                con = data.getConnection();
                System.out.println("Koneksi berhasil");
            } catch (Exception e) {
                System.out.println("Koneksi gagal");
            }
        }
        return con;
    }
}
