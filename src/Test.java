public class Test {

    public static void main(String[] args) {

        Mazda Mazda = new Mazda(true, "benzinovij", 260,7, 63, "bystro", true, "brown");

        System.out.println("Mazda is legkovaya? " + Mazda.isVid());
        System.out.println("Mazda tipdvigatelya " + Mazda.gettipdvigatelya());
        System.out.println("Mazda has " + Mazda.getnoOfLoshadSil() + " LoshadSil.");
        System.out.println("Mazda razgonyaetsya do sta km/chas za " + Mazda.getnoOfRazgonyaetsyaDoSta() + " sec.");
        System.out.println("Mazda tormozit na skorosti 60 km/chas primerno " + Mazda.getnoOfTormozit() + " metrov.");
        System.out.println("Mazda progrevaetsya " + Mazda.getprogrevaetsya());
        System.out.println("Pravda chto Mazda prodaetsya ne ochen trudno? " + Mazda.isprodaetsya());
        System.out.println("Mazda color is " + Mazda.getColor());

        System.out.println("----------");

        MAN MAN = new MAN (false, "benzinovij", 530, 11, 96, "medlenno", false,"White-and-black");
        System.out.println("MAN is legkovaya? " + MAN.isVid());
        System.out.println("MAN tipdvigatelya " + MAN.gettipdvigatelya());
        System.out.println("MAN has " + MAN.getnoOfLoshadSil() + " LoshadSil.");
        System.out.println("MAN razgonyaetsya do sta km/chas za " + MAN.getnoOfRazgonyaetsyaDoSta() + " sec.");
        System.out.println("MAN tormozit na skorosti 60 km/chas primerno " + MAN.getnoOfTormozit() + " metrov.");
        System.out.println("MAN progrevaetsya " + MAN.getprogrevaetsya());
        System.out.println("Pravda chto MAN prodaetsya ne ochen trudno? " + MAN.isprodaetsya());
        System.out.println("MAN color is " + MAN.getColor());

    }


}
