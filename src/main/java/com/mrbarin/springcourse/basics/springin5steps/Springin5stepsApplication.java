package com.mrbarin.springcourse.basics.springin5steps;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.mrbarin.springcourse.basics.springin5steps.basic.BinarySearchImpl;

@Configuration
@ComponentScan("com.mrbarin.springcourse.basics.springin5steps")
public class Springin5stepsApplication {
		
		//Spring IOC container create the instances of the bean including its destruction
		//Spring Inversion Of Control
		//It manage the autowiring
		
	
		//What are the beans?
		//What are the dependencies of a bean?
		//Where to search from beans?
		

		public static void main(String[] args) {
			//BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
			//BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
			
			//System.out.println(result);
			
			//Spring Context manage all the beans
			try(AnnotationConfigApplicationContext applicationContext
					= new AnnotationConfigApplicationContext(SpringIn5StepsApplicationScope.class)) {

				//By default a bean is a singleton, it will be the same instance every time we ask for it.
				BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
				BinarySearchImpl binarySearch2 = applicationContext.getBean(BinarySearchImpl.class);
				System.out.println(binarySearch);
				System.out.println(binarySearch2);
				int result = binarySearch.binarySearch(new int[]{12, 4, 6}, 3);
				System.out.println(result);
			}
		}

}
