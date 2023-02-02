public class InsertionSort implements SortStrategy{
    @Override
    public void sortArry(int[] arry) {
        for (int i=0;i<arry.length;i++) {
            int j= i-1;
            int current = arry[i];
            while (j>=0 && current<arry[j]){
                arry[j+1]=arry[j];
                j--;
            }
            arry[j+1]=current;
        }
    }
}
