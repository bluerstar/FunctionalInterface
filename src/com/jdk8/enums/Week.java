package com.jdk8.enums;

public enum Week {
	
	SUNDAY("7","星期日"),
	MONDAY("1","星期一"),
	TUESDAY("2","星期二"),
	WEDNESDAY("3","星期三"),
	THURSDAY("4","星期四"),
	FRIDAY("5","星期五"),
	SATURDAY("6","星期六");
	
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
