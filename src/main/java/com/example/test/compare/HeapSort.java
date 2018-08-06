package com.example.test.compare;

/**
 * 堆排序
 * @author chen.zhangchao
 * @date 2018/7/11 0011
 */
public class HeapSort {

    private int[] buildMaxHeap(int[] array){
        for(int i=(array.length-2)/2;i>=0;i--){
            adjustDownToUp(array, i,array.length);
        }
        return array;
    }

    private void adjustDownToUp(int[] array,int k ,  int length){
        int temp = array[k];
        for(int i = 2*k + 1 ; i < length - 1; i = 2*i+1){
            if(i<length && array[i]<array[i+1]){
                i ++ ;
            }
            if(temp >= array[i]){
                break;
            }else{
                array[k] = array[i];
                k=i;
            }
        }
        array[k] = temp;
    }

}
