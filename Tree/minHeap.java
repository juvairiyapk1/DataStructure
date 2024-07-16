package Tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class minHeap {
    List<Integer>heap=new ArrayList<>();
    public minHeap(){
    }
    public minHeap(List<Integer>array){
        buildHeap(array);
    }

    private void buildHeap(List<Integer> array) {
        heap=array;
        for (int i = parent(heap.size()-1); i >=0 ; i--) {
            shiftDown(i);
        }
    }

    private void shiftDown(int currentIndex) {
        int endIndex=heap.size()-1;
        int leftIndex=leftChild(currentIndex);
        while (leftIndex <= endIndex){
            int rightIndex=rightChild(currentIndex);
            int idxToShift;
            if (rightIndex <= endIndex && heap.get(rightIndex) < heap.get(leftIndex)){
                idxToShift=rightIndex;
            }else {
                idxToShift=leftIndex;
            }
            if (heap.get(currentIndex) > heap.get(idxToShift)){
                Collections.swap(heap,currentIndex,idxToShift);
                leftIndex=leftChild(currentIndex);
            }else {
                return;
            }
        }
    }

    private void shiftUp(int currentIndex){
        int parentIdx=parent(currentIndex);
        while (currentIndex > 0 && heap.get(parentIdx) > heap.get(currentIndex)){
            Collections.swap(heap,currentIndex,parentIdx);
            currentIndex=parentIdx;
            parentIdx=parent(currentIndex);
        }
    }

    public int peek(){
        return heap.get(0);
    }

    public void remove(){
        Collections.swap(heap,0,heap.size()-1);
        heap.remove(heap.size()-1);
        shiftDown(0);
    }

    public void insert(int value){
        heap.add(value);
        shiftUp(heap.size()-1);
    }
    private int parent(int i) {
        return (i-1)/2;
    }
    private int rightChild(int i) {
        return (2*i)+2;
    }

    private int leftChild(int i) {
        return (2*i)+1;
    }
    public void display(){
        for (int i = 0; i < heap.size(); i++) {
            System.out.println(heap.get(i));
        }
    }

    public static void main(String[] args) {
        List<Integer>array=new ArrayList<>(Arrays.asList(6,8,3,2,10));
        minHeap heap=new minHeap(array);
        heap.display();
        System.out.println("qqqqqqqqqqqqqqqq");
        heap.insert(4);
        heap.insert(3);
        heap.display();
        System.out.println("wwwwwwwwwwww");
        heap.remove();
        heap.display();
    }
}
