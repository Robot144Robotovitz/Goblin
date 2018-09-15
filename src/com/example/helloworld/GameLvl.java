package com.example.helloworld;

import java.util.ArrayList;
import java.util.List;

public class GameLvl {

    public static final String Prologue= "The goblin in the basement. He lives there.";
    public static final String phrase0 = "0. Actually, that's not true. Goblins hate basements - it's damp and wet there. Goblins prefer attics. With plenty of old books to read. \n You're reading one right now, by the tiny light of a candle.\n You hear a very strange noise from downstairs. Will you go down to investigate?";
    public static final String phrase1_1 = "1.1 There's a little girl down here. She's talking to her father.\n He looks like a nasty man. The one that would kick a stray cat.";
    public static final String phrase1_2 = "1.2 The goblin in the basement. He lives there.";
    public static final String phrase2_1 = "The goblin in the basement. He lives there.";
    public static final String phrase2_2 = "The goblin in the basement. He lives there.";
    public static final String phrase2_3 = "The goblin in the basement. He lives there.";
    public static final String phrase2_4 = "The goblin in the basement. He lives there.";

     public void playPrologue(){
        System.out.println(prologue);
         System.out.println("-------------------");

    }

    public void playOptions(){
            System.out.println(option);
            System.out.println("++++++++++++++");
    }
        private String prologue;

       private String option;


        public GameLvl(String set_prologue, String set_option) {
            prologue = set_prologue;
            option = set_option;
        }


        public String getPrologue() {
            return prologue;
        }

        public void setPrologue(String txt) {
            this.prologue = txt;
        }

    public String getOption() {
        return option;
    }

    public void setOption(String txt) {
        this.option = txt;
    }


    }






