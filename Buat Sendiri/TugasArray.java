public class TugasArray {
    public static void main(String[] args){
          int[][] bilanganGanjil = new int[5][2];
          int index = 0;
                
     for (int i = 1; i <= 20; i++) {
   if (i % 2 != 0) {
      bilanganGanjil[index / 2][index % 2] = i;
       index++;
    }                                                             
      }
    for (int i = 0; i < bilanganGanjil.length; i++) {
      for (int j = 0; j < bilanganGanjil[i].length; j++) {
   System.out.print(bilanganGanjil[i][j] + " ");
  }
   System.out.println();
      }
   }
 }
            

