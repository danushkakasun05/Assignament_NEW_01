package ArraySort;

public class arraySort {
    private int[] array;
    public arraySort(int[] ar){
        this.array=ar;
    }

    public int[] sort(){
        int x=0;
        int y=0;
        for (int i=0; i<this.array.length;i++){

            for (int j=i+1;j<this.array.length;j++){
                x= this.array[i];
                y=this.array[j];
                if (x>y){

                }
                else{
                    this.array[i]=y;
                    this.array[j]=x;
                }
            }
            }
        return this.array;
    }

}

