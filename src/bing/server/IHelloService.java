package bing.server;

import java.util.List;
import java.util.Map;

import javax.jws.WebMethod;
import javax.jws.WebService;

import bing.server.bean.User;

@WebService
public interface IHelloService {
	//获取一个字符串
	@WebMethod(operationName = "sayHello")
	public String sayHello(String username);
	//获取user对象。自己创建一个user类
	@WebMethod(operationName = "getUser")
	public User getUser(User user);
	//获取list接口里面封装User对象
	@WebMethod(operationName = "getUserList")
	public List<User> getUserList();
	//返回map接口里面封装User对象
	@WebMethod(operationName = "getUserMap")
	public Map<Integer,User> getUserMap();
	//返回json字符串
	@WebMethod(operationName = "getGsonUserMap")
	public String getGsonUserMap();
}
