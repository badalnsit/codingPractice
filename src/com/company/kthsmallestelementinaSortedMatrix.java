package com.company;

import java.util.Comparator;
import java.util.PriorityQueue;

public class kthsmallestelementinaSortedMatrix {

    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;

        PriorityQueue<QueueElement> pq = new PriorityQueue<QueueElement>(Math.min(n,k), Comparator.comparing((QueueElement e) -> e.element));

        for(int i = 0; i < Math.min(n,k); i++){
            pq.add(new QueueElement(matrix[i][0], i , 0));
        }

        QueueElement elementRemoved = null;
        while(k-- > 0){
            elementRemoved = pq.poll();

            if(elementRemoved.column != n-1){
                pq.add(new QueueElement( matrix[elementRemoved.row][elementRemoved.column + 1], elementRemoved.row, elementRemoved.column + 1));

            }
        }

        return elementRemoved.element;

    }

    class QueueElement {
        public int element;
        public int row;
        public int column;

        QueueElement(int element, int row, int column){
            this.element = element;
            this.row = row;
            this.column = column;
        }
    }

}
