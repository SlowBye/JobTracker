package org.example.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Candidature {
    private final Offre offre;
    private final LocalDate dateCreation;
    private LocalDate dateEnvoi;
    private StatutCandidature statut;
    private final List<String> notes;

    public Candidature(Offre offre, StatutCandidature statut, String note) {
        if(offre == null) {
            throw new IllegalArgumentException("L'offre est obligatoire");
        }
        this.offre = offre;
        this.dateCreation = LocalDate.now();
        if(statut == null) {
            throw new IllegalArgumentException("Le statut de candidature est obligatoire");
        }
        this.statut = statut;
        if(statut.equals(StatutCandidature.BROUILLON)){
            this.dateEnvoi = null;
        }else{
            this.dateEnvoi = LocalDate.now();
        }
        if(note == null){
            throw new IllegalArgumentException("Le note est obligatoire");
        }
        this.notes = new ArrayList<>();
        this.notes.add(note);
    }

    public Offre getOffre() {
        return offre;
    }

    public LocalDate getDateCreation() {
        return dateCreation;
    }

    public LocalDate getDateEnvoi(){
        return dateEnvoi;
    }

    public StatutCandidature getStatut() {
        return statut;
    }

    public List<String> getNotes() {
        return List.copyOf(notes);
    }

    public void ajouterNote(String note) {
        if(note == null){
            throw new IllegalArgumentException("Le note est obligatoire");
        }
        this.notes.add(note);
    }
}
