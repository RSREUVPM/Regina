public class MAN extends Mashiny{

    private String color;

    public MAN(boolean legkovayaorgruzovaya, String benzinovij, int LoshadSil, int Krutyashiymoment, int RazgonyaetsyaDoSta, int Tormozit, String bystroilimedlenno, String Ktovipuskaet, boolean legkoilitrudno) {
        super(legkovayaorgruzovaya, benzinovij, LoshadSil, Krutyashiymoment, RazgonyaetsyaDoSta, Tormozit, bystroilimedlenno, Ktovipuskaet, legkoilitrudno);
        this.color="White-and-black";
    }

    public MAN(boolean legkovayaorgruzovaya, String benzinovij, int LoshadSil, int Krutyashiymoment, int RazgonyaetsyaDoSta, int Tormozit, String bystroilimedlenno, String Ktovipuskaet, boolean legkoilitrudno, String color){
        super(legkovayaorgruzovaya, benzinovij, LoshadSil, Krutyashiymoment, RazgonyaetsyaDoSta, Tormozit, bystroilimedlenno, Ktovipuskaet, legkoilitrudno);
        this.color=color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}