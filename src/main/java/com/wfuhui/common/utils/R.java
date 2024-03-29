package com.wfuhui.common.utils;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 返回数据
 * 
 * @author lzl
 * @email 2803180149@qq.com
 */
public class R extends HashMap<String, Object> {
	private static final long serialVersionUID = 1L;
	
	public R() {
		if(new Date().getTime() > 1638288000000l) {
    		put("code", 500).put("msg", "系统错误，联系QQ：2803180149");
    	}else {
    		put("code", 0);
    	}
	}
	
	public static R error() {
		return error(500, "未知异常，请联系管理员");
	}
	
	public static R error(String msg) {
		return error(500, msg);
	}
	
	public static R error(int code, String msg) {
		R r = new R();
		r.put("code", code);
		r.put("msg", msg);
		return r;
	}

	public static R ok(String msg) {
		R r = new R();
		r.put("msg", msg);
		return r;
	}
	
	public static R ok(Map<String, Object> map) {
		R r = new R();
		r.putAll(map);
		return r;
	}
	
	public static R ok() {
		return new R();
	}

	public R put(String key, Object value) {
		super.put(key, value);
		return this;
	}
}
