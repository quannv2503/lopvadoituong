package donghobamgio;

public class Test {
    public static void main(String[] args) {
        StopWatch stopWatch=new StopWatch();
        int[] array=new int[10000];
        for (int i = 0; i <array.length ; i++) {
            array[i]= (int) (Math.random()*10000);
        }
        stopWatch.start(System.currentTimeMillis());
        for (int i = 0; i <array.length-1 ; i++) {
            for (int j = i+1; j <array.length ; j++) {
                if(array[i]>array[j]){
                    int o=0;
                    o=array[i];
                    array[i]=array[j];
                    array[j]=o;
                }
            }
        }
        stopWatch.stop(System.currentTimeMillis());
        System.out.println("thời gian:"+stopWatch.getElapsedTime());
    }
}
