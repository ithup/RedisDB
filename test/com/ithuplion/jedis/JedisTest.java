package com.ithuplion.jedis;

import org.junit.Test;

import redis.clients.jedis.Jedis;

public class JedisTest {
	//ͨ��java�������redis���ݿ�
	@Test
	public void testJedisSingle(){
		//1.����ip��ַ�Ͷ˿�
		Jedis jedis=new Jedis("127.0.0.1",6379);
		//��������
		jedis.set("username", "ithuplion");
		//�������
		String name = jedis.get("name");
		System.out.println(name);
		//�ͷ���Դ
		jedis.close();
	}
	@Test
	public void testJedis(){
		//������Ӷ���
		Jedis jedis = new Jedis("127.0.0.1", 6379);
		//������
		jedis.set("username", "tom");
		//��ȡ����
		String username = jedis.get("username");
		System.out.println(username);
		//�ͷ���Դ
		jedis.close();
	}
}