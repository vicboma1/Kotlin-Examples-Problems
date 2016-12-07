/*
 * Your task is to implement the indexOfMax() function so that it returns
 * the index of the largest element in the array, or null if the array is empty.
 */

fun _indexOfMax(a: IntArray): Int? { 
        var maxIndex = 0
            for(elem in a.indices){
            val newElem = a[elem]
            if (newElem >= a[maxIndex]){
                 maxIndex = elem; 
            }
        }
        return maxIndex
    }
    return  if(a.size != 0) _indexOfMax(a) else null
