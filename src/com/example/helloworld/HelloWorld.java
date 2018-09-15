package com.example.helloworld;

import com.sun.xml.internal.ws.util.StringUtils;

import java.util.*;


import java.util.Arrays;


class Goblin {



    public static void main(String[] args) {

        GameLvl lvl0 = new GameLvl("The goblin in the basement. He lives there.\nActually, that's not true. Goblins hate basements - it's damp and wet there. Goblins prefer attics. With plenty of old books to read. \nYou're reading one right now, by the tiny light of a candle.\nYou hear a very strange noise from downstairs.", null);
        GameLvl lvl1_0 = new GameLvl( "1.0 There's a little girl down here. She's talking to her father.\n He looks like a nasty man. The one that would kick a stray cat.", "1. Will you go down to investigate?");
        GameLvl lvl1_1 = new GameLvl( "1.1 Noise is just a noise. And the book is really interesting! \nIt's about liitle creatures that lives in the holes, and a ring.", "2. Keep reading your book?");
        GameLvl lvl2_0 = new GameLvl( "2.0 ," , "1. Option for 2.0");
        GameLvl lvl2_2 = new GameLvl( "2.2 ", "1. Option for 2.2");
        GameLvl lvl2_3 = new GameLvl( "2.3 ", "2. Option for 2.3");

        Tree <GameLvl> Game = new Tree<GameLvl>(lvl0);

    Game.addChild( new Tree<GameLvl>(lvl1_0));
    Game.addChild( new Tree<GameLvl>(lvl1_1));

    Game.getChild(0).addChild(new Tree<GameLvl>(lvl2_0));
    Game.getChild(1).addChild(new Tree<GameLvl>(lvl2_2));
    Game.getChild(1).addChild(new Tree<GameLvl>(lvl2_3));



    while(true){
        Game.getData().playPrologue();
        if (Game.hasChildren()) {
            Game.getChildren().forEach(child -> {
                child.getData().playOptions();
            });

            Scanner sc = new Scanner(System.in);
            int i = sc.nextInt() - 1;

            Game = Game.getChild(i);
        }
        else break;
    }

    System.out.println("That's all, folks!");
    }



}


