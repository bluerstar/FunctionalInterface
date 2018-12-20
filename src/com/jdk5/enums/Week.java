package com.jdk5.enums;

public enum Week {
	
	SUNDAY("7","������") {
		@Override
		public void print() {
			System.out.println(this.name() + this.getCode() + this.getDesc());
		}
	},
	
	MONDAY("1","����һ") {
		@Override
		public void print() {
			System.out.println(this.name() + this.getCode() + this.getDesc());
		}
	},
	
	TUESDAY("2","���ڶ�") {
		@Override
		public void print() {
			System.out.println(this.name() + this.getCode() + this.getDesc());
		}
	},
	
	WEDNESDAY("3","������") {
		@Override
		public void print() {
			System.out.println(this.name() + this.getCode() + this.getDesc());
		}
	},
	
	THURSDAY("4","������") {
		@Override
		public void print() {
			System.out.println(this.name() + this.getCode() + this.getDesc());
		}
	},
	
	FRIDAY("5","������") {
		@Override
		public void print() {
			System.out.println(this.name() + this.getCode() + this.getDesc());
		}
	},
	
	SATURDAY("6","������") {
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
