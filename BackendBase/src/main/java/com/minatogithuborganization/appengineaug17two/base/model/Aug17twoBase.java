package com.minatogithuborganization.appengineaug17two.base.model;
import com.vs.rappit.base.model.BaseModel;
import com.vs.rappit.base.annotations.Table;
import com.vs.rappit.base.annotations.Searchable;


@Table(name="Aug17two", keys={"sid"})
public class Aug17twoBase extends BaseModel {

	@Searchable(index = true)
	private String fieldaug17two;

	public void setFieldaug17two(String fieldaug17two) {
		this.fieldaug17two = fieldaug17two;
	}

	public String getFieldaug17two() {
		return fieldaug17two;
	}



}