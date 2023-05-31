/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Lab Informatika
 */
public class Movie {

    /**
     * @return the Judul
     */
    public String getJudul() {
        return Judul;
    }

    /**
     * @param Judul the Judul to set
     */
    public void setJudul(String Judul) {
        this.Judul = Judul;
    }

    /**
     * @return the Alur
     */
    public Integer getAlur() {
        return Alur;
    }

    /**
     * @param Alur the Alur to set
     */
    public void setAlur(Integer Alur) {
        this.Alur = Alur;
    }

    /**
     * @return the Penokohan
     */
    public Integer getPenokohan() {
        return Penokohan;
    }

    /**
     * @param Penokohan the Penokohan to set
     */
    public void setPenokohan(Integer Penokohan) {
        this.Penokohan = Penokohan;
    }

    /**
     * @return the Akting
     */
    public Integer getAkting() {
        return Akting;
    }

    /**
     * @param Akting the Akting to set
     */
    public void setAkting(Integer Akting) {
        this.Akting = Akting;
    }

    /**
     * @return the Nilai
     */
    public Integer getNilai() {
        return Nilai;
    }

    /**
     * @param Nilai the Nilai to set
     */
    public void setNilai(Integer Nilai) {
        this.Nilai = Nilai;
    }
    private String Judul;
    private Integer Alur;
    private Integer Penokohan;
    private Integer Akting;
    private Integer Nilai;
    
    
    
}
