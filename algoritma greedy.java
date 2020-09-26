public class MyClass {
    public static void main(String args[]) {
      int jumlahuang = 5150000;
      int modulus = 0;
      int jumlahsisa;
      int[] uang = new int[8];
      uang[0] = 100000;
      uang[1] = 50000;
      uang[2] = 20000;
      uang[3] = 5000;
      uang[4] = 100;
      uang[5] = 50;
      uang[6] = 10;
      uang[7] = 1;
      int a=0,i=0;
      while(i<uang.length){
      modulus = (jumlahuang%uang[i])/uang[i];
      a = (jumlahuang/uang[i])-modulus;
      System.out.println("Jumlah Rp. "+uang[i]+" : "+a);
      jumlahuang = jumlahuang-(a*uang[i]);
      i++;
      }
    }
}