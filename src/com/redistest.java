package com;
import java.util.List;
import java.util.Set;
import java.util.Iterator;
import redis.clients.jedis.Jedis;

public class redistest {
	
	public static void main(String[] args) {
		
		Jedis jedis = new Jedis("localhost");
		
		/*
		jedis.set("string","�ַ���");
		System.out.println("string:"+jedis.get("string"));
		//list�б�
		jedis.lpush("site-list", "a");
		jedis.lpush("site-list", "b");
		jedis.lpush("site-list", "c");
		jedis.lpush("site-list2","a2");
		jedis.lpush("site-list2","b2");
		
		List<String> list1 = jedis.lrange("site-list", 0, 2);
		List<String> list2 = jedis.lrange("site-list2", 0, 1);
		
		for(int i=0; i<list1.size(); i++){
			System.out.println("�б�1:"+list1.get(i));
		}
		for(int i=0; i<list2.size(); i++){
			System.out.println("�б�2:"+list2.get(i));
		}
		*/
		//ɾ������
		jedis.del("id");
		//keyʵ��,set<string>���󼯺�
		Set<String> keys = jedis.keys("*");
		Iterator<String> it = keys.iterator();
		while(it.hasNext()){//hasNext()�ж��α��ұ��Ƿ���Ԫ��
			String key = it.next();//Object.ext()�����α��ұ�Ԫ�أ��ƶ��α굽��һ��λ��
			System.out.println(key);
		}
		
		
	}

}
