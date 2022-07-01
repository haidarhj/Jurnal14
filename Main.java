import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<Mahasiswa, Integer> mapper     = new HashMap<>();
        ArrayList<Mahasiswa> listMahasiswa = new ArrayList<>();

        // menambah data mahasiswa
        listMahasiswa.add(new Mahasiswa("6706213138", "Nisa", "05"));
        listMahasiswa.add(new Mahasiswa("6706213138", "Fauziyyah", "05"));
        listMahasiswa.add(new Mahasiswa("6706213138", "Handari", "05"));
        System.out.println(listMahasiswa);

        // menghapus data mahasiswa
        listMahasiswa.remove(2);
        System.out.println(listMahasiswa);

        // input nilai mahasiswa
        mapper.put(new Mahasiswa("6706213138", "Nisa", "05"), 90);
        mapper.put(new Mahasiswa("6706213138", "Fauziyyah", "05"), 95);

        Set<Mahasiswa> keyNilai = mapper.keySet();
        int total = 0;

        for (Mahasiswa mahasiswa : keyNilai) {
            int nilai = mapper.get(mahasiswa);
            total += nilai;
            System.out.println("[" + mahasiswa + ", " + nilai + "]");
        }

        // output rata - rata nilai mahasiswa
        int rata2 = total / listMahasiswa.size();
        System.out.println("Nilai rata - rata : " + rata2);

    }

}