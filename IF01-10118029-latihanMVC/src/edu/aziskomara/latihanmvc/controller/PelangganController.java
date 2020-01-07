/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.aziskomara.latihanmvc.controller;

import edu.aziskomara.latihanmvc.model.PelangganModel;
import edu.aziskomara.latihanmvc.view.PlangganView;
import javax.swing.JOptionPane;

/**
 *
 * @author Azis Komara
 * NIM   : 10118029
 * Nama  : Azis Komara
 * Kelas : IF-1
 */
public class PelangganController {
    
   private PelangganModel model;

    public void setModel(PelangganModel model) {
        this.model = model;
    }
   
   
   
   public void resetForm(PlangganView view){
       String nama = view.getTextNama().getText();
       String email = view.getTextEmail().getText();
       String notelepon = view.getTextNoTelpon().getText();
       
       if (nama.equals("") && email.equals("") && notelepon.equals("")) {
           
       }else{
       
       model.resetForm();
       }
   }
   
   public void simpanForm(PlangganView view){
       String nama = view.getTextNama().getText();
       String email = view.getTextEmail().getText();
       String notelepon = view.getTextNoTelpon().getText();
       
       if (nama.trim().equals("")) {
           JOptionPane.showMessageDialog(view, "Nama Masih Kosong");
           
       }else if(email.trim().equals("")) {
           JOptionPane.showMessageDialog(view, "Email Masih Kosong");
            
       }else if(notelepon.trim().equals("")) {
           JOptionPane.showMessageDialog(view, "No Telepon Masih Kosong");
             
       }else{
           model.simpanForm();
       }
   }
}
