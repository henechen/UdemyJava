package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int[] result = TwoSum(nums, 9 );
        System.out.println(Arrays.toString(result)); // returns [0, 1] indexes

        System.out.println(isPalindrome(121)); // returns true

        System.out.println(romanToInt("MDC")); // returns 1600

        String[] strs = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs));

        System.out.println(validParenthesis(" "));
    }
//    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//    You may assume that each input would have exactly one solution, and you may not use the same element twice.
//    You can return the answer in any order.
    public static int[] TwoSum(int[] nums, int target)
    {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++)
        {
            int complement = target - nums[i];
            if (numMap.containsKey(complement))
            {
                return new int[] {numMap.get(complement), i};
            }
            else
            {
                numMap.put(nums[i], i);
            }
        }
        return new int[] {};
    }

// ===========================================================================================================

//    Given an integer x, return true if x is palindrome integer.
//    An integer is a palindrome when it reads the same backward as forward.
//    For example, 121 is a palindrome while 123 is not.

    public static boolean isPalindrome(int x)
    {
        String intStr = String.valueOf((x));
        return intStr.equals(new StringBuilder(intStr).reverse().toString());
    }

// ===========================================================================================================
//Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
//
//            Symbol       Value
        //    I             1
        //    V             5
        //    X             10
        //    L             50
        //    C             100
        //    D             500
        //    M             1000
//    For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
//
//    Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
//
//    I can be placed before V (5) and X (10) to make 4 and 9.
//    X can be placed before L (50) and C (100) to make 40 and 90.
//    C can be placed before D (500) and M (1000) to make 400 and 900.
//    Given a roman numeral, convert it to an integer.

    public static int romanToInt(String s)
    {
        /*
         * HashMap é criado para fazer a tabela contendo os romandos e os inteiros
         */
        Map<Character, Integer> numbersMap = new HashMap<>();
        numbersMap.put('I', 1);
        numbersMap.put('V', 5);
        numbersMap.put('X', 10);
        numbersMap.put('L', 50);
        numbersMap.put('C', 100);
        numbersMap.put('D', 500);
        numbersMap.put('M', 1000);

        /*
        Resultado que será retornado no final do código, inciado com 0
         */
        int result = 0;

        /*
         * Criado um for que percorre o "array" criado com HashMap (É chamado no parâmetro)
         */
        for (int i = 0; i <s.length(); i++)
        {
            char ch = s.charAt(i);

            if (i > 0 && numbersMap.get(ch) > numbersMap.get(s.charAt(i - 1)))
            {
                result += numbersMap.get(ch) - 2 * numbersMap.get(s.charAt(i - 1));
            }
            else
            {
                result += numbersMap.get(ch);
            }
        }
        return result;
    }

// ===========================================================================================================

//    Write a function to find the longest common prefix string amongst an array of strings.
//    If there is no common prefix, return an empty string "".

    public static String longestCommonPrefix(String[] strs)
    {
        int size = strs.length;

        if (size == 0) return "";

        if (size == 1) return strs[0];

        // Em um array de números, o sort vai ordenar do menor para o maior, no caso de Strings tem que confirmar
        // no caso de Strings, ele irá ordenar por odem alfabética
        Arrays.sort(strs);

        // Procura o tamanho mínimo da primeira e a última ‘string’?
        // não entendi muito bem do porquê
        int end = Math.min(strs[0].length(), strs[size - 1].length());

        int i = 0;
        while (i < end && strs[0].charAt(i) == strs[size - 1].charAt(i))
        {
            i++;
        }
        return strs[0].substring(0, i);
    }


// ===========================================================================================================

//    Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
//    determine if the input string is valid.
//    An input string is valid if:
//    Open brackets must be closed by the same type of brackets.
//    Open brackets must be closed in the correct order.

    public static boolean validParenthesis(String s)
    {
        HashMap<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        Stack<Character> stack = new Stack<>();


        for (int i = 0; i < s.length(); i++)
        {
            char curr = s.charAt(i);

            if (map.keySet().contains(curr))
            {
                stack.push(curr);;
            }
            else if (map.containsValue(curr))
            {
                if (!stack.isEmpty() && map.get(stack.peek()) == curr)
                {
                    stack.pop();
                }
                else return false;
            }
        }
        return stack.empty();
    }
}
