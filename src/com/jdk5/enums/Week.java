package com.jdk5.enums;

public enum Week {
	
	SUNDAY("7","星期日") {
		@Override
		public void print() {
			System.out.println(this.name() + this.getCode() + this.getDesc());
		}
	},
	
	MONDAY("1","星期一") {
		@Override
		public void print() {
			System.out.println(this.name() + this.getCode() + this.getDesc());
		}
	},
	
	TUESDAY("2","星期二") {
		@Override
		public void print() {
			System.out.println(this.name() + this.getCode() + this.getDesc());
		}
	},
	
	WEDNESDAY("3","星期三") {
		@Override
		public void print() {
			System.out.println(this.name() + this.getCode() + this.getDesc());
		}
	},
	
	THURSDAY("4","星期四") {
		@Override
		public void print() {
			System.out.println(this.name() + this.getCode() + this.getDesc());
		}
	},
	
	FRIDAY("5","星期五") {
		@Override
		public void print() {
			System.out.println(this.name() + this.getCode() + this.getDesc());
		}
	},
	
	SATURDAY("6","星期六") {
		@Override
		public void print() {
			System.out.println(this.name() + this.getCode() + this.getDesc());
		}
	};
	
	Week(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
	
	private String code;
	
    private String desc;
    
    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    public abstract void print();
}
