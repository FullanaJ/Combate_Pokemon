package com.fullana.combatepokmon;


import java.io.Serializable;

public class Pokemon implements Serializable {

    private String name;
    private int hp,atack,defense,sAtack,sDefense;
    public final static int NORMAL_ATACK = 0;
    public final static int SPECIAL_ATACK = 1;

    public Pokemon(){

    }
    public Pokemon(String name, int hp, int atack, int defense, int sAtack, int sDefense) {
        this.name = name;
        this.hp = hp;
        this.atack = atack;
        this.defense = defense;
        this.sAtack = sAtack;
        this.sDefense = sDefense;
    }

    public void makeMove(int i, Pokemon p){
        switch (i){
            case 0 -> simpleAtack(p);
            case 1 -> specialAtack(p);
        }
    }
    private void simpleAtack(Pokemon p){
        int res;
        if( (res =(p.hp - (this.atack - p.defense)))>0){
            p.hp = p.hp-res;
        }else System.out.println("El ataque no ha hecho efecto");
    }
    private void specialAtack(Pokemon p){
        int res;
        if( (res =(p.hp - (this.sAtack - p.sDefense)))>0){
            p.hp = p.hp-res;
        }else System.out.println("El ataque no ha hecho efecto");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAtack() {
        return atack;
    }

    public void setAtack(int atack) {
        this.atack = atack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getsAtack() {
        return sAtack;
    }

    public void setsAtack(int sAtack) {
        this.sAtack = sAtack;
    }

    public int getsDefense() {
        return sDefense;
    }

    public void setsDefense(int sDefense) {
        this.sDefense = sDefense;
    }
}
