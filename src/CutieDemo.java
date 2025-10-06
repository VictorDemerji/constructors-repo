public class CutieDemo {
    public static void main(String[] args) {

        Cutie cutiaMea1 = new Cutie();
        Cutie cutiaMea2 = new Cutie();

        double volum;

        //return first box volume
        volum = cutiaMea1.volum();
        System.out.println("Volumu primei cutii este " + volum);

        //volume of the second box
        volum = cutiaMea2.volum();
        System.out.println("Volumul la a doua cutie este " + volum);
    }
}
