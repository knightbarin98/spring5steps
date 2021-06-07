package com.mrbarin.springcourse.basics.springin5steps.basic;


import javax.inject.Inject;
import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;

//Tell spring this class is a bean
@Named
//Use annotation scope to specify how we want the scope would be
//prototype for many instances, singleton just for one
//@Scope("prototype")
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImpl {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	//To tell this a dependency
	/*@Autowired
	private SortAlgorithm sortAlgorithm;*/
	
	
	//Qualifier multiple candidates
	@Inject
	@Qualifier("quick")
	private SortAlgorithm sortAlgorithm;
	
	//Wiring different components
	//Like this if we use the annotation @Primary
	
	/*@Autowired
	private SortAlgorithm sortAlgorithm;*/
	
	//Or like this to specify which component we want to use
	/*@Autowired
	private SortAlgorithm bubbleSortAlgorithm;*/
	
	
	//Ways to do autowiring, by method or constructor
	//Also you can leave it just like this
	
	/*@Autowired
	private SortAlgorithm sortAlgorithm;*/
	
	/*public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
		this.sortAlgorithm = sortAlgorithm;
	}*/
	
	/*public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}*/
	
	
	public int binarySearch(int[] numbers, int numberToSearchFor) {
		
		int [] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		
		return 3;
	}
	//Sorting an array
	//Search the array
	//Return result
	
	/*
	//life cycle
	//After create the bean
	@PostConstruct
	public void postConstruct() {
		logger.info("postConstruct");
	}
	
	//just before the bean is removed
	@PreDestroy
	public void preDestroy() {
		logger.info("preDestroy");
	}
	 */
}
