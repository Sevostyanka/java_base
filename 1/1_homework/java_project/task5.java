/*Дан список. Выведите те его элементы, которые встречаются в списке только один раз. 
Элементы нужно выводить в том порядке, в котором они встречаются в списке. */

package java_project;

public class task5 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,3,3,2,4,6,6,5,7};
        
        int i = 0;
        while (i<arr.length){
            int count = 0;
            for (int j = 0; j< arr.length; j++) {
                if (arr[i]==arr[j]){count+=1;}
            }
            // System.out.printf("%d => %d раз; ", arr[i], count);
            if (count == 1){
                System.out.println(arr[i]);
            }
            i++;
        }
    }
}