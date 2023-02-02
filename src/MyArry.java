public class MyArry {
    int [] arry;
    private SortStrategy sortStrategy;
    public void setSortStrategy(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public void setArry(int[] arry) {
        this.arry = arry;
    }

    public int[] getArry() {
        return arry;
    }

    void sort(){
        sortStrategy.sortArry(arry);
     }

}
