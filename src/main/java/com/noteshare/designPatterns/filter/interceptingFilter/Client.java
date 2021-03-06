package com.noteshare.designPatterns.filter.interceptingFilter;

/**
 * 创建客户端 Client
 */
public class Client {
	FilterManager filterManager;

	public void setFilterManager(FilterManager filterManager) {
		this.filterManager = filterManager;
	}

	public void sendRequest(String request) {
		filterManager.filterRequest(request);
	}
}
