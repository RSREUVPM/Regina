public class Mashiny {

    private boolean vid;
    private String tipdvigatelya;
    private int noOfLoshadSil;
    private int noOfKrutyashiymoment;
    private int noOfRazgonyaetsyaDoSta;
    private int noOfTormozit;
    private String stranaproizvoditel;
    private String progrevaetsya;
    private boolean prodaetsya;


    public Mashiny(boolean legkovayaorgruzovaya, String benzinovij, int LoshadSil, int Krutyashiymoment, int RazgonyaetsyaDoSta, int Tormozit, String bystroilimedlenno, String Ktovipuskaet boolean legkoilitrudno){
        this.vid = legkovayaorgruzovaya;
        this.tipdvigatelya = benzinovij;
        this.noOfLoshadSil = LoshadSil;
        this.noOfKrutyashiymoment = Krutyashiymoment;
        this.noOfRazgonyaetsyaDoSta = RazgonyaetsyaDoSta;
        this.noOfTormozit = Tormozit;
        this.progrevaetsya = bystroilimedlenno;
        this.stranaproizvoditel = Ktovipuskaet;
        this.prodaetsya = legkoilitrudno;
    }

    public boolean isVid() {
        return vid;
    }
    public void setvid(boolean vid) { this.vid = vid; }

    public String gettipdvigatelya() { return tipdvigatelya; }
    public void settipdvigatelya(String tipdvigatelya) {
        this.tipdvigatelya = tipdvigatelya;
    }

    public int getnoOfLoshadSil() {
        return noOfLoshadSil;
    }
    public void setnoOfLoshadSil(int noOfLoshadSil) { this.noOfLoshadSil = noOfLoshadSil; }

    public int getnoOfKrutyashiymoment() {
        return noOfKrutyashiymoment;
    }
    public void setnoOfKrutyashiymoment(int noOfKrutyashiymoment) { this.noOfKrutyashiymoment = noOfKrutyashiymoment; }

    public int getnoOfRazgonyaetsyaDoSta() {
        return noOfRazgonyaetsyaDoSta;
    }
    public void setnoOfRazgonyaetsyaDoSta(int noOfRazgonDoSta) { this.noOfRazgonyaetsyaDoSta = noOfRazgonyaetsyaDoSta; }

    public int getnoOfTormozit() {
        return noOfTormozit;
    }
    public void setnoOfTormozit(int noOfTormozit) { this.noOfTormozit = noOfTormozit; }

    public String getstranaproizvoditel() { return stranaproizvoditel; }
    public void setstranaproizvoditel(String stranaproizvoditel) {
        this.stranaproizvoditel = stranaproizvoditel;
    }

    public String getprogrevaetsya() {
        return progrevaetsya;
    }
    public void setprogrevaetsya(String progrevaetsya) {
        this.progrevaetsya = progrevaetsya;
    }

    public boolean isprodaetsya() {
        return prodaetsya;
    }
    public void setprodaetsya(boolean prodaetsya) {
        this.prodaetsya = prodaetsya;
    }

}