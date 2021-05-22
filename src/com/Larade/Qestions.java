package com.Larade;

import java.util.Objects;

public class Qestions {

    private  String QuizzElement;
    private  boolean bonnereponse;
    private boolean question;
    private String nom;



    public String getNom() {
        return nom;
    }

    public Qestions(String nom, String quizzElement, boolean bonnereponse, boolean question) {
        QuizzElement = quizzElement;
        this.bonnereponse = bonnereponse;
        this.question = question;
        this.nom = nom;
    }



    public String getQuizzElement() {
        return QuizzElement;
    }

    public boolean isBonnereponse() {
        return bonnereponse;
    }

    public boolean isQuestion() {
        return question;
    }

    @Override
    public String toString() {
        return "Réponse " +nom + " :  " +
                 QuizzElement ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Qestions qestions = (Qestions) o;
        return bonnereponse == qestions.bonnereponse && question == qestions.question && QuizzElement.equals(qestions.QuizzElement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(QuizzElement, bonnereponse, question);
    }
}
