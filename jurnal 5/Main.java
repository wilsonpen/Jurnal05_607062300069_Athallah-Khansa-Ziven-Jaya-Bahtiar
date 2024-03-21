import java.util.*;

public class Main {
    public static void main(String[] args) {
        MyQueue<String> todo = new MyQueue<>();
        Scanner input = new Scanner(System.in);

        
        int pilihan;

        while(true){
            System.out.println("1. Tambah Tugas");
            System.out.println("2. Hapus Tugas");
            System.out.println("3. Tampilkan List Tugas");
            System.out.println("4. Keluar");
            System.out.println();
            System.out.print("Masukan Pilihan : ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukan Nama Tugas : ");
                    String namaMatkul = input.nextLine();
                    System.out.println();
    
                    todo.addTugas(namaMatkul);
                    break;
                
                case 2:
                    String value = todo.removeTugas();
                    System.out.println("Tugas " + value + " sudah dihapus dari list");
                    System.out.println();
                    break;
    
                case 3:
                    System.out.println("Tampilkan tugas? prioritas[1], semua[2]");
                    int pilihanTampil = input.nextInt();
                    System.out.println();
    
                    switch (pilihanTampil) {
                        case 1:
                            todo.printFirstTodo();
                            break;
    
                        case 2:
                            todo.displayToDo();
                            break;
                        default:
                            break;
                    }
    
                    break;
                
                case 4:
                    System.out.println("Sistem dihentikan");
                    System.exit(0);
                    break;
    
                default:
                    break;
            }
        }
        
    }
}