package fifth_ex;
// +Реализовать алгоритм сортировки слиянием java

public class Programm {

    public static void main(String[] args) {
        MassiveFiller obj = new MassiveFiller();
        int massive[] = obj.RandomFiller();
        int length = massive.length;
        algoritm_merge.mergeSort(massive, length);
    }
}
