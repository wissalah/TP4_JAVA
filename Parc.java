import java.io.*;

public class Parc {
    public static void main(String[] args) {
        Voiture v1 = Voiture.creerVoiture(2019, Carburant.GAZ);
        Camion c1 = new Camion(13.0, 2018, "E", 230000, 40.0, "MC1", Carburant.DIESEL);
        Autocar a1 = new Autocar(3.0, 2023, "u", 2530000, 50.0, "MA1", Carburant.GAZ);

        System.out.println(a1.toString());
        v1.addCarburant(30);
        v1.periodiciteVidange();
        System.out.println(v1.toString());

        c1.addCarburant(50);
        c1.periodiciteVidange();
        System.out.println(c1.toString());

        // Serialization
        try {
            FileOutputStream fo = new FileOutputStream("garage");
            ObjectOutputStream oo = new ObjectOutputStream(fo);
            oo.writeObject(v1);
            oo.writeObject(c1);
            oo.writeObject(a1);
            oo.close();
            fo.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
         // Deserialization
        /*
        try {
            FileInputStream fi = new FileInputStream("garage");
            ObjectInputStream oi = new ObjectInputStream(fi);

            Voiture voiture1 = (Voiture) oi.readObject();
            Camion camion1 = (Camion) oi.readObject();
            Autocar autocar1 = (Autocar) oi.readObject();

            oi.close();
            fi.close();

            System.out.println(voiture1.toString());
            System.out.println(camion1.toString());
            System.out.println(autocar1.toString());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        */
    }
}
