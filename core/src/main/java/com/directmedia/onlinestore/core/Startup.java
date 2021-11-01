package com.directmedia.onlinestore.core;

import com.directmedia.onlinestore.core.entity.Artist;
import com.directmedia.onlinestore.core.entity.Catalog;
import com.directmedia.onlinestore.core.entity.Work;

public class Startup {

    public static void main(String... args) {
        if (Catalog.listOfWork.isEmpty()) {
            Artist ledzep = new Artist();
            ledzep.setName("Led Zeppelin");
            Artist ffd = new Artist();
            ffd.setName("Fat Freddy's Drop");

            Work sth = new Work();
//        sth.setId(1);
            sth.setGenre("Rock");
            sth.setMainArtist(ledzep);
            sth.setSummary("The best song in the World");
            sth.setRelease(1971);
            sth.setTitle("Stairway to Heaven");
            Catalog.listOfWork.add(sth);

            Work sibly = new Work();
//        sibly.setId(2);
            sibly.setGenre("Rock");
            sibly.setMainArtist(ledzep);
            sibly.setSummary("My favourite song of Led Zeppelin");
            sibly.setRelease(1970);
            sibly.setTitle("Since I've Been Loving You");
            Catalog.listOfWork.add(sibly);

            Work ernie = new Work();
//        ernie.setId(3);
            ernie.setGenre("Reggae");
            ernie.setMainArtist(ffd);
            ernie.setSummary("A very popular song from FFD");
            ernie.setRelease(2005);
            ernie.setTitle("Ernie");
            Catalog.listOfWork.add(ernie);

            Catalog.listOfWork.forEach(w -> {
                System.out.println(w.getTitle() + " (" + w.getRelease() + ")");
            });
        }
    }
}
