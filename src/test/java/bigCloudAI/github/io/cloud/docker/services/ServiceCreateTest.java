package bigCloudAI.github.io.cloud.docker.services;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import net.sf.json.JSONObject;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ServiceCreateTest {

	@Autowired
	ServiceCreate serviceCreate;
	
	@Test
	public void test() {
		JSONObject s = serviceCreate.create().name("serName3").image("192.168.80.41:5000/redis:3.0-alpine")
				/* .env("env") */.mount("a:b").port(82, 8080)
				/* .network("19udrlao4rec") */.mode("Replicated").replicas(2).send("192.168.80.200:2375");
		System.out.println(s);
	}
}
