package com.example.demo.entity;

import com.example.demo.entity.request.ProductRequest;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Department {
private String name;
	public Department(ProductRequest d)
	{	this.name = d.getName();}

}
