package com.cts.bean;

import com.google.gson.annotations.SerializedName;

public class CssStyles {

	private String color;
	@SerializedName("font-family")
	private String fontfamily;
	@SerializedName("font-size")
	private String fontsize;
	@SerializedName("font-stretch")
	private String fontstretch;
	@SerializedName("font-style")
	private String fontstyle;
	@SerializedName("font-weight")
	private String fontweight;
	@SerializedName("letter-spacing")
	private String letterspacing;
	private String height;
	@SerializedName("line-height")
	private String lineheight;


	public CssStyles()
	{}

	public String getBackgroundimage() {
		return backgroundimage;
	}

	public void setBackgroundimage(String backgroundimage) {
		this.backgroundimage = backgroundimage;
	}

	public String getBorderradius() {
		return borderradius;
	}

	public void setBorderradius(String borderradius) {
		this.borderradius = borderradius;
	}

	public String getBorder() {
		return border;
	}

	public void setBorder(String border) {
		this.border = border;
	}

	public String getBackgroundcolor() {
		return backgroundcolor;
	}

	public void setBackgroundcolor(String backgroundcolor) {
		this.backgroundcolor = backgroundcolor;
	}

	public String getBoxshadow() {
		return boxshadow;
	}

	public void setBoxshadow(String boxshadow) {
		this.boxshadow = boxshadow;
	}
	@SerializedName("text-align")
	private String textalign;
	private String width;
	@SerializedName("background-image")
	private String backgroundimage;
	@SerializedName("border-radius")
	private String borderradius;
	private String border;
	@SerializedName("background-color")
	private String backgroundcolor;
	@SerializedName("box-shadow")
	private String boxshadow;






	public CssStyles(String color, String fontfamily, String fontsize,
			String fontstretch, String fontstyle, String fontweight,
			String letterspacing, String height, String lineheight,
			String textalign, String width, String backgroundimage,
			String borderradius, String border, String backgroundcolor,
			String boxshadow) {
		super();
		this.color = color;
		this.fontfamily = fontfamily;
		this.fontsize = fontsize;
		this.fontstretch = fontstretch;
		this.fontstyle = fontstyle;
		this.fontweight = fontweight;
		this.letterspacing = letterspacing;
		this.height = height;
		this.lineheight = lineheight;
		this.textalign = textalign;
		this.width = width;
		this.backgroundimage = backgroundimage;
		this.borderradius = borderradius;
		this.border = border;
		this.backgroundcolor = backgroundcolor;
		this.boxshadow = boxshadow;
	}

	public String getTextalign() {
		return textalign;
	}
	public void setTextalign(String textalign) {
		this.textalign = textalign;
	}
	public String getWidth() {
		return width;
	}
	public void setWidth(String width) {
		this.width = width;
	}

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getFontfamily() {
		return fontfamily;
	}
	public void setFontfamily(String fontfamily) {
		this.fontfamily = fontfamily;
	}
	public String getFontsize() {
		return fontsize;
	}
	public void setFontsize(String fontsize) {
		this.fontsize = fontsize;
	}
	public String getFontstretch() {
		return fontstretch;
	}
	public void setFontstretch(String fontstretch) {
		this.fontstretch = fontstretch;
	}
	public String getFontstyle() {
		return fontstyle;
	}
	public void setFontstyle(String fontstyle) {
		this.fontstyle = fontstyle;
	}
	public String getFontweight() {
		return fontweight;
	}
	public void setFontweight(String fontweight) {
		this.fontweight = fontweight;
	}
	public String getLetterspacing() {
		return letterspacing;
	}
	public void setLetterspacing(String letterspacing) {
		this.letterspacing = letterspacing;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getLineheight() {
		return lineheight;
	}
	public void setLineheight(String lineheight) {
		this.lineheight = lineheight;
	}


}
