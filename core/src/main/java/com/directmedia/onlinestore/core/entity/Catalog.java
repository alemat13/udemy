package com.directmedia.onlinestore.core.entity;

import java.util.HashMap;
import java.util.Map;

public class Catalog {

    /**
     *
     */
    public static Map<Long, Work> listOfWork = new HashMap<Long, Work>();
    public static void addWork(Work work) {
        Catalog.listOfWork.put(work.getId(), work);
    }
}
