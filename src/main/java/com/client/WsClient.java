/**
 * 
 */
/**
 * @author xiaodi
 *
 */
package com.client;

import com.cn.ServiceImpl;
import com.cn.ServiceImplService;

class WsClient{
	
		
	public static void main(String[] args) {
		ServiceImplService fack = new ServiceImplService();
		ServiceImpl impl = fack.getServiceImplPort();
		System.out.println(impl.setHello("xd"));
	}
}