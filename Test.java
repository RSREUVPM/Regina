public class Test {

    public static void main(String[] args) {

        Mazda Mazda = new Mazda(true, "benzinovij", 260, 300, 7, 63, "Japonia", "bystro", true, "brown");

        System.out.println("Mazda is legkovaya? " + Mazda.isVid());
        System.out.println("Mazda tipdvigatelya " + Mazda.gettipdvigatelya());
        System.out.println("Mazda has " + Mazda.getnoOfLoshadSil() + " LoshadSil.");
        System.out.println("Mazda has " + Mazda.getnoOfKrutyashiymoment() + " H*m.");
        System.out.println("Mazda razgonyaetsya do sta km/chas za " + Mazda.getnoOfRazgonyaetsyaDoSta() + " sec.");
        System.out.println("Mazda tormozit na skorosti 60 km/chas primerno " + Mazda.getnoOfTormozit() + " metrov.");
        System.out.println("Kakaya strana proizvoditel Mazda?" + Mazda.getstranaproizvoditel());
        System.out.println("Mazda progrevaetsya " + Mazda.getprogrevaetsya());
        System.out.println("Pravda chto Mazda prodaetsya ne ochen trudno? " + Mazda.isprodaetsya());
        System.out.println("Mazda color is " + Mazda.getColor());

        System.out.println("----------");

        MAN MAN = new MAN (false, "benzinovij", 530, 2300, 11, 96, "Germania", "medlenno", false,"White-and-black");
        System.out.println("MAN is legkovaya? " + MAN.isVid());
        System.out.println("MAN tipdvigatelya " + MAN.gettipdvigatelya());
        System.out.println("MAN has " + MAN.getnoOfLoshadSil() + " LoshadSil.");
        System.out.println("MAN has " + MAN.getnoOfKrutyashiymoment() + " H*m.");
        System.out.println("MAN razgonyaetsya do sta km/chas za " + MAN.getnoOfRazgonyaetsyaDoSta() + " sec.");
        System.out.println("MAN tormozit na skorosti 60 km/chas primerno " + MAN.getnoOfTormozit() + " metrov.");
        System.out.println("Kakaya strana proizvoditel MAN?" + MAN.getstranaproizvoditel());
        System.out.println("MAN progrevaetsya " + MAN.getprogrevaetsya());
        System.out.println("Pravda chto MAN prodaetsya ne ochen trudno? " + MAN.isprodaetsya());
        System.out.println("MAN color is " + MAN.getColor());

        System.out.println("----------");

        Audi Audi = new Audi (true, "dizelnij", 290, 320, 6.8, 58, "Germania", "normal'no", false,"Blue");
        System.out.println("Audi is legkovaya? " + Audi.isVid());
        System.out.println("Audi tipdvigatelya " + Audi.gettipdvigatelya());
        System.out.println("Audi has " + Audi.getnoOfLoshadSil() + " LoshadSil.");
        System.out.println("Audi has " + Audi.getnoOfKrutyashiymoment() + " H*m.");
        System.out.println("Audi razgonyaetsya do sta km/chas za " + Audi.getnoOfRazgonyaetsyaDoSta() + " sec.");
        System.out.println("Audi tormozit na skorosti 60 km/chas primerno " + Audi.getnoOfTormozit() + " metrov.");
        System.out.println("Kakaya strana proizvoditel Audi?" + Audi.getstranaproizvoditel());
        System.out.println("Audi progrevaetsya " + Audi.getprogrevaetsya());
        System.out.println("Pravda chto Audi prodaetsya ne ochen trudno? " + Audi.isprodaetsya());
        System.out.println("Audi color is " + Audi.getColor());

        System.out.println("----------");

        Dodge Dodge = new Dodge (true, "benzinovij", 415, 580, 5, 53, "America", "medlenno", false,"Black");
        System.out.println("Dodge is legkovaya? " + Dodge.isVid());
        System.out.println("Dodge tipdvigatelya " + Dodge.gettipdvigatelya());
        System.out.println("Dodge has " + Dodge.getnoOfLoshadSil() + " LoshadSil.");
        System.out.println("Dodge has " + Dodge.getnoOfKrutyashiymoment() + " H*m.");
        System.out.println("Dodge razgonyaetsya do sta km/chas za " + Dodge.getnoOfRazgonyaetsyaDoSta() + " sec.");
        System.out.println("Dodge tormozit na skorosti 60 km/chas primerno " + Dodge.getnoOfTormozit() + " metrov.");
        System.out.println("Kakaya strana proizvoditel Dodge?" + Dodge.getstranaproizvoditel());
        System.out.println("Dodge progrevaetsya " + Dodge.getprogrevaetsya());
        System.out.println("Pravda chto Dodge prodaetsya ne ochen trudno? " + Dodge.isprodaetsya());
        System.out.println("Dodge color is " + Dodge.getColor());

        System.out.println("----------");

        ZIL ZIL = new ZIL (false, "benzinovij", 150, 2000, 13, 102, "Russia",  "medlenno", false,"Grey");
        System.out.println("ZIL is legkovaya? " + ZIL.isVid());
        System.out.println("ZIL tipdvigatelya " + ZIL.gettipdvigatelya());
        System.out.println("ZIL has " + ZIL.getnoOfLoshadSil() + " LoshadSil.");
        System.out.println("ZIL has " + ZIL.getnoOfKrutyashiymoment() + " H*m.");
        System.out.println("ZIL razgonyaetsya do sta km/chas za " + ZIL.getnoOfRazgonyaetsyaDoSta() + " sec.");
        System.out.println("ZIL tormozit na skorosti 60 km/chas primerno " + ZIL.getnoOfTormozit() + " metrov.");
        System.out.println("Kakaya strana proizvoditel ZIL?" + ZIL.getstranaproizvoditel());
        System.out.println("ZIL progrevaetsya " + ZIL.getprogrevaetsya());
        System.out.println("Pravda chto ZIL prodaetsya ne ochen trudno? " + ZIL.isprodaetsya());
        System.out.println("ZIL color is " + ZIL.getColor());
    }


}
