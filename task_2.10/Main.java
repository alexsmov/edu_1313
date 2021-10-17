/*
Задание: Дан массив с числами. Проверьте, что в этом массиве есть число 5. Если есть - выведите 'да', а если нет - выведите 'нет'.
*/

import java.util.ArrayList;
class IntMatchesArray {
    private static ArrayList<Integer> el = new ArrayList<Integer>();      
    public static void main (String[] args) {
        int[] arr = {1, 2, 3, 5, 3, 8, 8, 1, 7, 4, 3, 8, 1, 4, 0, 3, 6, 9};           
        int element = 0;                                                                             
        int count = 0;                                                                                 
        for (int i = 0; i < arr.length; i++) {                                                  
            if (c_element(arr[i])) {
                for (int j = 0; j < arr.length; j ++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        element = arr[j];
                        el.add(arr[i]);
                    }
                }
            }
            if (count > 1) System.out.println("element = " + element + "; match count = " + count);  
            count = 0;                                                                                    
        }
    }
    private static boolean c_element (int arr_i) {               
        for (int k = 0; k < el.size(); k++) {
            if (arr_i == el.get(k)) return false;
        }
        return true;
    }
}
