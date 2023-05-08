import java.io.IOException;
import java.util.logging.*;

public class task2 {
    public static void main(String[] args) {
        try {
            Logger logger = Logger.getLogger(task2.class.getName());
            FileHandler fh = new FileHandler("logger.log"); 
            logger.addHandler(fh);
            SimpleFormatter sFormat = new SimpleFormatter();
            fh.setFormatter(sFormat);   
            logger.setUseParentHandlers(false);
            logger.log(Level.INFO, "Начало логирования");
            
        } catch(IOException ex) {
            ex.printStackTrace();
        }
        
    }
}

class BubbleSort {
    void bubbleSort(int arr[])
    {
        int a = arr.length;
        for (int i = 0; i < a - 1; i++)
            for (int j = 0; j < a - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    main(arr);
                }
    }
 
    void printArray(int arr[])
    {
        int a = arr.length;
        for (int i = 0; i < a; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(int[] arr2)
    {
        BubbleSort swap = new BubbleSort();
        int [] arr = {12, 6, 4, 1, 15, 10};
        swap.bubbleSort(arr);
        swap.printArray(arr);
    }

}
