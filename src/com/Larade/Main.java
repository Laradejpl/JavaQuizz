package com.Larade;

import javax.print.attribute.standard.PresentationDirection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;




public class Main {

    public static void main(String[] args) {
       Scanner clavier = new Scanner(System.in);

        Qestions superHeros1 = new Qestions("Question","Quel groupe de super-heros Iron man fait t'il parti ? ",
                false,
                true);

        Qestions superHeros2 = new Qestions("A","Les AVENGERS ",
                true,
                false);

        Qestions superHeros3 = new Qestions("B","Les XMENS ",
                false,
                false);

        Qestions superHeros4 = new Qestions("C","Les JEUNES TITANS ",
                false,
                false);

        //--------------------------------------

        Qestions superHeros5 = new Qestions("Question","HULK détiens c'est pouvoirs de quelle experience ? ",
                false,
                true);

        Qestions superHeros6 = new Qestions("A","Sur l'energie Atomique ",
                false,
                false);

        Qestions superHeros7 = new Qestions("B","Sur les Rayons Gammas ",
                true,
                false);



        Qestions superHeros8 = new Qestions("C","Sur l 'uranium ",
                false,
                false);

        //--------------------------------------

        Qestions informatique = new Qestions("Question"
                ,"Python est utiliser dans quelle domaine informatique?"
                ,false,true);

        Qestions informatique1 = new Qestions("A"
                ,"Pour creer le css d'une page"
                ,false,false);

        Qestions informatique2 = new Qestions("B"
                ,"Pour l'intelligence artificiel"
                ,true,false);

        Qestions informatique3 = new Qestions("C"
                ,"Pour prevoir la méteo"
                ,false,false);

        //--------------------------------------


        Qestions music = new Qestions("Question",
                "Bob Marley est un chanteur de quelle genre de musique",
                false,
                true);

        Qestions music1 = new Qestions("A",
                "ROCK",
                false,
                false);

        Qestions music2 = new Qestions("B",
                "FUNK",
                false,
                false);

        Qestions music3 = new Qestions("C",
                "REGGAE",
                true,
                false);


        List<Qestions> superheroesGroup = new ArrayList<>();
        List<Qestions> superheroesGroup1 = new ArrayList<>();
        List<Qestions> informatiqueGroup = new ArrayList<>();
        List<Qestions> musicGroup = new ArrayList<>();

        musicGroup.add(music);
        musicGroup.add(music1);
        musicGroup.add(music2);
        musicGroup.add(music3);

        informatiqueGroup.add(informatique);
        informatiqueGroup.add(informatique1);
        informatiqueGroup.add(informatique2);
        informatiqueGroup.add(informatique3);



        superheroesGroup.add(superHeros5);
        superheroesGroup.add(superHeros6);
        superheroesGroup.add(superHeros7);
        superheroesGroup.add(superHeros8);

        superheroesGroup1.add(superHeros1);
        superheroesGroup1.add(superHeros2);
        superheroesGroup1.add(superHeros3);
        superheroesGroup1.add(superHeros4);

        QuizzQuestion listOfQuestions = new QuizzQuestion(superheroesGroup);
        QuizzQuestion listOfQuestions1 = new QuizzQuestion(superheroesGroup1);
        QuizzQuestion listOfQuestions2 = new QuizzQuestion(informatiqueGroup);
        QuizzQuestion listOfQuestions3 = new QuizzQuestion(musicGroup);
        //un element de la liste
        //@TODO creation de la liste de question
       List<QuizzQuestion> listDeTouteLesQestions =new ArrayList<>();
       //ajout des question
       listDeTouteLesQestions.add(listOfQuestions);
        listDeTouteLesQestions.add(listOfQuestions1);
        listDeTouteLesQestions.add(listOfQuestions2);
        listDeTouteLesQestions.add(listOfQuestions3);
//  une question
        /*
        Iterator<Qestions> iterator = superheroesGroup.iterator();


        Qestions quest = null;

        while(iterator.hasNext()){

            quest=iterator.next();
            System.out.println( quest.getNom() + "--->  "+ quest.getQuizzElement());

            System.out.println("_________________________");

        }*/

// ont vois les questions du quizz
/*
            Iterator<QuizzQuestion> iterator1 = listDeTouteLesQestions.iterator();

            QuizzQuestion uneQuestion = null;

            while(iterator1.hasNext()){

                uneQuestion = iterator1.next();

                System.out.println(uneQuestion.getListElementQuizz());
            }*/
        System.out.println("------------------------------------\n");


         //int tentatives = 0;


        System.out.println("      \uD83D\uDE01 QUIZZ \uD83D\uDE01");
        System.out.println("------------------------------------\n");
        int nbAlea = (int) (Math.random() * listDeTouteLesQestions.size());

            System.out.println(listDeTouteLesQestions.get(nbAlea).getListElementQuizz().get(0)
                    + "\n "
                    + listDeTouteLesQestions.get(nbAlea).getListElementQuizz().get(1)
                    + "\n "
                    + listDeTouteLesQestions.get(nbAlea).getListElementQuizz().get(2)
                    + "\n "
                    + listDeTouteLesQestions.get(nbAlea).getListElementQuizz().get(3)
            );
        System.out.println("ENTREZ LA BONNE REPONSE 💀  A,B ou C");
         String reponse =  clavier.nextLine();
         //ont compare les reponse de l'utilisateur


         if(reponse.equals(listDeTouteLesQestions.get(nbAlea).getListElementQuizz().get(1).getNom())&&
                 listDeTouteLesQestions.get(nbAlea).getListElementQuizz().get(1).isBonnereponse() ||
                 reponse.equals(listDeTouteLesQestions.get(nbAlea).getListElementQuizz().get(2).getNom())&&
                         listDeTouteLesQestions.get(nbAlea).getListElementQuizz().get(2).isBonnereponse() ||
                 reponse.equals(listDeTouteLesQestions.get(nbAlea).getListElementQuizz().get(3).getNom())&&
                         listDeTouteLesQestions.get(nbAlea).getListElementQuizz().get(3).isBonnereponse()
         ){

             System.out.println(" 🤡🤡   Bonne Réponse mon gars !!!!! 🤡🤡");

         }else{
             System.out.println("💀💀   Mauvaise réponse  💀💀");
         }

    }

}
