package com.cts.bean;

import java.util.List;


public class Pojoclass {


	private String styleGuideX;
	private String styleGuideY;
	private List<String> contains;
	private List<String> bottom;
	private List<String> top;
	private List<String> left;
	private List<String> right;
	private List<String> parent;
	private String text;
	private String width;
	private String height;

	private String elementName;


	CssStyles cssStyles;

	public Pojoclass(String styleGuideX, String styleGuideY,
			List<String> contains, List<String> bottom, List<String> top,
			List<String> left, List<String> right, List<String> parent,
			String text, String width, String height, String elementName) {
		super();
		this.styleGuideX = styleGuideX;
		this.styleGuideY = styleGuideY;
		this.contains = contains;
		this.bottom = bottom;
		this.top = top;
		this.left = left;
		this.right = right;
		this.parent = parent;
		this.text = text;
		this.width = width;
		this.height = height;
		this.elementName = elementName;
	}

	public Pojoclass()
	{

	}


	public String getStyleGuideX() {
		return styleGuideX;
	}




	public void setStyleGuideX(String styleGuideX) {
		this.styleGuideX = styleGuideX;
	}




	public String getStyleGuideY() {
		return styleGuideY;
	}




	public void setStyleGuideY(String styleGuideY) {
		this.styleGuideY = styleGuideY;
	}




	public List<String> getContains() {
		return contains;
	}




	public void setContains(List<String> contains) {
		this.contains = contains;
	}




	public List<String> getBottom() {
		return bottom;
	}




	public void setBottom(List<String> bottom) {
		this.bottom = bottom;
	}




	public List<String> getTop() {
		return top;
	}




	public void setTop(List<String> top) {
		this.top = top;
	}




	public List<String> getLeft() {
		return left;
	}




	public void setLeft(List<String> left) {
		this.left = left;
	}




	public List<String> getRight() {
		return right;
	}




	public void setRight(List<String> right) {
		this.right = right;
	}




	public List<String> getParent() {
		return parent;
	}




	public void setParent(List<String> parent) {
		this.parent = parent;
	}




	public String getText() {
		return text;
	}




	public void setText(String text) {
		this.text = text;
	}




	public String getWidth() {
		return width;
	}




	public void setWidth(String width) {
		this.width = width;
	}




	public String getHeight() {
		return height;
	}




	public void setHeight(String height) {
		this.height = height;
	}




	public String getElementName() {
		return elementName;
	}




	public void setElementName(String elementName) {
		this.elementName = elementName;
	}




	public String toString()
	{

		return(getElementName()+"\n PARENT "+getParent()+"\n HEIGHT "+getHeight()+"\n TEXT "+getText()+"\n CONTAINS "+getContains()+"\n\n");
	}



}
