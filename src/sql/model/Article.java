package sql.model;
// Generated 15 janv. 2014 17:39:49 by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Article generated by hbm2java
 */
public class Article  implements java.io.Serializable {


     private Integer idArticle;
     private Fournisseur fournisseur;
     private FamilleArticle familleArticle;
     private String infos;
     private String libelle;
     private String nom;
     private Float PAchat;
     private float PVente;
     private Integer qteMin;
     private int qteStock;
     private String marque;
     private Set ligneFactures = new HashSet(0);

    public Article() {
    }

	
    public Article(FamilleArticle familleArticle, String libelle, String nom, float PVente, int qteStock, String marque) {
        this.familleArticle = familleArticle;
        this.libelle = libelle;
        this.nom = nom;
        this.PVente = PVente;
        this.qteStock = qteStock;
        this.marque = marque;
    }
    public Article(Fournisseur fournisseur, FamilleArticle familleArticle, String infos, String libelle, String nom, Float PAchat, float PVente, Integer qteMin, int qteStock, String marque, Set ligneFactures) {
       this.fournisseur = fournisseur;
       this.familleArticle = familleArticle;
       this.infos = infos;
       this.libelle = libelle;
       this.nom = nom;
       this.PAchat = PAchat;
       this.PVente = PVente;
       this.qteMin = qteMin;
       this.qteStock = qteStock;
       this.marque = marque;
       this.ligneFactures = ligneFactures;
    }
   
    public Integer getIdArticle() {
        return this.idArticle;
    }
    
    public void setIdArticle(Integer idArticle) {
        this.idArticle = idArticle;
    }
    public Fournisseur getFournisseur() {
        return this.fournisseur;
    }
    
    public void setFournisseur(Fournisseur fournisseur) {
        this.fournisseur = fournisseur;
    }
    public FamilleArticle getFamilleArticle() {
        return this.familleArticle;
    }
    
    public void setFamilleArticle(FamilleArticle familleArticle) {
        this.familleArticle = familleArticle;
    }
    public String getInfos() {
        return this.infos;
    }
    
    public void setInfos(String infos) {
        this.infos = infos;
    }
    public String getLibelle() {
        return this.libelle;
    }
    
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
    public String getNom() {
        return this.nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    public Float getPAchat() {
        return this.PAchat;
    }
    
    public void setPAchat(Float PAchat) {
        this.PAchat = PAchat;
    }
    public float getPVente() {
        return this.PVente;
    }
    
    public void setPVente(float PVente) {
        this.PVente = PVente;
    }
    public Integer getQteMin() {
        return this.qteMin;
    }
    
    public void setQteMin(Integer qteMin) {
        this.qteMin = qteMin;
    }
    public int getQteStock() {
        return this.qteStock;
    }
    
    public void setQteStock(int qteStock) {
        this.qteStock = qteStock;
    }
    public String getMarque() {
        return this.marque;
    }
    
    public void setMarque(String marque) {
        this.marque = marque;
    }
    public Set getLigneFactures() {
        return this.ligneFactures;
    }
    
    public void setLigneFactures(Set ligneFactures) {
        this.ligneFactures = ligneFactures;
    }

    @Override
    public String toString() {
        return libelle;
    }
    
    

}


