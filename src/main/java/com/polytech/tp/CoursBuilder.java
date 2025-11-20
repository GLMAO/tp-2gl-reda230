package com.polytech.tp;

public class CoursBuilder {
    // TODO: Implémenter le pattern Builder
    private Cours cour = new Cours(null,null,null,null,null,false,null,
            false);
    
    
    public CoursBuilder setMatiere(String matiere) {
        this.cour.setMatiere(matiere);
        return this; }
    public CoursBuilder setEnseignant(String enseignant) {
        this.cour.setEnseignant(enseignant);
        return this; }

    public CoursBuilder setDate(String date) {
        this.cour.setDate(date);
        return this;
    }


    public CoursBuilder setSalle(String salle) {
        this.cour.setSalle(salle);
        return this;
    }

    public CoursBuilder setNiveau(String niveau) {
        this.cour.setNiveau(niveau);
        return this;
    }

    public CoursBuilder setNecessiteProjecteur(boolean necessiteProjecteur) {
        this.cour.setNecessiteProjecteur(necessiteProjecteur);
        return this;
    }


    public CoursBuilder setEstOptionnel(boolean estOptionnel) {
        this.cour.setEstOptionnel(estOptionnel);
        return this;
    }

    public CoursBuilder setHeureDebut(String heureDebut) {
        this.cour.setHeureDebut(heureDebut);
        return this;
    }
    
    
    public Cours build() {
        Cours newcour=this.cour;
        //this.reset();
        return newcour;
    }
}