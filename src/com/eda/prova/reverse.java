package com.eda.prova;

public class reverse {

    /*
     * Esta função deve receber uma lista e retornar uma string com seu inverso.
     * Olhe o exemplo do main
     * Sua solução deve ser recursiva
     * Você não pode criar outro array
     * Você DEVE USAR a classe List na sua solução!!
     * 
     */
	
    public static void main(String[] args) {
        List list = new List(new int[] { 5, 4, 3, 2, 1 });
        String result = reverse(list);
        System.out.println(result); // 1, 2, 3, 4, 5
    }
    
    public static String reverse(List list) {
        String result = "";
        if (list.hasNext()) {
            int next = list.next();
            if (list.hasNext()) {
                result = reverse(list) + ", " + next;
            } else {
                result = "" + next;
            }
        }
        return result;
    }

    // NÃO MODIFIQUE
    public static class List {
        private int[] array;
        private int i;

        List(int[] array) {
            this.array = array;
            this.i = -1;
        }

        boolean hasNext() {
            return i != array.length - 1;
        }

        int next() {
            i++;
            return array[i];
        }
        
    } 

}
