package com.domaranskiy.family.io;

import com.domaranskiy.family.FamilyObject.Family;
import com.domaranskiy.family.NobleTitles;

import java.util.HashMap;
import java.util.Map;

public class InitFamily {
    public Map<Integer, Family> init() {
        Family one = new Family("Iv", 15, NobleTitles.BARON, "Барон");
        Family two = new Family("Pe", 10, NobleTitles.DUC, "Герцог");
        Family three = new Family("Av", 18, NobleTitles.COMTE, "Граф");
        Family four = new Family("De", 20, NobleTitles.MARQUIS, "Маркіз");
        Family five = new Family("Cr", 22, NobleTitles.GRAND_DUC, "Верикий Герцог");
        Family six = new Family("Fx", 2, NobleTitles.PRINCE, "Принц");
        Family seven = new Family("Tf", 30, NobleTitles.SEIGNEUR, "Сеньор");
        Family eight = new Family("Rh", 4, NobleTitles.VICOMTE, "Віконт");
        Family nine = new Family("Hj", 7, NobleTitles.PRINCE_DU_SANG_ROYAL, "Князь імператорської крові");
        Family ten = new Family("Yu", 15, NobleTitles.SEIGNEUR, "Сеньор");

        Map<Integer, Family> map = new HashMap<>();
        map.put(1, one);
        map.put(2, two);
        map.put(3, three);
        map.put(4, four);
        map.put(5, five);
        map.put(6, six);
        map.put(7, seven);
        map.put(8, eight);
        map.put(9, nine);
        map.put(10, ten);
        return map;
    }
}