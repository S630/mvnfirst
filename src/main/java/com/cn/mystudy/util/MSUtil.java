package com.cn.mystudy.util;

import javax.servlet.http.HttpServletRequest;

import com.cn.mystudy.dao.IUmsUtilDao;
import com.cn.mystudy.model.LoginInfo;
import com.mysql.jdbc.StringUtils;

public class MSUtil {
	private IUmsUtilDao uimsUtilDao;

	public void write_to_logininfo(LoginInfo loginInfo) {
		try {
			uimsUtilDao.insert_loginInfo(loginInfo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static String getIp(HttpServletRequest request) {
		String remoteAddr = request.getRemoteAddr();
		String forwarded = request.getHeader("X-Forwarded-For");
		String realIp = request.getHeader("X-Real-IP");

		String ip = null;
		if (realIp == null) {
			if (forwarded == null) {
				ip = remoteAddr;
			} else {
				ip = remoteAddr + "/" + forwarded;
			}
		} else {
			if (realIp.equals(forwarded)) {
				ip = realIp;
			} else {
				ip = realIp + "/" + forwarded.replaceAll(", " + realIp, "");
			}
		}
		return ip;
	}

	public static String getIp2(HttpServletRequest request) {
		String ip = request.getHeader("X-Forwarded-For");
		if (!StringUtils.isNullOrEmpty(ip) && !"unKnown".equalsIgnoreCase(ip)) {
			// 多次反向代理后会有多个ip值，第一个ip才是真实ip
			int index = ip.indexOf(",");
			if (index != -1) {
				return ip.substring(0, index);
			} else {
				return ip;
			}
		}
		ip = request.getHeader("X-Real-IP");
		if (!StringUtils.isNullOrEmpty(ip) && !"unKnown".equalsIgnoreCase(ip)) {
			return ip;
		}
		return request.getRemoteAddr();
	}

}
