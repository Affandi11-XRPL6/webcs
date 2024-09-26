public class PenjumlahanArray {
    public static void main(String[] args) {
        
    //   int[][] MatA = {{4,2},{3,1}};
    //   int [][] MatB = {{1,1},{1,1}};

    //   for(int baris = 0; baris < MatA.length; baris++){
    //     for(int kolom = 0; kolom < MatB.length; kolom++){
    //         System.out.print((MatA[baris][kolom] + MatB[baris][kolom] + "\t"));
    //     }
    //     System.out.println("");
    //   }
        
    //     int[][] MatA = {{7,3},{2,1}};
    //   int [][] MatB = {{4,2},{1,0}};

    //   for(int baris = 0; baris < MatA.length; baris++){
    //     for(int kolom = 0; kolom < MatB.length; kolom++){
    //         System.out.print((MatA[baris][kolom] - MatB[baris][kolom] + "\t"));
    //     }
    //     System.out.println("");

        int[][] MatA = {{4,10},{5,2}};
        int [][] MatB = {{7,3},{2,5}};
    for(int baris = 0; baris < MatA.length; baris++){
        for(int kolom = 0; kolom < MatB.length; kolom++){
            System.out.print((MatA[baris][kolom] - MatB[baris][kolom] + "\t"));
        }
        System.out.println("");
    }
}
}