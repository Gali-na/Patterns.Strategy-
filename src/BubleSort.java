public class BubleSort implements  SortStrategy{
    @Override
    public void sortArry(int[] arry) {
        boolean conditionArr =false;
        while (!conditionArr) {
            conditionArr=true;
            for (int i = 0; i < arry.length - 1; i++) {
                if (arry[i] > arry[i + 1]) {
                    int temp = arry[i + 1];
                    arry[i + 1] = arry[i];
                    arry[i] = temp;
                    conditionArr=false;
                }
            }
        }
    }
}
