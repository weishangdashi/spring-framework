package com.imooc.pattern.eventmode;

import org.springframework.core.ResolvableType;

import java.util.HashMap;
import java.util.List;

public class ResolvableDemo {

	private HashMap<String, List<Integer>>customizedMap;


	public static void main(String[] args) throws NoSuchFieldException {
		ResolvableType resolvableType=ResolvableType.forField(ResolvableDemo.class.getDeclaredField("customizedMap"));
		System.out.println("resolvable.getGeneric(0):"+resolvableType.getGeneric(0).resolve());
		System.out.println("resolvable.getGeneric(1):"+resolvableType.getGeneric(1).resolve());

		System.out.println("resolvable.getGeneric(1):"+resolvableType.getGeneric(1));

		System.out.println("resolvable.getSuperType():"+resolvableType.getSuperType());

		System.out.println("resolvable.asMap():"+resolvableType.asMap());


	}
}
