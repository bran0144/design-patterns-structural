package com.pluralsight.composite;

//Components represent part or whole of structure
//Objects are composed into tree structures
//Operations can be applied to individual or composites
//Components are either leaf or composite (composite knows about its child objects)
//leaf implements all of the components methods
//composite has children (and methods to manipulate those children)
//Typically delegates method implementation to its children
//Good for menus and hierarchies
//Can make things overly simplified
//Difficult to restrict (not compile time saftely)
//Unity between objects
//Generalizes a hierarchical structure

import java.util.HashMap;
import java.util.Map;

public class CompositeDemo {
    public static void main (String[] args) {
        Map<String, String> personAttributes = new HashMap<>();
        personAttributes.put("site_role", "person");
        personAttributes.put("access_role", "limited");

        Map<String, String> groupAttributes = new HashMap<>();
        groupAttributes.put("group_role", "claims");

        Map<String, String> secAttributes = new HashMap<>();
        secAttributes.putAll(personAttributes);
        secAttributes.putAll(groupAttributes);
        System.out.println(secAttributes);
    }
}
