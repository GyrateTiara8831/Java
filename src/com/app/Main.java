package com.app;

import java.util.ArrayList;

class MusicGroup{
    public ArrayList<String> group = new ArrayList<String>();

    public void AddTo(String tgroup){
        group.add(tgroup);
    }

    public void Out(){
        for (String mg: group){
            System.out.println(mg);
    }
}

public abstract class GroupBuilder{
    public abstract MusicGroup getGroup();
    public abstract void buildSong();
    public abstract void buildDance();
    public abstract void buildCustm
}


public class Main {
    public static void main(String[] args) {

    }
}
