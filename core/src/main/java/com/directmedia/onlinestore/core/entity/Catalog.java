package com.directmedia.onlinestore.core.entity;

import java.util.HashSet;

public class Catalog {

    /**
     *
     */
    public static HashSet<Work> listOfWork = new HashSet<Work>();
    public static Work getWorkById(Long id) {
        return Catalog.listOfWork.stream().filter(w -> w.getId() == id).findFirst().get();
    }
}
