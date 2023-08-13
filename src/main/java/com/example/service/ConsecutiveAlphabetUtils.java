package com.example.service;

import org.apache.commons.lang3.StringUtils;

import java.util.regex.Pattern;

/**
 * @Author: WenBin Guo
 * 13-08-2023
 * @Version: 1.0
 */
public class ConsecutiveAlphabetUtils {
    public static final String REGEX = "([a-z])\\1\\1+";
    public static final Pattern PATTERN = Pattern.compile(REGEX);
    public static String removeConsecutiveAlphabet(String input){
        boolean isNeedRemove = PATTERN.matcher(input).find();
        if(StringUtils.isBlank(input)&&!isNeedRemove){
            return input;
        }
        while (PATTERN.matcher(input).find()){
            input = input.replaceAll(REGEX,"");
        }
        return input;
    }
    public static String replaceWithALessAlphabet(String input){
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i<input.length()){
            int j = 3;
            while (i+j<=input.length()&&String.valueOf(input.charAt(i)).repeat(j).equals(input.substring(i,i+j))){
                j++;
            }
            if(String.valueOf(input.charAt(i)).repeat(j).equals(input)){
                char replacedChar = (char)(input.charAt(i)-1);
                if(replacedChar!=96){
                    sb.append(replacedChar);
                    return sb.toString();
                }
                return "";
            }
            j--;
            if(j>=3){
                char replacedChar = (char)(input.charAt(i)-1);
                if(replacedChar!=96){
                    sb.append(replacedChar);
                }
                i+=j;
            }else {
                sb.append(input.charAt(i));
                i++;
            }
        }
        if(sb.toString().length()==input.length()){
            return sb.toString();
        }else {
            return replaceWithALessAlphabet(sb.toString());
        }
    }
}
