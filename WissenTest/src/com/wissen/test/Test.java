package com.wissen.test;

import java.util.ArrayList;
import java.util.List;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args)
	{
		
		
		List<Integer> list =new ArrayList<>();
		list.add(213);
		list.add(122);
		list.add(344);
		
		Stream<Integer> stream=list.stream();
		
		System.out.println(stream.filter(x->x%2!=0).collect(Collectors.toList()));
	}
	
}
