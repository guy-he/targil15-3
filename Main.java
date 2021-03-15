package com.company;

import com.company.arkia.Boing747;
import com.company.hardware.Engine;

import java.lang.module.FindException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {


    private static void startMusicShow(Player player){
        player.play();
        if (player instanceof PianoPlayer){
            System.out.println("piano player");
            PianoPlayer pianoPlayer = (PianoPlayer)player;
            pianoPlayer.playJazz();
        }

        else System.out.println("guitar player");
        GuitarPlayer guitarPlayer = (GuitarPlayer)player;
        guitarPlayer.rockNroll();


    }
    private static void repairDevice(ElectricDevice device){
        if ( device.worksOnBatteries = true){
            device.insertNewBatteries();
        }
        if (device.isFaulty = false){
            return;
        }
        device.fixDevice();
        if (device instanceof Television){
            System.out.println(((Television) device).screenSize);
        }
        if (device instanceof Cellphone){
            System.out.println(((Cellphone) device).brand);
        }
        System.out.println("fixing is done");

    }
    public static void IdentifyTeacher(Teacher type){
       if (type instanceof MathTeacher){
           System.out.println(" is a math teacher");
           MathTeacher mt = (MathTeacher)type;
           System.out.println(mt.math_skills);
       }
       if (type instanceof HistoryTeacher){
           System.out.println(" is a history teacher");
           HistoryTeacher ht = (HistoryTeacher)type;
           System.out.println(ht.field_of_profession);
       }
       else {
           System.out.println("unknown");
       }
    }



    public static void main(String[] args) {

       Teacher teacher = new MathTeacher("suzan", 012, 7);
       Teacher teacher1 = new HistoryTeacher("idan", 125, "civil war");


       ElectricDevice tv = new Television(false, 55);
       ElectricDevice cellphone = new Cellphone(true, "onePlus");


       IPlayer guitar = new GuitarPlayer("Guy", "metal");
       IPlayer piano = new PianoPlayer("mozzart", "classic");


        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(7);
        numbers.add(9);
        System.out.println(numbers);
        System.out.println(numbers.get(0));
        numbers.remove(1);
        System.out.println(numbers);
        System.out.println(numbers.indexOf(9));


    }
    }













































