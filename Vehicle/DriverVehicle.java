package Vehicle;

import java.util.Scanner;

public class DriverVehicle {
    private static int hargaAwal;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("numWheels : ");
        int numWheels = in.nextInt();
        System.out.println("price : ");
        double price = in.nextDouble();

        System.out.println("Pilih 1.Car atau 2.Bicycle");
        int pilihan = in.nextInt();


        if(pilihan == 1) {
            System.out.println("numDoors");
            int numDoors = in.nextInt();
            System.out.println("isElectric");
            boolean isElectric = in.nextBoolean();
            System.out.println("roofType");
            String roofType = in.nextLine();
            in.nextLine();

        }else if (pilihan == 2) {
            System.out.println("bikeType");
            String bikeType = in.nextLine();
            in.nextLine();
        }
        System.out.println("pilih 1. Diskon ataupilih 2. tidak");
        int Diskon = in.nextInt();

        if(Diskon == 1) {
            System.out.println("berapa persen diskon");
            int Persen = in.nextInt();
            System.out.println("harga awal");
            int hargaAwal = in.nextInt();
            in.nextLine();
            for (int i = 1; i >=Diskon; i--) {
                System.out.println("masukkan diskon");
                Diskon = in.nextInt();
            
            }

        }else if (Diskon == 2) {
            System.out.println();       
        
        }

        Diskon = hargaAwal/Diskon;
        System.out.println("harga awal "+hargaAwal);
        System.out.println("Diskon "+Diskon);
        

    }
}
