public class Main {


    public static void main(String[] args) {
//        Задача: Написать программу, которая из имеющегося массива строк формирует новый массив из строк,
//        длина которых меньше, либо равна 3 символам. Первоначальный массив можно ввести с клавиатуры,
//        либо задать на старте выполнения
//        алгоритма. При решении не рекомендуется пользоваться коллекциями, лучше обойтись исключительно массивами.

//        [“Hello”, “2”, “world”, “:-)”] → [“2”, “:-)”]
//        [“1234”, “1567”, “-2”, “computer science”] → [“-2”]
//        [“Russia”, “Denmark”, “Kazan”] → []


        String[] arr = {"Hello", "2", "world", ":-)"};
        findWordsLength(arr);
        String[] arr1 = {"1234", "1567", "-2", "computer science"};
        findWordsLength(arr1);
        String [] arr2={"Russia", "Denmark", "Kazan"};
        findWordsLength(arr2);


    }
    public static void findWordsLength(String []array){
        for (String i : array) {
            char[] charArray = i.toCharArray();
            if(charArray.length<=3)
                System.out.println(i);
        }
    }

}