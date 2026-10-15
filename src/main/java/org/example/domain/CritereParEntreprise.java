package org.example.domain;

public class CritereParEntreprise implements CritereCandidature {
    private final String nom;

    public CritereParEntreprise(String nom) {
        this.nom = nom;
    }

    @Override
    public boolean Accepte(Candidature candidature) {
        return candidature.getOffre().getEntreprise().getNom().equalsIgnoreCase(nom);
    }
}
