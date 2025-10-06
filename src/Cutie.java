public class Cutie {
    double latime;
    double inaltime;
    double adancime;

    Cutie() {
        System.out.println("Constructia obiectului Cutie");
        latime = 10;
        inaltime = 10;
        adancime = 10;
    }

    double volum() {
        return latime*inaltime*adancime;
    }
}
