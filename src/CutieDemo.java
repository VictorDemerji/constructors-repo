public class CutieDemo {
    public static void main(String[] args) {
        //declaram alocam si initializam obiecte ale clasei Cutie

        Cutie cutiaMea1 = new Cutie();
        Cutie cutiaMea2 = new Cutie();

        double volum;

        //returnam volumul primei cutii
        volum = cutiaMea1.volum();
        System.out.println("Volumu primei cutii este " + volum);

        //volum la a doua cutie
        volum = cutiaMea2.volum();
        System.out.println("Volumul la a doua cutie este " + volum);
    }
}
