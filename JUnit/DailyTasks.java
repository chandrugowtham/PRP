package com.wipro.task;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class DailyTasks {
public String StringConcat(String s1,String s2)
{
	return s1+""+s2;
}
public int[] sortValues(int arr[]) {
	Arrays.sort(arr);
	return arr;
}
public boolean checkPresence(String str,String a) {
	return str.contains(a);
}
}
