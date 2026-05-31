//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];
        l[0] = new Lutador("Pretty Boy","França",31,1.75,68.9,11,3,1);
        l[1] = new Lutador("Putscript","Brasil",29,1.68,57.8,14,2,3);
        l[2] = new Lutador("Snapshadow","Estados Unidos",35,1.80,83.5,12,5,2);
        l[3] = new Lutador("Dead Code","Canadá",27,1.73,69.2,9,1,0);
        l[4] = new Lutador("Iron Byte","Japão",33,1.77,75.4,18,4,1);
        l[5] = new Lutador("Night Fury","México",30,1.82,84.7,16,6,2);
        Luta UEFC = new Luta();
        UEFC.marcarLuta(l[0],l[3]);
        UEFC.lutar();

    }
}