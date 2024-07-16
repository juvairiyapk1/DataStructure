package Tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Example {
    List<Integer>heap=new ArrayList<>();
    public Example(List<Integer>array){
        buildHeap(array);
    }

    private void buildHeap(List<Integer> array) {
        heap=array;
        for (int i = parent(heap.size()-1); i > 0 ; i--) {
            heapfy(i);
        }
    }

    private void heapfy(int currentIndex) {
        int endIdx=heap.size()-1;
        int leftIdx=leftChild(currentIndex);
        while(leftIdx<=endIdx){
            int rightIndex=rightChild(currentIndex);
            int idxToShift;
            if (rightIndex < endIdx && heap.get(rightIndex)<heap.get(rightIndex)){
                idxToShift=rightIndex;
            }else {
                idxToShift=leftIdx;
            }
            if (heap.get(currentIndex) > heap.get(idxToShift)){
                Collections.swap(heap,currentIndex,idxToShift);
                leftIdx=leftChild(currentIndex);
            }else {
                return;
            }
        }
    }

    private int rightChild(int i) {
        return (2*i)+2;
    }

    private int leftChild(int i) {
        return (2*i)+1;
    }

    private int parent(int i) {
        return (i-1)/2;
    }
    for

    public static void main(String[] args) {
        List<Integer>array=new ArrayList<>(Arrays.asList(12, 11, 13, 5, 6, 7));
        Example minHeap=new Example(array);
    }

}

