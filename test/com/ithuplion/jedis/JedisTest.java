package com.ithuplion.jedis;

import org.junit.Test;

import redis.clients.jedis.Jedis;

public class JedisTest {
	//通过java程序访问redis数据库
	@Test
	public void testJedisSingle(){
		//1.设置ip地址和端口
		Jedis jedis=new Jedis("127.0.0.1",6379);
		//设置数据
		jedis.set("username", "ithuplion");
		//获得数据
		String name = jedis.get("name");
		System.out.println(name);
		//释放资源
		jedis.close();
	}
	@Test
	public void testJedis(){
		//获得连接对象
		Jedis jedis = new Jedis("127.0.0.1", 6379);
		//存数据
		jedis.set("username", "tom");
		//获取数据
		String username = jedis.get("username");
		System.out.println(username);
		//释放资源
		jedis.close();
	}
}
