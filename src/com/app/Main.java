package com.app;

import java.util.ArrayList;


class MusicGroup
{
    ArrayList<String> musicgroup = new ArrayList<>();

    public void addtogroup(String type)
    {
        musicgroup.add(type);
    }

    public void show()
    {
        for (String mg: musicgroup)
        {
            System.out.println(mg);
        }
    }
}

abstract class MusicGroupBuilder
{
    public abstract MusicGroup getGroup();
    public abstract void buildGroup();
}

class SongGroup extends MusicGroupBuilder{

    private MusicGroup musicGroup = new MusicGroup();

    @Override
    public void buildGroup()
    {
        musicGroup.addtogroup("Song group");
    }

    @Override
    public MusicGroup getGroup() {
        return musicGroup;
    }
}

class DanseGroup extends MusicGroupBuilder{

    private MusicGroup musicGroup = new MusicGroup();

    @Override
    public void buildGroup()
    {
        musicGroup.addtogroup("Dance group");
    }

    @Override
    public MusicGroup getGroup() {
        return musicGroup;
    }
}

class MixedGroup extends MusicGroupBuilder{

    private MusicGroup musicGroup = new MusicGroup();

    @Override
    public void buildGroup()
    {
        musicGroup.addtogroup("Song and Danse group");
    }

    @Override
    public MusicGroup getGroup() {
        return musicGroup;
    }
}

class Director {

    public static MusicGroup construct(MusicGroupBuilder builder){
        builder.buildGroup();
        return builder.getGroup();
    }
}

public class Main {
    public static void main(String[] args) {
        MusicGroupBuilder songgroup = new SongGroup();
        MusicGroupBuilder dansegroup = new DanseGroup();
        MusicGroupBuilder mixedgroup = new MixedGroup();
        MusicGroup SG = Director.construct(songgroup);
        MusicGroup DG = Director.construct(dansegroup);
        MusicGroup MG = Director.construct(mixedgroup);
        SG.show();
        DG.show();
        MG.show();
    }
}
