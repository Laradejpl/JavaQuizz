package com.Larade;



import java.util.List;

public class QuizzQuestion {

    private List<Qestions> listElementQuizz;

    public QuizzQuestion(List<Qestions> listElementQuizz) {
        this.listElementQuizz = listElementQuizz;
    }

    public List<Qestions> getListElementQuizz() {
        return listElementQuizz;
    }

    @Override
    public String toString() {
        return "Quizz :" +
                "listElementQuizz : " + listElementQuizz ;
    }
}
