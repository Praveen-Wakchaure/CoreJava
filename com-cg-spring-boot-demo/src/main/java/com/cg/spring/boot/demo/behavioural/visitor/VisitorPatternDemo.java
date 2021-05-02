package com.cg.spring.boot.demo.behavioural.visitor;

interface Visitable { // passive object - game
    void accept(Visitor visitor);
}

 

interface Visitor { // active object - player

 

    public abstract void playGame(Cricket obj);

 

    public abstract void playGame(Hockey obj);

 

    public abstract void playGame(Football obj);
}

 

class GamePlayer implements Visitor {

 

    @Override
    public void playGame(Cricket obj) {
        System.out.println("Playing cricket...");
    }

 

    @Override
    public void playGame(Hockey obj) {
        System.out.println("Playing hockey...");
    }

 

    @Override
    public void playGame(Football obj) {
        System.out.println("Playing football...");
    }

 

}

 

abstract class Game {

 

    int score;

 

    public Game() {

 

    }

 

    public void getScore() {
        // code
    }

 

}

 

class Cricket extends Game implements Visitable {

 

    public void accept(Visitor visitor) {
        visitor.playGame(this);
    }
}

 

class Hockey extends Game implements Visitable {

 

    public void accept(Visitor visitor) {
        visitor.playGame(this);
    }
}

 

class Football extends Game implements Visitable {

 

    public void accept(Visitor visitor) {
        visitor.playGame(this);
    }
}

 

public class VisitorPatternDemo {
    public static void main(String args[]) {
        
        Visitor visitor = new GamePlayer(); // active object - player 
        
        Visitable v1 = new Cricket();
        v1.accept(visitor);
        Visitable v2 = new Hockey();
        v2.accept(visitor);
        Visitable v3 = new Football();
        v3.accept(visitor);
    }
}