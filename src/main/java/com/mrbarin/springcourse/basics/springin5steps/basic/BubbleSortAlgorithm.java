package com.mrbarin.springcourse.basics.springin5steps.basic;

import org.springframework.beans.factory.annotation.Qualifier;

import javax.inject.Named;

@Named
@Qualifier("bubble")
public class BubbleSortAlgorithm implements SortAlgorithm{
	
	public int[] sort(int[] numbers) {
		return numbers;
	}
	
	

}
