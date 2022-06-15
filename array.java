public class array public class Main {
    public static void main(String[] args) {

        int[] arrayInteger = {82,12,41,38,19,26,9,48,20,55,8,32,3};

        int [] arrayGanjil = angkaGanjil(arrayInteger);
        int [] arrayTiga = kelipatanTiga(arrayInteger);
        printArray(arrayInteger,"Menampilkan semua nilai dalam array = ");
        printArray(arrayGanjil, "Angka ganjil = ");
        printArray(arrayTiga, "Angka Kelipatan Tiga = ");

    }
    public static int[] angkaGanjil(int []ganjil){
        int [] arrayGanjil = new int [ganjil.length];
        for (int i = 0; i < ganjil.length; i++){
            if(ganjil[i] % 2 != 0){
                arrayGanjil[i] = ganjil[i];
            }
        } return arrayGanjil;
    }

    public static int[] kelipatanTiga(int []tiga){
        int [] arrayTiga = new int[tiga.length];
        for (int i = 0; i < tiga.length; i++){
            if (tiga[i] % 3 == 0){
                arrayTiga[i] = tiga[i];
            }
        } return arrayTiga;

    }{
}
