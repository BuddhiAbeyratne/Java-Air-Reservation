/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Chaithika
 */
public class LegClasses {
    private int leg_no;
    private int class_;
    private float price;
    private Connection conn;
    private boolean exist;
    
    /**
     * Default constructor 
     */
    public LegClasses() {
        conn = DBConnect.connect();
    }
    
    public LegClasses(int pLeg_no, int pclass_){
        conn = DBConnect.connect();
        PreparedStatement pst = null;
        try {
            String sql = "SELECT * FROM `leg_classes` WHERE `leg_no`=?,`class`=?";
            pst = conn.prepareStatement(sql);
            pst.setInt(1, pLeg_no);
            pst.setInt(2, pclass_);
            ResultSet rs;
            rs = pst.executeQuery();
            if (!rs.isBeforeFirst()) {
                return;
            }
            while (rs.next()) {
                this.leg_no = rs.getInt("leg_no");
                this.class_ = rs.getInt("class");
                this.price = rs.getFloat("price");
                this.exist = true;
            }

        } catch (SQLException e) {
            System.out.println("Error:" + e);

        }
    }
    
    /**
     * @return the leg_no
     */
    public int getLeg_no() {
        return leg_no;
    }

    /**
     * @param leg_no the leg_no to set
     */
    public void setLeg_no(int leg_no) {
        this.leg_no = leg_no;
    }

    /**
     * @return the class_
     */
    public int getClass_() {
        return class_;
    }

    /**
     * @param class_ the class_ to set
     */
    public void setClass_(int class_) {
        this.class_ = class_;
    }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * @return the exist
     */
    public boolean isExist() {
        return exist;
    }
    
}
