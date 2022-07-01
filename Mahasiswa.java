import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Mahasiswa {

    private String NIM;
    private String nama;
    private String kelas;

    public Mahasiswa(String NIM, String nama, String kelas) {
        this.NIM = NIM;
        this.nama = nama;
        this.kelas = kelas;
    }

    public String getNIM() {
        return NIM;
    }

    public String getNama() {
        return nama;
    }

    public String getKelas() {
        return kelas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mahasiswa)) return false;
        Mahasiswa mahasiswa = (Mahasiswa) o;
        return NIM.equals(mahasiswa.NIM) && nama.equals(mahasiswa.nama) && kelas.equals(mahasiswa.kelas);
    }

    @Override
    public int hashCode() {
        int MULTIPLIER  = 20;
        int h1  = NIM.hashCode();
        int h2  = nama.hashCode();
        int h3  = kelas.hashCode();
        int h   = MULTIPLIER * h1 + h2 + h3;
        return h;
    }

    @Override
    public String toString() {

        return "Mahasiswa " +
                "NIM =" + NIM +
                ", nama = " + nama +
                ", kelas= " + kelas  +
                " ";
    }
}

