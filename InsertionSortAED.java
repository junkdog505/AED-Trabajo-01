class InsertionSort{
  public static <T extends Comparable<T>> void insertionSort (T[] lista, int tamanio) {
    int contador1, contador2;
    T temp;
    for (contador1 = 1; contador1 < tamanio; contador1++){
      temp = lista[contador1];
      for (contador2 = contador1; contador2 > 0 && lista[contador2 - 1].compareTo(temp) > 0; contador2--){
        lista[contador2] = lista[contador2 - 1];
      }
      lista[contador2] = temp;
    }
  }
}
 
public class InsertionSortAED{
  public static void main (String[] args){
    String arr[] = {"HOLA", "SOY", "HOMERO","CHINO"};
    InsertionSort.insertionSort(arr, arr.length);
    System.out.println("Array ordenado:: ");
    for(String i : arr){
      System.out.println(i);
    }
  }
}