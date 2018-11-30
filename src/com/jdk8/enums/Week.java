package com.jdk8.enums;

public enum Week {
	
	SUNDAY("7","������"),
	MONDAY("1","����һ"),
	TUESDAY("2","���ڶ�"),
	WEDNESDAY("3","������"),
	THURSDAY("4","������"),
	FRIDAY("5","������"),
	SATURDAY("6","������");
	
	Week(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
	
	private String code;
	
    private String desc;
    
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
