public class TestSiswa {

    public static void main(String[] args) {
       
    encapsiswa siswa = new encapsiswa();
    siswa.setName("agus");
    siswa.setAge(20);
    siswa.setAddress("Malang");
    
        System.out.println("nama: "+siswa.getName()
        + " alamat "+siswa.getAddress()+ " berumur "+siswa.getAge()
        + " tahun");
    }
    
}
