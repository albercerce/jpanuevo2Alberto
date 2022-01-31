import Entity.Seguro;

import java.sql.Timestamp;
import java.time.Instant;

public class Main {

    public static void main(String[] args) {

        SeguroDAO seguro = new SeguroDAO();
        Timestamp fechaactual = Timestamp.from(Instant.now());
        Seguro seg = new Seguro(1, "53765976-A","Alberto", "Pedregal", "Sáez",
                28, 0, "N", '0', fechaactual, "Coche");
        Seguro seg1 = new Seguro("53765977-G","Antonio", "Pedregal", "Sáez",
                27, 0, "N", '0', fechaactual, "Moto");

        System.out.println("------ INSERTAR ------");
        seguro.insertar(seg);
        seguro.insertar(seg1);

        System.out.println("------ ACTUALIZAR ------");
        seguro.actualizar("Toño", 0);

        System.out.println("------ LEER ------");
        seguro.leer(1);

        System.out.println("------ BORRAR ------");
        seguro.borrar(seg1);
    }
}
