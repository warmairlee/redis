package com;
import java.util.List;
import java.util.Set;
import java.util.Iterator;
import redis.clients.jedis.Jedis;

public class redistest {
	
	public static void main(String[] args) {
		
		Jedis jedis = new Jedis("localhost");
		
		/*
		jedis.set("string","字符串");
		System.out.println("string:"+jedis.get("string"));
		//list列表
		jedis.lpush("site-list", "a");
		jedis.lpush("site-list", "b");
		jedis.lpush("site-list", "c");
		jedis.lpush("site-list2","a2");
		jedis.lpush("site-list2","b2");
		
		List<String> list1 = jedis.lrange("site-list", 0, 2);
		List<String> list2 = jedis.lrange("site-list2", 0, 1);
		
		for(int i=0; i<list1.size(); i++){
			System.out.println("列表1:"+list1.get(i));
		}
		for(int i=0; i<list2.size(); i++){
			System.out.println("列表2:"+list2.get(i));
		}
		*/
		//删除数据
		jedis.del("id");
		//key实例,set<string>对象集合
		Set<String> keys = jedis.keys("*");
		Iterator<String> it = keys.iterator();
		while(it.hasNext()){//hasNext()判断游标右边是否有元素
			String key = it.next();//Object.ext()返回游标右边元素，移动游标到下一个位置
			System.out.println(key);
		}
		
		
	}

}
