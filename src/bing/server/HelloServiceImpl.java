package bing.server;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.jws.WebService;

import bing.server.bean.User;

import com.google.gson.Gson;

@WebService(endpointInterface = "bing.server.IHelloService", serviceName = "helloService")
public class HelloServiceImpl implements IHelloService {
	
	private static Gson gson = new Gson();

	@Override
	public String sayHello(String username) {
		return "hello," + username;
	}

	@Override
	public User getUser(User user) {
		User user1 = new User();
		user1 = user;
		user1.setAge(2000);
		return user1;
	}

	@Override
	public List<User> getUserList()

	{
		List<User> list = new ArrayList<User>();
		User user1 = new User("dsfsaflksfk", 343);
		User user2 = new User("fjlsdfjskl", 454);
		list.add(user1);
		list.add(user2);
		return list;
	}

	@Override
	public Map<Integer, User> getUserMap() {
		Map<Integer, User> map = new HashMap<Integer, User>();
		User user1 = new User("haha", 343);
		User user2 = new User("lala", 454);
		map.put(1, user1);
		map.put(2, user2);
		return map;
	}

	@Override
	public String getGsonUserMap() {
		Map<Integer, User> map = new HashMap<Integer, User>();
		User user1 = new User("haha", 343);
		User user2 = new User("lala", 454);
		map.put(1, user1);
		map.put(2, user2);
		return gson.toJson(map);
	}

}
