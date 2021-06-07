package com.mrbarin.springcourse.basics.springin5steps.basic;

import org.springframework.beans.factory.annotation.Qualifier;

import javax.inject.Named;

@Named
@Qualifier("quick")
public class QuickSortAlgorithm implements SortAlgorithm{
	
	public int[] sort(int [] numbers) {
		//Logic sort Q sort
		return numbers;
	}

}
