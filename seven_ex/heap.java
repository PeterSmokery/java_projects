package seven_ex;

public class heap {
    /**
     * класс содеражщий в себе логику пирамидальной сортировки
     * Для сортировки вызывается статический метод sort(int[] a)
     */
    class HeapSort {

        private static int heapSize;

        /**
         * Сортировка пирамидальным алгоритмом(кучным алгоритмом)
         */
        public static void sort(int[] a) {
            buildHeap(a);
            while (heapSize > 1) {
                swap(a, 0, heapSize - 1);
                heapSize--;
                heapify(a, 0);
            }
        }

        /**
         * Построение кучи.
         */
        private static void buildHeap(int[] a) {
            heapSize = a.length;
            for (int i = a.length / 2; i >= 0; i--) {
                heapify(a, i);
            }
        }

        /**
         * Переупорядочивает поддерево кучи начиная с узла i так, чтобы выполнялось
         * основное свойство кучи - a[parent] >= a[child].
         */
        private static void heapify(int[] a, int i) {
            int l = left(i);
            int r = right(i);
            int largest = i;
            if (l < heapSize && a[i] < a[l]) {
                largest = l;
            }
            if (r < heapSize && a[largest] < a[r]) {
                largest = r;
            }
            if (i != largest) {
                swap(a, i, largest);
                heapify(a, largest);
            }
        }

        /**
         * Возвращает индекс правого потомка текущего узла
         */
        private static int right(int i) {
            return 2 * i + 2;
        }

        /**
         * Возвращает индекс левого потомка текущего узла
         */
        private static int left(int i) {
            return 2 * i + 1;
        }

        /**
         * Меняет местами два элемента в массиве
         */
        private static void swap(int[] a, int i, int j) {
            int changer = a[i];
            a[i] = a[j];
            a[j] = changer;
        }

    }
}
