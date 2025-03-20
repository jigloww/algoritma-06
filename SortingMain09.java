public class SortingMain09 {
    public static void main(String[] args) {

        int a[] = {20, 10, 2, 7, 12};
        int b[] = {30, 20, 2, 8, 14};
    
        Sorting09 dataurut1 = new Sorting09(a, a.length);
        Sorting09 dataurut2 = new Sorting09(b, b.length);

        System.out.println("Data Awal 1");
        dataurut1.tampil();
        dataurut1.bubbleSort();
        System.out.println("Data sudah diurutkan dengan BUBBLE SORT (ASC)");
        dataurut1.tampil();
        System.out.println();

        System.out.println("Data Awal 2");
        dataurut2.tampil();
        dataurut2.SelectionSort();
        System.out.println("Data sudah diurutkan dengan SELECTION SORT (ASC)");
        dataurut2.tampil();
    }

    
}
