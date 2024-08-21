import java.util.Scanner;

public class DriveGuru {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("id : ");
        int id = in.nextInt();
        System.out.println("Nama");
        String nama= in.nextLine();
        System.out.println("Ipk : ");
        double ipk = in.nextDouble();

        System.out.println("");
        //membuat obyek
        Guru buFeni = new Guru();
        Guru pakAndre = new Guru();
        Guru pakGuntur = new Guru();
        buFeni.id =10;
        buFeni.nama ="feniliya";               
        buFeni.mapel ="Matematika";
        buFeni.alamat ="Malang"; 
        System.out.println("Ini data buFeni");
        System.out.println(buFeni.id);
        System.out.println(buFeni.nama);
        System.out.println(buFeni.mapel);
        System.out.println(buFeni.alamat);

        pakAndre.id =30;
        pakAndre.nama ="Andre";
        pakAndre.mapel ="bahasa inggris";
        pakAndre.alamat ="Malang"; 
        System.out.println("Ini data pakAndre");
        System.out.println(pakAndre.id);
        System.out.println(pakAndre.nama);
        System.out.println(pakAndre.mapel);
        System.out.println(pakAndre.alamat);

        pakGuntur.id =40;
        pakGuntur.nama ="Guntur";
        pakGuntur.mapel ="sejarah";
        pakGuntur.alamat ="kalimantan"; 
        System.out.println("Ini data pakGuntur");
        System.out.println(pakGuntur.id);
        System.out.println(pakGuntur.nama);
        System.out.println(pakGuntur.mapel);
        2System.out.println(pakGuntur.alamat);

    }

}

