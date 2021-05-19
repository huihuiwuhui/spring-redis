package com.itcv.demo.rpc.main;


import com.itcv.demo.rpc.server.RpcServer;
import com.itcv.demo.rpc.service.HelloService;
import com.itcv.demo.rpc.service.impl.HelloServiceImpl;

public class ServerMain {
	
	public static void main(String[] args) {
		 HelloService helloService = new HelloServiceImpl();
         RpcServer server = new RpcServer();
	     server.register(helloService, 50001);  	
	}
    
}
