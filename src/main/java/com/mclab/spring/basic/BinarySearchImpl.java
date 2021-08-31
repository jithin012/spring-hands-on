package com.mclab.spring.basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * 
 * Handle Bean multiplication
 * 
 * 1. @Primary : most effcient
 * 
 * 2. @Qualifier : Auto-wiring by name 
 * 		Uses when some case needs one kind of bean and some time the other. 
 * 
 * 
 * Bean Scope : default - singleton
 * 
 * 1. singleton: One instance per spring context. @Scope("singleton") or @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON) 
 * 2. prototype: new bean whenever requested. @Scope("prototype") or @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
 * 3. request: One bean per http request
 * 4. session: One bean per http session
 * 
 */

@Service
@Component
public class BinarySearchImpl {
	
	@Autowired
	@Qualifier("quick")
	private SortAlgorithm sortAlgorithm;
	
//	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
//		this.sortAlgorithm = sortAlgorithm;
//	}
	
	public int binarySearch(int[] numbers, int numberToSearch) {
		
		return 3;
	}

	@PostConstruct
	public  void postConstruct() {
		System.out.println("As soon as this bean created by IOC Container, this function will call...");
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println("Pre destroy will call just before this bean removed...");
	}
//	public SortAlgorithm getSortAlgorithm() {
//		return sortAlgorithm;
//	}
//
//	public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
//		this.sortAlgorithm = sortAlgorithm;
//	}

}
