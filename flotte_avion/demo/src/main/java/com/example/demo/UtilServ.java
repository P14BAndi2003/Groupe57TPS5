package com.example.demo;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDateTime;
import java.util.Formatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.crypto.dsig.SignatureMethod;
@Service
public class UtilServ {
    @Autowired
    utilRep urepo;
    private ArrayList<utilisateur> getAll(){
        ArrayList<utilisateur> util = new ArrayList<utilisateur>();
        for(utilisateur u :urepo.findAll()){
            util.add(u);
        }
        return util;
    }
    private static String Sha1(String password) throws UnsupportedEncodingException {
        String sha1 = "";
        try {
            MessageDigest crypt = MessageDigest.getInstance("SHA-1");
            crypt.reset();
            crypt.update(password.getBytes("UTF-8"));
            sha1 = byteToHex(crypt.digest());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return sha1;
    }

    private static String byteToHex(final byte[] hash) {
        Formatter formatter = new Formatter();
        for (byte b : hash) {
            formatter.format("%02x", b);
        }
        String result = formatter.toString();
        formatter.close();
        return result;
    }
    public  static String genererToken(String user){
        String name=user;
        LocalDateTime ajd=LocalDateTime.now();
        Integer Y=ajd.getYear();
            String taona=Y.toString();
        Integer m=ajd.getMonthValue();
            String volana=m.toString();
        Integer d=ajd.getDayOfMonth();
            String andro=d.toString();
        Integer min=ajd.getHour();
            String lera=min.toString();
            String hash="";
        try {
            String hash1=UtilServ.Sha1(name);
            String h2=UtilServ.Sha1(taona+volana+andro+lera);
            hash=UtilServ.Sha1(hash1+h2);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(UtilServ.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hash;
    }
    public String log(String nom, String mdp){
        ArrayList<utilisateur> liste=this.getAll();
        Boolean v=false;
        String t="null";
        for(int i=0; i<liste.size(); i++){
            if((liste.get(i).getNom().equals(nom))&&(liste.get(i).getMdp().equals(mdp))){
                v=true;
                 utilisateur u=new utilisateur();
                 u.setId(liste.get(i).getId());
                 u.setNom(nom);
                 u.setMdp(mdp);
                 String token=this.genererToken(nom);
                 u.setToken(token);
                 t=u.getToken();
                 //urepo.save(u);
            }
        }
        return t;
    }
    public Boolean deco(String nom,String mdp){
        ArrayList<utilisateur> liste=this.getAll();
        Boolean v=false;
        for(int i=0; i<liste.size(); i++){
            if((liste.get(i).getNom().equals(nom))&&(liste.get(i).getMdp().equals(mdp))){
                v=true;
                 utilisateur u=new utilisateur();
                 u.setId(liste.get(i).getId());
                 u.setNom(nom);
                 u.setMdp(mdp);
                 urepo.save(u);
            }
        }
        return v;
    } 

    public Boolean check_token_si_valide(String nom){
        Boolean v=false;
        String token=this.genererToken(nom);
        ArrayList<utilisateur> liste=this.getAll();
        for(int i=0; i<liste.size(); i++){
            if((liste.get(i).getNom().equals(nom)&&(liste.get(i).getToken().equals(token)))){
                v=true;
                break;
            }
        }
        return v;
    }
    
    
}
